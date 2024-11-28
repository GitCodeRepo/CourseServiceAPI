package com.courseservice.api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "course")
public class Course {
	@Id
	private String courseId;
	private String courseCategory;
	private String courseTitle;
	private String courseImgSrc;
	private String courseLink;
	private String courseDescription;
	private String coursePrice;

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getCourseCategory() {
		return courseCategory;
	}

	public void setCourseCategory(String courseCategory) {
		this.courseCategory = courseCategory;
	}

	public String getCourseTitle() {
		return courseTitle;
	}

	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}

	public String getCourseImgSrc() {
		return courseImgSrc;
	}

	public void setCourseImgSrc(String courseImgSrc) {
		this.courseImgSrc = courseImgSrc;
	}

	public String getCourseLink() {
		return courseLink;
	}

	public void setCourseLink(String courseLink) {
		this.courseLink = courseLink;
	}

	public String getCourseDescription() {
		return courseDescription;
	}

	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}

	public String getCoursePrice() {
		return coursePrice;
	}

	public void setCoursePrice(String coursePrice) {
		this.coursePrice = coursePrice;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseCategory=" + courseCategory + ", courseTitle=" + courseTitle
				+ ", courseImgSrc=" + courseImgSrc + ", courseLink=" + courseLink + ", courseDescription="
				+ courseDescription + ", coursePrice=" + coursePrice + "]";
	}

}
