package in.pw.ioi;



import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import in.pw.ioi.entity.Student;

public class TestApp {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
//		step 1: activate hibernate Environment
		Session session= new Configuration().configure().buildSessionFactory().openSession();
		
		try {
			   Student student= session.getReference(Student.class,10);
			   System.in.read();
			   if(student !=null) {
				   System.out.println("*** Student Data is ****");
				   System.out.println("SID : " +student.getsId());
				   System.out.println("SNAME : " +student.getsName());
				   System.out.println("SAGE: " +student.getsAge());
				   System.out.println("SADDRESS : " +student.getsAddress());
			   }else {
				   System.out.println("Record Not available !!");
			   }
			   
			     
			   
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	

	}

}
