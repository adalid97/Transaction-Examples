package com.transacciones.conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataBase {

	private static final String URL = "jdbc:mysql://localhost/bdtransaction?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	private static final String USER = "root";
	private static final String PASSWORD = "";

	public static Connection getConection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");

			return DriverManager.getConnection(URL, USER, PASSWORD);

		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
		return null;
	}

}
