package com.pw.ioi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class MainApp {
	
	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		
		
//		2.Establish the connection by giving the url and credentials
		final String url="jdbc:mysql://localhost:3306/company";
		final String userName="root";
		final String password="Irfa@1234";
		
		Connection connection =DriverManager.getConnection(url,userName,password);
//		1.load the driver[class should be loaded to set up JRE and DB environment ]
		System.out.println("Driver loaded sucessfully");
		System.out.println("Connection to "+url);
		
//		3.send the query and get the result
		Scanner scan=new Scanner(System.in);
		String insertQuery="INSERT INTO Employee VALUES (107, 'Harish', 29, 12500)";
		Statement statement= connection.createStatement();
	    Boolean isSelect =statement.execute(insertQuery);
	    
//			4.use the result
	    System.out.println(isSelect);
			
//		5.close the connection
		statement.close();
		connection.close();
		scan.close();
	}

}
