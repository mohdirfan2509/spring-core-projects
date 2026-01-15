package com.app;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class MainApp {
	
	public static void main(String[] args) {
		
//		step 2: Establish the connection
		
		Connection connection=null;
		Statement statement=null;
		
		String url=null;
		String userName=null;
		String password=null;
		try {
			InputStream is=MainApp.class.getClassLoader().getResourceAsStream("db.properties");
			Properties prop= new Properties();
			prop.load(is);
			url=prop.getProperty("url");
			userName=prop.getProperty("username");
			password=prop.getProperty("password");
		}catch(IOException e) {
			e.printStackTrace();
		}
			
		
		try {
			connection=DriverManager.getConnection(url,userName,password);
//			step 1:load and register the driver
			System.out.println("JRE : JVM+ DB Environment ");
			System.out.println("Connection to :"+url);
			if(connection !=null){
//				step 3: send the query for execution
				statement=connection.createStatement();
				
				if(statement !=null) {
					String sqlSelectQuery="UPDATE Employee SET EmployeeSalary=9500 WHERE EmployeeName='Sravan'";
					System.out.println(sqlSelectQuery);
					int rowCount=statement.executeUpdate(sqlSelectQuery);
					System.out.println(rowCount);
				}
			}
		}catch(SQLException e){
			e.printStackTrace();
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
		
			try{
				if(statement !=null) {
					statement.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
			try {
				
				if(connection !=null) {
					connection.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
			
			}

	}

}
