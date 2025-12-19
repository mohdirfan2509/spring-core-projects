package com.pw.ioi;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
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
		String SelectQuery="SELECT docId, docName,doc FROM documents";
		PreparedStatement pst= connection.prepareStatement(SelectQuery);
		ResultSet resultSet =pst.executeQuery();
		Reader fr=null;
		FileWriter fos=null;
		
		if(resultSet.next()) {
			fr= resultSet.getCharacterStream("doc");
			fos= new FileWriter("documents/sample2.txt");
			
			char[] buffer=new char[1024];
			
            while(fr.read(buffer)>0){
				
				fos.write(buffer);
			}
            System.out.println("text file saved successfully!");
			
		}
//		4.use the result

//		5.close the connection
		fos.close();
		fr.close();
		resultSet.close();
        pst.close();
		connection.close();
	}

}
