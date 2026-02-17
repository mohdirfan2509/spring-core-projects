package in.pw.ioi.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.pw.ioi.model.Employee;

public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {
	
	@Query("""
			SELECT e.empName, d.deptName
			     FROM 
			        Employee as e
			          INNER JOIN
			        e.department as d
			""")
	List<Object[]> getEnameDeptNames();

	

}
