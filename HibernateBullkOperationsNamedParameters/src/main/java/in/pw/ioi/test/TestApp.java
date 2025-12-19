package in.pw.ioi.test;

import java.io.IOException;
import org.hibernate.Session;

import in.pw.ioi.entity.Student;

public class TestApp {

	public static void main(String[] args) throws IOException {
		
		Session session=HibernateUtil.getSessionFactoryObj().openSession();
		
        var hqlSelectQuery="FROM Student s WHERE sId=:id"; //Full loading with one object
        Student std= session.createQuery(hqlSelectQuery, Student.class).setParameter("id",1).uniqueResult();
        System.out.println(std);

	}

}
