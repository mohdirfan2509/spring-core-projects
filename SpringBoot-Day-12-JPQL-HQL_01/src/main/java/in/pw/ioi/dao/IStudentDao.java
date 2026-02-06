package in.pw.ioi.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.pw.ioi.model.StudentTab;

public interface IStudentDao extends JpaRepository<StudentTab, Integer> {
	
	
	@Query("from StudentTab")
	public List<StudentTab> getAllRecords();
	
	@Query("select stdName,stdAge from StudentTab")
	public List<Object[]> getParticularColumns();  
	
	@Query("select stdName from StudentTab")
	public List<String> getOneColumn();
}
