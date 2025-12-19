package com.pw.test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
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
		
//      take Date input
		System.out.println("Enter the date (dd-MM-yyyy): ");
		Scanner scan=new Scanner(System.in);
		String sdate= scan.next();
		
		SimpleDateFormat sdf= new SimpleDateFormat("dd-MM-yyyy");
		Date date= null;
		java.sql.Date sqlDate=null;
		
		try {
			date=sdf.parse(sdate);
			
			sqlDate= new java.sql.Date(date.getTime());
//			System.out.println(sqlDate); // yyyy-MM-dd	
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		3.send the query and get the result
		
		String selectQuery="INSERT INTO school VALUES (?, ?, ?, ?)";
		PreparedStatement pst= connection.prepareStatement(selectQuery);
		pst.setInt(1,5);
		pst.setString(2,"Mahesh");
		pst.setInt(3,9);
		pst.setDate(4,sqlDate);
		int RowCount = pst.executeUpdate();
	    
	    
//			4.use the result
		
		System.out.println(RowCount);
	    
			
//		5.close the connection
		pst.close();
		connection.close();
		scan.close();
	}

}
