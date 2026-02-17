package in.pw.ioi.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.pw.ioi.dao.IPersonRepository;
import in.pw.ioi.dao.IPhoneNumberRepository;
import in.pw.ioi.model.Person;
import in.pw.ioi.model.PhoneNumber;

@Service
@Transactional
public class PersonService implements IPersonMgmtService {
	
	@Autowired
	private IPhoneNumberRepository phoneNumberDao;
	
	@Autowired
	private IPersonRepository personDao;

	public PersonService(IPhoneNumberRepository phoneNumberDao, IPersonRepository personDao) {
		super();
		this.phoneNumberDao = phoneNumberDao;
		this.personDao = personDao;
	}

	@Override
	public String savePerson(Person per) {
		Person per1=personDao.save(per);
		String ans="Person With id: "+ per1.getPid()+" and "+per1.getPname()+" is Saved Successffully !!";
		return ans ;
	}

	@Override
	public String savePhoneNumbers(Iterable<PhoneNumber> phones) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Person> fetchByperson() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<PhoneNumber> fetchByPhoneNumber() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
    
	
}
