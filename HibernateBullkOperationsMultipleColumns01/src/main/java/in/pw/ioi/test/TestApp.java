package in.pw.ioi.test;

import java.io.IOException;
import java.util.List;

import org.hibernate.Session;

public class TestApp {

	public static void main(String[] args) throws IOException {
		
		Session session=HibernateUtil.getSessionFactoryObj().openSession();
		
//		Transaction transaction= session.beginTransaction();
	    String hqlSelectQuery="SELECT sName FROM Student"; //partial loading
	    List<String> names= session.createQuery(hqlSelectQuery,String.class).getResultList(); 
	    for(String name:names) {
	    	       System.err.println(name);
	    }
		
		
	}

}
