package in.pw.ioi.test;

import java.io.IOException;
import java.util.List;

import org.hibernate.Session;


import in.pw.ioi.entity.Student;

public class TestApp {

	public static void main(String[] args) throws IOException {
		
		Session session=HibernateUtil.getSessionFactoryObj().openSession();
		
        Integer pageNumber=2;
        Integer pageSize=4;
        Integer offSet=0;
        Integer noOfPages=0;
        
        Long noOfRows= (Long) session.createNamedQuery("Student.countAll").getSingleResult();
        
        offSet=(pageNumber-1)*pageSize;
        noOfPages=(int) (noOfRows%pageSize==0 ? noOfRows/pageSize :noOfRows/pageSize+1);
         
        List<Student> students=session.createNamedQuery("Student.findAll",Student.class).setMaxResults(pageSize).setFirstResult(offSet).getResultList();
        for(Student student:students) {
        	    System.out.println(student);
        }
	}
	
	
}	
	   
		
		
	


