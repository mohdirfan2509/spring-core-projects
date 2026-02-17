package in.pw.ioi.service;

import in.pw.ioi.model.Person;
import in.pw.ioi.model.PhoneNumber;

public interface IPersonMgmtService {
	
	public String savePerson(Person per);
	public String savePhoneNumbers(Iterable<PhoneNumber> phones);
	public Iterable<Person> fetchByperson();
	public Iterable<PhoneNumber> fetchByPhoneNumber();
	
	

}
