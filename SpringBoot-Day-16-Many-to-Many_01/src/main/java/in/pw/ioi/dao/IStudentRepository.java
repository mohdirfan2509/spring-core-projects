package in.pw.ioi.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.pw.ioi.model.Student;

public interface IStudentRepository extends JpaRepository<Student, Integer> {

//	void findAll(List<Student> lstds);
	

}
