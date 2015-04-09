package com.nlu.controller;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;
import com.nlu.connector.Connector;
import com.nlu.domain.Course;
import com.nlu.model.CourseModel;

public class AddCourse {

	public void AddCourseTemp(String courseName, String courseCode,
			String professor, String room, String timeSlot, String daySlot) {

		Connection con = null;
		CourseModel cm = new CourseModel();
		cm = Course.createCourse(courseName, courseCode, professor, room,
				timeSlot, daySlot);

		Statement statement = null;
		con = Connector.getConnection();

		try {
			statement = (Statement) con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// reg is a value 0 or 1 where if it is 0 the course should be added to
		// the timetable or the temporary timetable

		try {
			statement
					.executeUpdate("INSERT INTO TimeTable_Database "
							+ "VALUES (courseCode, courseName, professor, room, timeSlot, daySlot)");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void addCourseTT(String courseName, String courseCode,
			String professor, String room, String timeSlot, String daySlot) {
		Connection con = null;
		CourseModel cm = new CourseModel();
		cm = Course.createCourse(courseName, courseCode, professor, room,
				timeSlot, daySlot);

		Statement statement = null;
		con = Connector.getConnection();

		try {
			statement
					.executeUpdate("INSERT INTO Temporary_TimeTable "
							+ "VALUES (courseCode, courseName, professor, room, timeSlot, daySlot)");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
