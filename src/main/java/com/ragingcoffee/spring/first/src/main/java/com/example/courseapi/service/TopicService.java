package com.example.courseapi.service;

import java.util.ArrayList;
import com.example.courseapi.model.Topic;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

    Topic taskOne = new Topic(1, "Study", "Java Spring Framework");
    Topic taskTwo = new Topic(2, "Sleep", "Sleep for four hours per day.");
    Topic taskThree = new Topic(3, "Eat", "Dine with steak and red wine.");
    ArrayList<Topic> list = new ArrayList<>();

    public ArrayList<Topic> getTopics() {
        list.add(taskOne);
        list.add(taskTwo);
        list.add(taskThree);

        return list;
    }
}
