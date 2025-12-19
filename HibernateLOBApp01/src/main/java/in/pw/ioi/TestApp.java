package in.pw.ioi;



import java.io.FileInputStream;
import java.io.FileReader;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.pw.ioi.entity.JobSeeker;

public class TestApp {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
//		step 1: activate hibernate Environment
		Session session= new Configuration().configure().buildSessionFactory().openSession();
		
		Transaction transaction= session.beginTransaction();
		boolean flag=false;
	
		
		try {   
			   
			   JobSeeker js= new JobSeeker("Vikas","Hyderabad",9703);
			  
//			   Reading the bytes from image file and storing it byte array buffer1
			   FileInputStream fis= new FileInputStream("iphone16.jpeg"); 
//			   byte[] buffer1= fis.readAllBytes();
			   byte[] buffer1= new byte[1024];
			   fis.read(buffer1);
			   js.setJsImage(buffer1);
			   
//			   Reading the characters from text file and storing it char array buffer2
			   FileReader fr= new FileReader("resume.txt");
//			   char[] buffer2=new char[fr.read()];
//			   fr.read(buffer2);
			   char[] buffer2=new char[1024];
			   fr.read(buffer2);
			   js.setJsResume(buffer2);
			   
			   
			   session.persist(js);
			   flag=true;
			   
		}catch(Exception e) {
			flag=false;
			e.printStackTrace();
		}
		
		if(flag) {
			System.in.read();
			transaction.commit();
			System.out.println("Record saved to database");
			
		}else {
			transaction.rollback();
			System.out.println("Record not saved to database");
		}
	
        
	}

}
