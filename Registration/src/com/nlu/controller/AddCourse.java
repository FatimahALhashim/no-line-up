package com.nlu.controller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.nlu.connector.Connector;
import com.nlu.model.CourseModel;

public class AddCourse {

	public void AddCourseTemp(CourseModel cm) {

		Connection con = null;
		ByteArrayOutputStream baos = null;
		ObjectOutputStream objOstream = null;

		con = Connector.getConnection();

		try {

			try {
				baos = new ByteArrayOutputStream();
				objOstream = new ObjectOutputStream(baos);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			objOstream.writeObject(cm);
			byte[] bArray = baos.toByteArray();

			System.out.println("*** bArray = " + bArray);

			PreparedStatement objStatement = con
					.prepareStatement("INSERT INTO TimeTable_Database "
							+ "VALUES (?,?)");

			objStatement.setBytes(1, bArray);
			objStatement.execute();

		} catch (SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void addCourseTT(CourseModel cm) {

		Connection con = null;
		ByteArrayOutputStream baos = null;
		ObjectOutputStream objOstream = null;

		con = Connector.getConnection();

		try {

			try {
				baos = new ByteArrayOutputStream();
				objOstream = new ObjectOutputStream(baos);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			objOstream.writeObject(cm);
			byte[] bArray = baos.toByteArray();

			System.out.println("*** bArray = " + bArray);

			PreparedStatement objStatement = con
					.prepareStatement("INSERT INTO Temporary_TimeTable "
							+ "VALUES (?,?)");

			objStatement.setBytes(1, bArray);
			objStatement.execute();

		} catch (SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
