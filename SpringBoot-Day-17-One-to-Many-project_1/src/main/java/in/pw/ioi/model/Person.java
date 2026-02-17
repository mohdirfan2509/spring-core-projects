package in.pw.ioi.model;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table
public class Person {
	
	@Id
	private Integer pid;
	
	private String pname;
	
	private String paddress;
	
	@OneToMany(mappedBy="person",cascade=CascadeType.MERGE,fetch=FetchType.EAGER)
	private Set<PhoneNumber> contactDerails;
	
	public Person() {
		
	}
	public Person(Integer pid, String pname, String paddress) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.paddress = paddress;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPaddress() {
		return paddress;
	}
	public void setPaddress(String paddress) {
		this.paddress = paddress;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", paddress=" + paddress + "]";
	}
	



	
}
