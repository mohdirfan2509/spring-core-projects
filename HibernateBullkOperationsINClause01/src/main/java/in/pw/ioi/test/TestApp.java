package in.pw.ioi.test;

import java.io.IOException;
import java.util.List;

import org.hibernate.Session;

import in.pw.ioi.entity.Student;

public class TestApp {

	public static void main(String[] args) throws IOException {
		
		Session session=HibernateUtil.getSessionFactoryObj().openSession();
		
//		Transaction transaction= session.beginTransaction();
	    String hqlSelectQuery="FROM Student s WHERE s.sAddress IN (:cities)"; //full loading
	    List<String> cts=List.of("London","Chennai");
	    List<Student> stds=session.createQuery("hqlSelectQuery",Student.class).setParameter("cities",cts).getResultList();
	    
	    for(Student student:stds) {
	    	      System.out.println(student);
	    }
	    
	    }
		
		
	}


