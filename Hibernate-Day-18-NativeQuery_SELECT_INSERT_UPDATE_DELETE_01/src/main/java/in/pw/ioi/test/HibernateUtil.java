package in.pw.ioi.test;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private static SessionFactory sessionFactory=null;
	
	static {
		
		try{
			sessionFactory= new Configuration().configure().buildSessionFactory();
		}catch(Exception e){
			 e.printStackTrace();
			 System.out.println("SessionFactory creation failed !! ");
		}
		
	}
	
	public static SessionFactory getSessionFactoryObj() {
		return sessionFactory;
	}

}
 