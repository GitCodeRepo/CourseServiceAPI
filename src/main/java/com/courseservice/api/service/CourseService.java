package com.courseservice.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.courseservice.api.exception.ResourceNotFoundException;
import com.courseservice.api.model.Course;
import com.courseservice.api.repository.CourseRepository;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;

	public Optional<Course> getCourseById(String courseId) {
		return courseRepository.findById(courseId);
	}

	public List<Course> getCourses() {
		return courseRepository.findAll();
	}

	public Course saveCourse(Course course) {
		return courseRepository.insert(course);
	}

	public List<Course> saveMultipleCourses(List<Course> courses) {
		return courseRepository.insert(courses);
	}

	public void deleteCourseById(String courseId) {
		Optional<Course> course = courseRepository.findById(courseId);
		if (course.isPresent())
			courseRepository.delete(course.get());
		else
			throw new ResourceNotFoundException("Course not found with ID : " + courseId);

	}

	public void deleteAllCourses() {
		courseRepository.deleteAll();
	}

}
