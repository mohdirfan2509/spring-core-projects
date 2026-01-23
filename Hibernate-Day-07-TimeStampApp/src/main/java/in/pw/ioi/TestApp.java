package in.pw.ioi;
import java.time.LocalDateTime;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.pw.ioi.entity.BankAccount;

public class TestApp {

	public static void main(String[] args) throws Exception {
		
//		step 1: activate hibernate Environment
		Session session= new Configuration().configure().buildSessionFactory().openSession();
		
		Transaction transaction= session.beginTransaction();
		boolean flag=false;
	
		
		try {
//			
//			   BankAccount bankAccount = new BankAccount("Aravind",2000,"Current");
//			   session.persist(bankAccount);  //insert query sent to the database for execution : result : cache
			   BankAccount acc= session.find(BankAccount.class,1);
			   
			   if(acc !=null) {
				   acc.setBalance(acc.getBalance()+2000);
				   session.merge(acc);
				   flag=true;
			   }else {
				   System.out.println("Record with Id=1 doesn't exist ! !");
			   }
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
