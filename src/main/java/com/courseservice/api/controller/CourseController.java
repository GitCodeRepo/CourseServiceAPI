package com.courseservice.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.courseservice.api.model.Course;
import com.courseservice.api.service.CourseService;

@RestController
@CrossOrigin
@RequestMapping("/course-service")
public class CourseController {
	@Autowired
	private CourseService courseService;

	@GetMapping("/getCourseById/{id}")
	public Optional<Course> getCourseById(@PathVariable String id) {
		return courseService.getCourseById(id);
	}

	@GetMapping("/getAllCourses")
	public List<Course> getCourses() {
		return courseService.getCourses();
	}

	@PostMapping("/addCourse")
	public Course createCourse(@RequestBody Course course) {
		return courseService.saveCourse(course);
	}

	@PostMapping("/addMultipleCourses")
	public List<Course> addMultipleCourses(@RequestBody List<Course> courses) {
		return courseService.saveMultipleCourses(courses);
	}

	@DeleteMapping("/deleteCourseById/id")
	public void deleteCourse(@PathVariable String id) {
		courseService.deleteCourseById(id);
	}

	@DeleteMapping("/deleteAllCourses")
	public void deleteAllCourses() {
		courseService.deleteAllCourses();
	}
}
