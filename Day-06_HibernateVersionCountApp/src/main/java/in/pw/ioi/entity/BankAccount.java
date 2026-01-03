package in.pw.ioi.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Version;

@Entity
@Table
public class BankAccount {
	
	
	@Column(name="accountNumber")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer accNo;
	
	@Column(name="holderName")
	private String holderName;
	
	@Column(name="balance")
	private Integer balance;
	
	@Column(name="type")
	private String type;
	
	@CreationTimestamp
	private LocalDateTime openingDate;
	
	@UpdateTimestamp
	private LocalDateTime updateDate;
	
	@Version
	private Integer count;
	
	public BankAccount() {}

	public BankAccount(String holderName, Integer balance, String type) {
		super();
		this.holderName = holderName;
		this.balance = balance;
		this.type = type;
	
	}

	public Integer getAccNo() {
		return accNo;
	}

	public void setAccNo(Integer accNo) {
		this.accNo = accNo;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public Integer getBalance() {
		return balance;
	}

	public void setBalance(Integer balance) {
		this.balance = balance;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public LocalDateTime getOpeningDate() {
		return openingDate;
	}

	public void setOpeningDate(LocalDateTime openingDate) {
		this.openingDate = openingDate;
	}

	public LocalDateTime getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(LocalDateTime updateDate) {
		this.updateDate = updateDate;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}
	
	
	

}
