package in.pw.ioi.service;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.pw.ioi.dao.IStudentDao;
import in.pw.ioi.model.StudentTab;
import jakarta.persistence.EntityNotFoundException;

@Service
@Transactional
public class StudentService {
	
	
	private IStudentDao dao;
    

	public StudentService(IStudentDao dao){
		super();
		this.dao = dao;
	}
	
	public StudentTab saveStudent(StudentTab student) {
		
	    System.out.println("Implemention class is :"+ dao.getClass().getName());
		return dao.save(student);
	}
	
	@Transactional(readOnly=true)
	public StudentTab findStudentById(Integer id) {
		
		return dao.findById(id)
				.orElseThrow(()-> new EntityNotFoundException("Student not found for the given Id !!"));
	}
	
	public void deleteStudentById(Integer id) {
		
		Optional<StudentTab> optional=dao.findById(id);
		if(optional.isPresent()) {
			dao.deleteById(id);
			System.out.println("Record Deleted Successfully !!");
		}else {
			System.out.println("Record Not found for the given id :"+ id);
		}
	}
	
	public StudentTab updateStudentById(Integer id) {
		
		try {
			  StudentTab stdPersistent= findStudentById(id);
			  
			  stdPersistent.setStdName("Tendulkar");
			  return dao.save(stdPersistent);
			
		} catch (EntityNotFoundException e) {
			throw e;
		}
	}

}
