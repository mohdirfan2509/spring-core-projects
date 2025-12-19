package in.pw.ioi;



import java.io.FileOutputStream;
import java.io.FileWriter;

import org.apache.commons.io.IOUtils;
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
	    
		FileOutputStream fos = null;
		FileWriter fw=null;
		
		try {  
			   JobSeeker js= session.find(JobSeeker.class,1);
			   byte[] buffer1= js.getJsImage(); 
			   fos= new FileOutputStream("copyIphone.jpeg");
		       IOUtils.write(buffer1,fos);
		       
		       fw= new FileWriter("newResume.txt");
		       char[] buffer2= js.getJsResume();
		       IOUtils.write(buffer2,fw);
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
		
		fos.close();
		fw.close();
		session.close();
	

	}

}
