package com.example.first.controller;

import java.util.ArrayList;
import com.example.first.model.Task;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ListTaskController {
    
    @RequestMapping("/task/list")
    public ArrayList<Task> respond() {
        Task taskOne = new Task(1, "Study", "Java Spring Framework");
        Task taskTwo = new Task(2, "Sleep", "Sleep for four hours per day.");
        Task taskThree = new Task(3, "Eat", "Dine with steak and red wine.");
        ArrayList<Task> list = new ArrayList<>();

        list.add(taskOne);
        list.add(taskTwo);
        list.add(taskThree);

        return list;
    }
}
