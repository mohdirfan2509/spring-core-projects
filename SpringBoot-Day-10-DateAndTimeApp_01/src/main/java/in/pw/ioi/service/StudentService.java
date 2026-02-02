package in.pw.ioi.service;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.pw.ioi.dao.IStudentDao;
import in.pw.ioi.model.Customer;
import jakarta.persistence.EntityNotFoundException;

@Service
@Transactional
public class StudentService {
	
	
	private IStudentDao dao;
    

	public StudentService(IStudentDao dao){
		super();
		this.dao = dao;
	}
	
	public Customer saveStudent(Customer customer) {
		
	    System.out.println("Implemention class is :"+ dao.getClass().getName());
		return dao.save(customer);
	}
	
	public Customer findStudentById(Integer id) {
		
		return dao.findById(id)
				.orElseThrow(()-> new EntityNotFoundException("Student not found for the given Id !!"));
	}
	
	public List<Customer> findStudentLikeOperation(String name){
		
		return null;
	}
	
	public List<Customer> findStudentUsingAndMarksByCondition(String name,Integer id){
		
		return null;
	}

}
