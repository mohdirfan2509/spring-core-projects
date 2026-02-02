package in.pw.ioi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import in.pw.ioi.model.Customer;

public interface IStudentDao extends JpaRepository<Customer, Integer> {

}
