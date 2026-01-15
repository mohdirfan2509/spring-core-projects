package com.pw.ioi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class MainApp {
	
	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		
//		1.load the driver[class should be loaded to set up JRE and DB environment ]
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded sucessfully");
		
//		2.Establish the connection by giving the url and credentials
		final String url="jdbc:mysql://localhost:3306/company";
		final String userName="root";
		final String password="Irfa@1234";
		
		Connection connection =DriverManager.getConnection(url,userName,password);
		System.out.println("Connection to "+url);
		
//		3.send the query and get the result
		String selectQuery="SELECT EmployeeId,EmployeeName,EmployeeAge,EmployeeSalary FROM Employee";
		Statement statement= connection.createStatement();
		ResultSet resultSet=statement.executeQuery(selectQuery);
		System.out.println("EMPID\tEMPNAME\tEMPAGE\tEMPSALARY");
//		4.use the result
		while(resultSet.next()) {
			int Eid=resultSet.getInt(1);
			String EName=resultSet.getString(2);
			int EAge=resultSet.getInt("EmployeeAge");
			int ESalary=resultSet.getInt("EmployeeSalary");
			System.out.println(Eid+"\t"+EName+"\t"+EAge+"\t"+ESalary);
		}
		
//		5.close the connection
		resultSet.close();
		statement.close();
		connection.close();
	}

}
