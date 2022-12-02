package com.example.courseapi.controllers;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.courseapi.models.CourseModel;
import com.example.courseapi.services.CourseService;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;
    private final String PATH = "/courses";
    
    @RequestMapping(method=RequestMethod.GET, value=PATH)
    public ArrayList<CourseModel> getCourses() {
        return courseService.getCourses();
    }

    @RequestMapping(method=RequestMethod.GET, value=PATH + "/{id}")
    public CourseModel getCourse(@PathVariable int id) {
        return courseService.getCourse(id);
    }

    @RequestMapping(method=RequestMethod.POST, value=PATH)
    public void setCourse(@RequestBody CourseModel topic) {
        courseService.setCourse(topic);
    }

    @RequestMapping(method=RequestMethod.PUT, value=PATH + "/update/{id}")
    public void updateCourse(@RequestBody CourseModel topic, @PathVariable int id) {
        courseService.updateCourse(id, topic);
    }

    @RequestMapping(method=RequestMethod.DELETE, value=PATH + "/delete/{id}")
    public void deleteCourse(@PathVariable int id) {
        courseService.deleteCourse(id);
    }
}
