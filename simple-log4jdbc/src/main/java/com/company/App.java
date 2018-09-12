package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {
	public static void main(String[] args) {
		System.setProperty("log4jdbc.driver", "org.h2.Driver");
		try {
			Class.forName("com.company.jdbc.DriverSpy");
			final Connection conn = DriverManager.getConnection("jdbc:log4jdbc:h2:~/test", "sa", "sa");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT CURRENT_TIMESTAMP()");
			if (rs.next()) {
				System.out.println(rs.getString(1));
			}
			System.out.println(conn.getClass());
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
