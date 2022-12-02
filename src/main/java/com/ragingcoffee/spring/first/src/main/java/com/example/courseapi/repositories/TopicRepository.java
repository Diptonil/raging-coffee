package com.example.courseapi.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.courseapi.models.TopicModel;

@Repository
public interface TopicRepository extends CrudRepository<TopicModel, Integer> {}
