package com.nlu.domain;

import com.nlu.model.CourseModel;

public class Course {
	
	public static CourseModel createCourse (String courseName, String courseCode, String professor,
			String room, String timeSlot, String daySlot) {
	
	CourseModel cm = new CourseModel();
	cm.setCourseCode(courseCode);
	cm.setCourseName(courseName);
	cm.setProfessor(professor);
	cm.setRoom(room);
	cm.setTimeSlot(timeSlot);
	cm.setDaySlot(daySlot);
	
	return cm;
	
	}
}
