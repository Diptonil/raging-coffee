package com.example.courseapi.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.courseapi.models.CourseModel;

@Repository
public interface CourseRepository extends CrudRepository<CourseModel, Integer> {}