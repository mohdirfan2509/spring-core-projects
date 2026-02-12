package in.pw.ioi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import in.pw.ioi.model.Person;

public interface IPersonRepository extends JpaRepository<Person, Integer> {

	

}
