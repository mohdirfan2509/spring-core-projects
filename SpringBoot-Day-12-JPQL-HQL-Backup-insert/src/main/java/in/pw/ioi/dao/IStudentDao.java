package in.pw.ioi.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import in.pw.ioi.model.StudentTab;

public interface IStudentDao extends JpaRepository<StudentTab, Integer> {
	
	
	@Query("from StudentTab")
	public List<StudentTab> getAllRecords();
	
	@Query("select stdName,stdAge from StudentTab")
	public List<Object[]> getParticularColumns();  
	
	@Query("select stdName from StudentTab")
	public List<String> getOneColumn();
	
	@Query("FROM StudentTab WHERE stdId>:id ")
	public Optional<List<StudentTab>> getwithId(Integer id);
	
	@Query("SELECT stdName,stdAge FROM StudentTab WHERE stdName= :name AND stdAge= :age")
	public List<Object[]> getTwoColumns(@Param("name")String a,@Param("age")Integer b);
	
	@Query("SELECT stdName FROM StudentTab WHERE stdName= :name")
	public Optional<String> getName(String name);
	
	@Modifying
	@Query(value="INSERT INTO student_tab VALUES (44,15,'Hubli','Rohith')",nativeQuery=true)
	@Transactional
	public int insertRow();
	
	@Modifying
	@Query("INSERT INTO StudentTabBackup(sName,sAge,sAddress) SELECT s.stdName,s.stdAge,s.stdAddress FROM StudentTab s WHERE s.stdAge>20")
	@Transactional
	public int insertRowToBackUp();
	
}
