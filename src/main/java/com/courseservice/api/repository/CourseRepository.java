package com.courseservice.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.courseservice.api.model.Course;

public interface CourseRepository extends MongoRepository<Course, String> {

}
