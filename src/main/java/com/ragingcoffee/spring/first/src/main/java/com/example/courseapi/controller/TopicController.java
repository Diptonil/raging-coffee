package com.example.courseapi.controller;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.courseapi.model.Topic;
import com.example.courseapi.service.TopicService;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicsService;
    private final String PATH = "/topics";
    
    @RequestMapping(PATH)
    public ArrayList<Topic> respond() {
        return topicsService.getTopics();
    }
}
