package in.pw.ioi.service;

import java.util.Optional;

import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.pw.ioi.dao.IStudentDao;
import in.pw.ioi.model.Student;
import jakarta.persistence.EntityNotFoundException;

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
	
	@Transactional(readOnly=true)
	public Student findStudentById(Integer id) {
		return dao.findById(id).orElseThrow(()-> new EntityNotFoundException("Student Not Found for the given Id !!"));
	}
	
	public void deleteStudentById(Integer id){
		
		Optional<Student> optional= dao.findById(id);
		if(optional.isPresent()) {
			dao.deleteById(id);
			System.out.println("Record successfully deleted");
		}else {
			System.out.println("Record not found for the given id :"+id);
		}
	}
	
	public Student updateStudentById(Integer id) {
		try {
			Student stdPersistent= findStudentById(id);
			stdPersistent.setStdName("Tendulkar");
			return dao.save(stdPersistent);
		}catch(EntityNotFoundException e){
			throw e;
		}
		
	}
	
	public Iterable<Student> sortStudentByNameAndAge(boolean sortOrder,String...propertyName){
		
		Sort sort=Sort.by(sortOrder ? Direction.ASC : Direction.DESC,propertyName);
		return dao.findAll();
		
			
	}
	
	public   
	
	

}
