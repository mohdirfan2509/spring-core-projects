package in.pw.ioi.service;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.pw.ioi.dao.IStudentDao;
import in.pw.ioi.model.Student;

@Service
@Transactional
public class StudentService {
	
	
	private IStudentDao dao;
    

	public StudentService(IStudentDao dao){
		super();
		this.dao = dao;
	}
	
	public Student saveStudent(Student student) {
		
	    System.out.println("Implemention class is :"+ dao.getClass().getName());
		return dao.save(student);
	}

}
