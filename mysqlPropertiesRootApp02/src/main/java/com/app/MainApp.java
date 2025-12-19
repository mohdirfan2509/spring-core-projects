package com.app;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class MainApp {
	
	public static void main(String[] args) {
		
//		step 2: Establish the connection
		
		Connection connection=null;
		Statement statement=null;
		ResultSet resultSet=null;
		Scanner scan=null;
		
		String url=null;
		String userName=null;
		String password=null;
		try {
			FileInputStream fis=new FileInputStream("db.properties");
			Properties prop= new Properties();
			prop.load(fis);
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
					scan= new Scanner(System.in);
					System.out.println("Enter the Employee ID : ");
					int Eid=scan.nextInt();
					String sqlSelectQuery="SELECT * FROM Employee WHERE EmployeeID="+Eid;
					System.out.println(sqlSelectQuery);
					resultSet=statement.executeQuery(sqlSelectQuery);
//					step 4: Use the data  [ResultSet	]
					if(resultSet.next()){
						System.out.println("EID \tENAME \tEAGE \tESALARY");
						int eid=resultSet.getInt(1);
						String Ename=resultSet.getString(2);
						int Eage=resultSet.getInt(3);
						int Eslry=resultSet.getInt(4);
						System.out.println(eid+"\t"+Ename+"\t"+Eage+"\t"+Eslry);
					}else {
						System.out.println("Record is not available for the given id: "+Eid);
					}
					
				}
			}
		}catch(SQLException e){
			e.printStackTrace();
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
//			step 5: close the resources
			
		
			try {
				resultSet.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		
			try{
				if(statement !=null) {
					statement.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
			
			scan.close();
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
