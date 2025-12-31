package in.pw.ioi.test;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class TestApp {

	public static void main(String[] args) throws IOException {
		
		Session session=HibernateUtil.getSessionFactoryObj().openSession();
	
//		String nativeSqlQuery="SELECT stdId,stdName,stdAge,stdAddress FROM Student";
//		List<Student> students=session.createNativeQuery(nativeSqlQuery,Student.class).getResultList();
//		for(Student student:students) {
//			System.out.println(student);
//		}
		
//		using setParameter("id",5) method to set named parameters
		
//		String nativeSqlQuery="SELECT stdId,stdName,stdAge,stdAddress FROM Student WHERE stdId >:id";
//		List<Student> students=session.createNativeQuery(nativeSqlQuery,Student.class).setParameter("id",5).getResultList();
//		for(Student student:students) {
//			System.out.println(student);
//		}
//		
		
//		Insert operation
		
		Transaction transaction= session.beginTransaction();
		String nativeSqlQuery="INSERT INTO Student (stdId,stdName,stdAge,stdAddress) VALUES (9,'Harish',55,'Siddipet')";
		int rowCount=session.createNativeQuery
	

		
	}
	
}	
	   
		
		
	


