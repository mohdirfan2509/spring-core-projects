package com.pw.ioi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainApp {
	
	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		
//		1.load the driver[class should be loaded to set up JRE and DB environment ]
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded sucessfully");
		
//		2.Establish the connection by giving the url and credentials
		final String url="jdbc:mysql://localhost:3306/?user=root";
		final String userName="root";
		final String password="Munafmd@7407";
		
		Connection connection =DriverManager.getConnection(url,userName,password);
		System.out.println("Connection to "+url);
		
//		3.send the query and get the result
		String selectQuery="SELECT sage, stdId, stdAddr, stdName FROM studentTab";
		Statement statement= connection.createStatement();
		ResultSet resultSet=statement.executeQuery(selectQuery);
		System.out.println("SAGE\tSID\tSADDR\tSNAME");
//		4.use the result
		while(resultSet.next()) {
			int sage=resultSet.getInt(1);
			int stdId=resultSet.getInt(2);
			String stdAddr=resultSet.getString(3);
			String stdName=resultSet.getString(4);
			System.out.println(sage+"\t"+stdId+"\t"+stdAddr+"\t"+stdName);
		}
		
//		5.close the connection
		resultSet.close();
		statement.close();
		connection.close();
	}

}
