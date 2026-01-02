package in.pw.ioi.test;

import java.io.IOException;
import java.util.List;

import org.hibernate.Session;

import in.pw.ioi.entity.Student;
import in.pw.ioi.entity.StudentDTO;

public class TestApp {

	public static void main(String[] args) throws IOException {
		
		Session session=HibernateUtil.getSessionFactoryObj().openSession();
				
		String nativeSqlQuery="SELECT stdName,stdAge,stdAddress FROM Student";
		List<StudentDTO> students=session.createNativeQuery(nativeSqlQuery,StudentDTO.class).getResultList();
		for(StudentDTO student:students) {
			System.out.println(student);
		}
		
	}
	
}	
	   
		
		
	


