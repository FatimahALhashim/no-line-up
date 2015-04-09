package com.nlu.domain;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import com.nlu.model.CourseModel;
import com.nlu.connector.Connector;

public class TimeTable {

	Connection con = null;

	public LinkedList<Object> getTypes(String stuID) {

		CourseModel cm = new CourseModel();
		LinkedList<Object> llist = new LinkedList<Object>();
		ResultSet rs = null;
		PreparedStatement ps = null;

		con = Connector.getConnection();
		try {
			ps = con.prepareStatement("SELECT * FROM TimeTable_Database WHERE Student_Id LIKE'%"
					+ stuID + "%'");
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			rs = ps.executeQuery();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			while (rs.next()) {

				cm.setCourseCode(rs.getString("CourseCode"));
				cm.setCourseName(rs.getString("CourseName"));
				cm.setProfessor(rs.getString("Professor"));
				cm.setRoom(rs.getString("Room"));
				cm.setTimeSlot(rs.getString("TimeSlot"));
				cm.setDaySlot(rs.getString("DaySlot"));

				llist.add(cm);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return llist;
	}

}