package in.pw.ioi.test;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class TestApp {

	public static void main(String[] args) throws IOException {
		
		Session session=HibernateUtil.getSessionFactoryObj().openSession();
	
		String hqlQuery="INSERT INTO StudentBackUp(stuName,stuAge,stuAddress) SELECT s.sName, s.sAge, s.sAddress FROM Student s WHERE s.sAge> :age";
		Transaction transaction= session.beginTransaction();
		int rowCount=session.createMutationQuery(hqlQuery).setParameter("age",20).executeUpdate();
		transaction.commit();
		
		
		
	}
	
}	
	   
		
		
	


