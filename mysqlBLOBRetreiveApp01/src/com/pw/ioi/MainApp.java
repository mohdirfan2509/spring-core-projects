package com.pw.ioi;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MainApp {
	
	public static void main(String[] args) throws ClassNotFoundException,SQLException, IOException {
				
//		2.Establish the connection by giving the url and credentials
		final String url="jdbc:mysql://localhost:3306/company";
		final String userName="root";
		final String password="Irfa@1234";
		
		Connection connection =DriverManager.getConnection(url,userName,password);
		System.out.println("Connection to "+url);
		
//		3.send the query and get the result
		String SelectQuery="SELECT imgId, imgName,img FROM images";
		PreparedStatement pst= connection.prepareStatement(SelectQuery);
		ResultSet resultSet =pst.executeQuery();
		InputStream fis=null;
		FileOutputStream fos=null;
		
		if(resultSet.next()) {
			fis= resultSet.getBinaryStream("img");
			fos= new FileOutputStream("img3.jpg");
			
			byte[] buffer=new byte[1024];
			
            while(fis.read()>0){
				
				fos.write(buffer);
			}
            System.out.println("Image saved successfully!");
			
		}
//		4.use the result

//		5.close the connection
		fos.close();
		fis.close();
		resultSet.close();
        pst.close();
		connection.close();
	}

}
