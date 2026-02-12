package in.pw.ioi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import in.pw.ioi.model.Passport;

public interface IPassportRepository extends JpaRepository<Passport, Integer> {

	

}
