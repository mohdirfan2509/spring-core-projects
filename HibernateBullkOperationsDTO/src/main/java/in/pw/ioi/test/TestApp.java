package in.pw.ioi.test;

import java.io.IOException;
import java.util.List;

import org.hibernate.Session;

import in.pw.ioi.entity.StudentDTO;

public class TestApp {

	public static void main(String[] args) throws IOException {
		
		Session session=HibernateUtil.getSessionFactoryObj().openSession();
		
//		Transaction transaction= session.beginTransaction();
	    var hqlSelectQuery="SELECT new in.pw.ioi.entity.StudentDTO(s.sName,s.sAge,s.sAddress) FROM Student s";
	    List<StudentDTO> students= session.createQuery(hqlSelectQuery,StudentDTO.class).getResultList();
	    for(StudentDTO student:students) {
	    	      System.out.println(student);
	    }
		
		
	}

}
