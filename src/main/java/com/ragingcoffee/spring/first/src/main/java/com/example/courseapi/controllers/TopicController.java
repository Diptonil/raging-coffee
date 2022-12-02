package com.example.courseapi.controllers;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.courseapi.models.TopicModel;
import com.example.courseapi.services.TopicService;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;
    private final String PATH = "/topics";
    
    @RequestMapping(method=RequestMethod.GET, value=PATH)
    public ArrayList<TopicModel> getTopics() {
        return topicService.getTopics();
    }

    @RequestMapping(method=RequestMethod.GET, value=PATH + "/{id}")
    public TopicModel getTopic(@PathVariable int id) {
        return topicService.getTopic(id);
    }

    @RequestMapping(method=RequestMethod.POST, value=PATH)
    public void setTopic(@RequestBody TopicModel topic) {
        topicService.setTopic(topic);
    }

    @RequestMapping(method=RequestMethod.PUT, value=PATH + "/update/{id}")
    public void updateTopics(@RequestBody TopicModel topic, @PathVariable int id) {
        topicService.updateTopic(id, topic);
    }

    @RequestMapping(method=RequestMethod.DELETE, value=PATH + "/delete/{id}")
    public void deleteTopics(@PathVariable int id) {
        topicService.deleteTopic(id);
    }
}
