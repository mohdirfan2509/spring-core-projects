package com.pw.test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
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
		
//      Take Student ID as input
		System.out.println("Enter the Student ID to get DOB (dd-MM-yy):");
		Scanner scan=new Scanner(System.in);
		int Id= scan.nextInt();
	
//		3.send the query and get the result
		String selectQuery="SELECT sDob FROM school WHERE sId=?";
		PreparedStatement pst= connection.prepareStatement(selectQuery);
		pst.setInt(1,Id);
		ResultSet resultSet= pst.executeQuery();
		
//		4.use the result
		java.sql.Date sqlDate=null;
		while(resultSet.next()) {
			sqlDate=resultSet.getDate(1);
		}
		System.out.println(sqlDate);
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		String res=sdf.format(sqlDate);
		System.out.println(res);
		
//		5.close the connection
		pst.close();
		connection.close();
		scan.close();
	} 

}
