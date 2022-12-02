package com.example.courseapi.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.courseapi.models.CourseModel;
import com.example.courseapi.repositories.CourseRepository;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public ArrayList<CourseModel> getCourses() {
        ArrayList<CourseModel> list = new ArrayList<>(); 

        for (CourseModel topic : courseRepository.findAll()) {
            list.add(topic);
        }

        return list;
    }

    public CourseModel getCourse(int id) {
        return courseRepository.findById(id).orElse(null);
    }

    public void setCourse(CourseModel topic) {
        courseRepository.save(topic);
    }

    public void updateCourse(int id, CourseModel topic) {
        courseRepository.save(topic);
    }

    public void deleteCourse(int id) {
        courseRepository.deleteById(id);
    }
}
