package in.pw.ioi;



import java.io.ByteArrayInputStream;
import java.io.CharArrayReader;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.Reader;

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
		
		InputStream is=null;
		Reader r=null;
		
		
		try {  
			   JobSeeker js= session.find(JobSeeker.class,1);
			  
			   fos= new FileOutputStream("copyIphone.jpeg");
		       is=new ByteArrayInputStream(js.getJsImage());
		       IOUtils.copy(is,fos);
		       
		       fw= new FileWriter("newResume.txt");
		       r=new CharArrayReader(js.getJsResume());
		       IOUtils.copy(r,fw);
		       
			   flag=true;
			   
		}catch(Exception e) {
			flag=false;
			e.printStackTrace();
		}
		
		if(flag) {
			System.in.read();
//			transaction.commit();
			System.out.println("Record saved to database");
			
		}else {
//			transaction.rollback();
			System.out.println("Record not saved to database");
		}
		
		fos.close();
		fw.close();
		session.close();
	

	}

}
