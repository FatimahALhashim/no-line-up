package com.nlu.model;

public class CourseModel {

	private String courseName;
	private String courseCode;
	private String professor;
	private String room;
	private String timeSlot;
	private String daySlot;
	
	public CourseModel() {
		super();
	}
	
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public String getCourseName() {
		return this.courseName;
	}
	
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	
	public String getCourseCode() {
		return this.courseCode;
	}
	
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	
	public String getProfessor() {
		return this.professor;
	}

	public void setRoom(String room) {
		this.room = room;
	}
	
	public String getRoom() {
		return this.room;
	}

	public void setTimeSlot(String timeSlot) {
		this.timeSlot = timeSlot;
	}
	
	public String getTimeSlot() {
		return this.timeSlot;
	}
	
	public void setDaySlot(String daySlot) {
		this.daySlot = daySlot;
	}
	
	public String getDaySlot() {
		return this.daySlot;
	}
}