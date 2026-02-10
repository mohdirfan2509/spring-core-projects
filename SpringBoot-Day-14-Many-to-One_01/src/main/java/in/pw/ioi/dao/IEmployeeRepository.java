package in.pw.ioi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import in.pw.ioi.model.Employee;

public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {

	

}
