package in.pw.ioi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table
public class JobSeeker {
	
	@Column(name="jobSeekerId")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)    
	private Integer jsId;
	
	@Column(name="Name")
	private String jsName;
	
	@Column(name="Address")
	private String jsAddr;
	
	@Column(name="MobileNo")
	private Integer jsMobNo;
	
	@Lob
	private byte[] jsImage;
	
	@Lob
	private char[] jsResume;
	
	
	public JobSeeker() {}

	public JobSeeker(String jsName, String jsAddr, Integer jsMobNo) {
		super();
		this.jsName = jsName;
		this.jsAddr = jsAddr;
		this.jsMobNo = jsMobNo;
	}

	public Integer getJsId() {
		return jsId;
	}

	public void setJsId(Integer jsId) {
		this.jsId = jsId;
	}

	public String getJsName() {
		return jsName;
	}

	public void setJsName(String jsName) {
		this.jsName = jsName;
	}

	public String getJsAddr() {
		return jsAddr;
	}

	public void setJsAddr(String jsAddr) {
		this.jsAddr = jsAddr;
	}

	public Integer getJsMobNo() {
		return jsMobNo;
	}

	public void setJsMobNo(Integer jsMobNo) {
		this.jsMobNo = jsMobNo;
	}

	public byte[] getJsImage() {
		return jsImage;
	}

	public void setJsImage(byte[] jsImage) {
		this.jsImage = jsImage;
	}

	public char[] getJsResume() {
		return jsResume;
	}

	public void setJsResume(char[] jsResume) {
		this.jsResume = jsResume;
	}
	
	

	
}
