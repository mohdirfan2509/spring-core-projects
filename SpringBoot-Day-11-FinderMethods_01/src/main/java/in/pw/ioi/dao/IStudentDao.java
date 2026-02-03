package in.pw.ioi.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.pw.ioi.model.StudentTab;

public interface IStudentDao extends JpaRepository<StudentTab, Integer> {
	
	List<StudentTab> findByStdName(String stdName);
	
	List<StudentTab> findByStdNameStartingWith(String stdName);
	
	List<StudentTab> findByStdNameEndingWith(String stdName);
	

	
	
	
	
	
	
}
