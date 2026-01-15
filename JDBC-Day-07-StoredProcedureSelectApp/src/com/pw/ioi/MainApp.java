package com.pw.ioi;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

public class MainApp {
	
	public static void main(String[] args) throws ClassNotFoundException,SQLException {
				
//		2.Establish the connection by giving the url and credentials
		final String url="jdbc:mysql://localhost:3306/company";
		final String userName="root";
		final String password="Irfa@1234";
		
		Connection connection =DriverManager.getConnection(url,userName,password);
		System.out.println("Connection to "+url);
		CallableStatement cs= connection.prepareCall("{GET_STUDENT_DETAILS_BY_ID(?,?,?,?)}");
		
		cs.setInt(1,2);
		cs.registerOutParameter(2,Types.VARCHAR);
		cs.registerOutParameter(3,Types.INTEGER);
		cs.registerOutParameter(4,Types.VARCHAR);
		
		cs.execute();
		ResultSet rs = cs.getResultSet();
	    System.out.println(rs);
	}
}
