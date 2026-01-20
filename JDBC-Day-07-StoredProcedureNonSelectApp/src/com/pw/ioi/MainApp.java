package com.pw.ioi;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MainApp {
	
	public static void main(String[] args) throws ClassNotFoundException,SQLException {
				
//		2.Establish the connection by giving the url and credentials
		final String url="jdbc:mysql://localhost:3306/company";
		final String userName="root";
		final String password="Irfa@1234";
		
		Connection connection =DriverManager.getConnection(url,userName,password);
		System.out.println("Connection to "+url);
		CallableStatement cs= connection.prepareCall("{CALL INSERT_STUDENT_DETAILS(?,?,?,?)}");
		
		cs.setInt(1,39);
		cs.setString(2,"Vimal");
		cs.setInt(3,42);
		cs.setString(4,"Malabar");
		
	    cs.execute();
		
	}
}
