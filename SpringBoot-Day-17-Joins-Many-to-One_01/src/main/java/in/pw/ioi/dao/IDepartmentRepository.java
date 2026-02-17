package in.pw.ioi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import in.pw.ioi.model.Department;

public interface IDepartmentRepository extends JpaRepository<Department, Integer> {

	

}
