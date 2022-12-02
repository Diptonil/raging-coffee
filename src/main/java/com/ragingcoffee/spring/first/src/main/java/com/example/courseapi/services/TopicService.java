package com.example.courseapi.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.courseapi.models.TopicModel;
import com.example.courseapi.repositories.TopicRepository;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    public ArrayList<TopicModel> getTopics() {
        ArrayList<TopicModel> list = new ArrayList<>(); 

        for (TopicModel topic : topicRepository.findAll()) {
            list.add(topic);
        }

        return list;
    }

    public TopicModel getTopic(int id) {
        return topicRepository.findById(id).orElse(null);
    }

    public void setTopic(TopicModel topic) {
        topicRepository.save(topic);
    }

    public void updateTopic(int id, TopicModel topic) {
        topicRepository.save(topic);
    }

    public void deleteTopic(int id) {
        topicRepository.deleteById(id);
    }
}
