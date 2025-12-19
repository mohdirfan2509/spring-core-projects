package com.pw.ioi;
import java.io.FileNotFoundException;
import java.io.FileReader;
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
		String insertQuery="INSERT INTO documents VALUES (?, ?, ?)";
		PreparedStatement pst= connection.prepareStatement(insertQuery);
		FileReader fr=null;
		
		try {
			fr= new FileReader("world.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pst.setInt(1,1);
		pst.setString(2,"sample1");
		pst.setCharacterStream(3,fr);
		int RowCount=pst.executeUpdate();
		
//		4.use the result
		System.out.println(RowCount);
//		5.close the connection
        pst.close();
		connection.close();
	}

}
