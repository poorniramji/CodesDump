package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class CourceModel {

	private String courseName;
	
	@Id
	private int courseId;
	private String courseDescription;
	
	
	//Empty constructor is created so that it easier to initailize withput parameters
	public CourceModel() {
		
	}
	
	public CourceModel(String courseName, int courseId, String courseDescription) {
		super();
		this.courseName = courseName;
		this.courseId = courseId;
		this.courseDescription = courseDescription;
	}
	
	
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseDescription() {
		return courseDescription;
	}
	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}

}
