package in.pw.ioi.test;

import java.io.IOException;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.pw.ioi.entity.Student;

public class TestApp {

	public static void main(String[] args) throws IOException {
		
		Session session=HibernateUtil.getSessionFactoryObj().openSession();
		
//		 ****SELECT QUERY****
		
		List<Student> students= session.createNamedQuery("Student.findAllNative",Student.class).getResultList();
		for(Student student:students) {
			System.out.println(student);
		}
		
//		****SELECT QUERY USING NAMED PARAMETER****
		
		students= session.createNamedQuery("Student.findByAgeNative",Student.class).setParameter("age",30).getResultList();
		for(Student student:students) {
			System.out.println(student);
		}
		
//	    ****INSERT QUERY****
		Transaction transaction=session.beginTransaction();
//		int rowCount=session.createNamedMutationQuery("Student.insertNative").setParameter(1,"Siraj").setParameter(2,50).setParameter(3,"Secunderabad").executeUpdate();
//		System.out.println(rowCount);
//		transaction.commit();
//		
//	    ****UPDATE QUERY****
//	    transaction = session.beginTransaction();
//	    int rowCount=session.createNamedMutationQuery("Student.updateAddressNative").setParameter("addr","kanpur").setParameter("id",10).executeUpdate();
//		System.out.println(rowCount);
//      	transaction.commit();
		
//		****DELETE QUERY****
		
		transaction=session.beginTransaction();
		int rowCount=session.createNamedMutationQuery("Student.deleteNative").setParameter("id",10).executeUpdate();
		transaction.commit();
		System.out.println(rowCount);
		
  }
	

	    

	
	
}
	   
		
		
	


