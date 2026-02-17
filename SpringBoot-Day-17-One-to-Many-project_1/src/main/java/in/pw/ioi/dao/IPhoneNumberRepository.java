package in.pw.ioi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import in.pw.ioi.model.PhoneNumber;

public interface IPhoneNumberRepository extends JpaRepository<PhoneNumber, Integer> {

	

}
