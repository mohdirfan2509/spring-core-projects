package in.pw.ioi.model;

import java.util.Arrays;

import jakarta.persistence.Lob;

public class MarriageSeeker{
	
	private Integer id;
	private String name;
	private String address;
	
	@Lob
	private byte[] photo;
	
	@Lob
	private char[] biodata;
	
	public MarriageSeeker() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	public char[] getBiodata() {
		return biodata;
	}

	public void setBiodata(char[] biodata) {
		this.biodata = biodata;
	}

	@Override
	public String toString() {
		return "MarriageSeeker [id=" + id + ", name=" + name + ", address=" + address + ", photo="
				+ Arrays.toString(photo) + ", biodata=" + Arrays.toString(biodata) + "]";
	}
	
	
}