package in.pw.ioi.test;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.pw.ioi.entity.ProgrammerProjId;
import in.pw.ioi.entity.ProgrammerProjectInfo;

public class TestApp {
	
	public static void main(String[] args) throws IOException {
		
		Session session= new Configuration().configure().buildSessionFactory().openSession();
		
		Transaction transaction= session.beginTransaction();
		
		ProgrammerProjId proj= new ProgrammerProjId(100,5000);
		boolean flag=false;
		
		try {
			  
			  ProgrammerProjectInfo projInfo= new ProgrammerProjectInfo(proj,"Irfan","CSE","ecommerceApp");
			  session.persist(projInfo);
			  flag=true;
		}catch(Exception e) {
			  flag=false;
			  e.printStackTrace();
		}
		
		if(flag) {
			System.in.read();
			transaction.commit();
			System.out.println("Record saved to database !!");
		}else {
			
			transaction.rollback();
			System.out.println("Sorry record not saved to database !!");
		}	
	}

}
