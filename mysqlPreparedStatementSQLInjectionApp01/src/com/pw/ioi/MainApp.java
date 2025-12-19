package com.pw.ioi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainApp {
	
	public static void main(String[] args) throws ClassNotFoundException,SQLException {
				
//		2.Establish the connection by giving the url and credentials
		final String url="jdbc:mysql://localhost:3306/company";
		final String userName="root";
		final String password="Irfa@1234";
		
		Connection connection =DriverManager.getConnection(url,userName,password);
		System.out.println("Connection to "+url);
		
//		3.send the query and get the result
		String selectQuery="SELECT count(*) FROM Employee WHERE EmployeeId=104 -- and EmployeeSalary=12000";
		Statement statement= connection.createStatement();
		
		ResultSet resultSet=statement.executeQuery(selectQuery);
		
//		4.use the result
		while(resultSet.next()) {
		System.out.println(resultSet.getInt(1));
		}
		
//		5.close the connection
		resultSet.close();
		statement.close();
		connection.close();
	}

}
