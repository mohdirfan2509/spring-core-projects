package in.pw.ioi.test;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class TestApp {

	public static void main(String[] args) throws IOException {
		
		Session session=HibernateUtil.getSessionFactoryObj().openSession();
		
//		****SELECT QUERY-FULL LOADING****
		
//		String nativeSqlQuery="SELECT stdId,stdName,stdAge,stdAddress FROM Student";
//		List<Student> students=session.createNativeQuery(nativeSqlQuery,Student.class).getResultList();
//		for(Student student:students) {
//			System.out.println(student);
//		}
		
//		****using setParameter("id",5) method to set named parameters****
		
//		String nativeSqlQuery="SELECT stdId,stdName,stdAge,stdAddress FROM Student WHERE stdId >:id";
//		List<Student> students=session.createNativeQuery(nativeSqlQuery,Student.class).setParameter("id",5).getResultList();
//		for(Student student:students) {
//			System.out.println(student);
//		}
		
		
//	****SELECT QUERY-PARTIAL LOADING****
		
//		String nativeSqlQuery="SELECT stdName, FROM STUDENT";
//		List<String> names=session.createNativeQuery(nativeSqlQuery,String.class).getResultList();
//		for(String name:names) {
//			System.out.println(name);
//		}
		
//		****INSERT QUERY ****
		
//		Transaction transaction=session.beginTransaction();
//		String nativeSqlQuery="INSERT INTO Student (stdId,stdName,stdAge,stdAddress) VALUES (9,'Nagesh',38,'Delhi')";
//		int rowCount=session.createNativeMutationQuery(nativeSqlQuery).executeUpdate();
//		System.out.println(rowCount);
//		transaction.commit();
		
//		****UPDATE QUERY ****

//		Transaction transaction=session.beginTransaction();
//		String nativeSqlQuery="UPDATE Student SET stdAge=55 WHERE stdName='Nagesh'";
//		int rowCount=session.createNativeMutationQuery(nativeSqlQuery).executeUpdate();
//		System.out.println(rowCount);
//		transaction.commit();
		
//		****DELETE QUERY ****

		Transaction transaction=session.beginTransaction();
		String nativeSqlQuery="DELETE FROM Student WHERE stdId=9";
		int rowCount=session.createNativeMutationQuery(nativeSqlQuery).executeUpdate();
		System.out.println(rowCount);
		transaction.commit();
		
	}
	
}	
	   
		
		
	


