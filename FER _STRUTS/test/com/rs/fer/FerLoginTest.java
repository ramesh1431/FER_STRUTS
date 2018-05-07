package com.rs.fer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

import com.rs.fer.DBUtil.DBUtil;

import junit.framework.TestCase;

public class FerLoginTest extends TestCase {

	@Test
	public void testLogin() {
		String username ="ramesh";
		 String password="ramesj";
		 
		Connection connection = null;
		boolean isValidUser = false;

		try {
			connection = DBUtil.getConnection();

			PreparedStatement p = connection.prepareStatement("select * from User where Username=? and  password=?");
			p.setString(1, username);
			p.setString(2, password);

			ResultSet resultset = p.executeQuery();

			while (resultset.next()) {
				isValidUser = true;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeConnection(connection);
		}

		assertEquals(true, isValidUser);
	}

}
