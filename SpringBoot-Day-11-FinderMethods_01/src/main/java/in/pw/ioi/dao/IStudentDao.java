package in.pw.ioi.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.pw.ioi.model.StudentTab;

public interface IStudentDao extends JpaRepository<StudentTab, Integer> {
	
	List<StudentTab> findByStdName(String stdName);
	
	List<StudentTab> findByStdNameIs(String stdName);
	
	List<StudentTab> findByStdNameEquals(String stdName);
	
	List<StudentTab> findByStdAddress(String stdAddress);
	
//	List<StudentTab> findByStdAgeLessThan(Integer stdAge);
	
//	List<StudentTab> findByStdAgeLessThanEquals(Integer stdAge);
	
	List<StudentTab> findByStdNameIsNull(String stdName);
	
	List<StudentTab> findByStdNameIsNotNull(String stdName);
	
	List<StudentTab> findByStdNameLike(String stdName);
	
	List<StudentTab> findByStdNameStartingWith(String stdName);
	
	List<StudentTab> findByStdNameEndingWith(String stdName);
	
	List<StudentTab> findByStdNameContaining(String stdName);
	
//	List<StudentTab> findByStdAgeLessThanEqualOrStdNameLike(Integer stdAge,String stdName);
	

	
	
	
	
	
	
}
