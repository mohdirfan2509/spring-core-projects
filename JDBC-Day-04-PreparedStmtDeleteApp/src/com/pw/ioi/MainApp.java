package com.pw.ioi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MainApp {
	
	public static void main(String[] args) throws ClassNotFoundException,SQLException {
				
//		2.Establish the connection by giving the url and credentials
		final String url="jdbc:mysql://localhost:3306/company";
		final String userName="root";
		final String password="Irfa@1234";
		
		Connection connection =DriverManager.getConnection(url,userName,password);
		System.out.println("Connection to "+url);
		
//		3.send the query and get the result
		String selectQuery="DELETE FROM Employee WHERE EmployeeId= ?";
		PreparedStatement pst= connection.prepareStatement(selectQuery);
		pst.setInt(1,107);
		int RowCount=pst.executeUpdate();
		
//		4.use the result
		System.out.println(RowCount);
//		5.close the connection
        pst.close();
		connection.close();
	}

}
