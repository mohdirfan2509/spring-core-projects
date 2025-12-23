package in.pw.ioi.test;

import java.io.IOException;
import java.util.List;

import org.hibernate.Session;
import in.pw.ioi.entity.Student;

public class TestApp {

	public static void main(String[] args) throws IOException {
		
		Session session=HibernateUtil.getSessionFactoryObj().openSession();
		List<Student> students=session.createNamedQuery("Student.findAll",Student.class).getResultList();
		for(Student student:students) {
			System.out.println(student);
		}
		
		
		
	}
	
}	
	   
		
		
	


