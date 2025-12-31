package in.pw.ioi.test;

import java.io.IOException;
import java.util.List;

import org.hibernate.Session;
import in.pw.ioi.entity.Student;

public class TestApp {

	public static void main(String[] args) throws IOException {
		
//		Full loading 
		Session session=HibernateUtil.getSessionFactoryObj().openSession();
		List<Student> students=session.createNamedQuery("Student.findAll",Student.class).getResultList();
		for(Student student:students) {
			System.out.println(student);
		}
//		full loading using WHERE clause
		List<Student> stds=session.createNamedQuery("Student.findByAge",Student.class).setParameter("age",35).getResultList();
		for(Student std:stds) {
			System.out.println(std);
		}
		
//		Partial Loading 
		List<String> addresses=session.createNamedQuery("Student.findAddress",String.class).getResultList();
		for(String address:addresses) {
			System.out.println(address);
		}
		
		
		
	}
	
}	
	   
		
		
	


