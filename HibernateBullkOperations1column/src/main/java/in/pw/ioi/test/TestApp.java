package in.pw.ioi.test;

import java.io.IOException;

import org.hibernate.Session;

public class TestApp {

	public static void main(String[] args) throws IOException {
		
		Session session=HibernateUtil.getSessionFactoryObj().openSession();
		
//		Transaction transaction= session.beginTransaction();
	    List<StudentDTO> students	
		
		
	}

}
