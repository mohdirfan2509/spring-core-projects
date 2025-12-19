package in.pw.ioi.test;

import java.io.IOException;
import java.util.List;

import org.hibernate.Session;

public class TestApp {

	public static void main(String[] args) throws IOException {
		
		Session session=HibernateUtil.getSessionFactoryObj().openSession();
		
//		Transaction transaction= session.beginTransaction();
	    String hqlSelectQuery="SELECT sName,sAge,sAddress FROM Student"; //partial loading
	    List<Object[]> details=session.createQuery(hqlSelectQuery,Object[].class).getResultList();
	    for(Object[] obj: details) {
	    	      System.out.println("SNAME     : "+(String)obj[0]);
	    	      System.out.println("SAGE      : "+(Integer)obj[1]);
	    	      System.out.println("SADDRESS  : "+(String)obj[2]);
	    	      System.out.println("***********************************");
	    }
		
		
	}

}
