package in.pw.ioi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Variant {
	
	@Id
	private Integer varId;
	
	private String varSize;
	
	
	@ManyToOne
	@JoinColumn(name="pidFk")
	private Products product;
	
	
	public Variant() {
		
	}


	public Variant(Integer varId, String varSize, Products product) {
		super();
		this.varId = varId;
		this.varSize = varSize;
		this.product = product;
	}


	public Integer getVarId() {
		return varId;
	}


	public void setVarId(Integer varId) {
		this.varId = varId;
	}


	public String getVarSize() {
		return varSize;
	}


	public void setVarSize(String varSize) {
		this.varSize = varSize;
	}


	public Products getProduct() {
		return product;
	}


	public void setProduct(Products product) {
		this.product = product;
	}


	@Override
	public String toString() {
		return "Variant [varId=" + varId + ", varSize=" + varSize + ", product=" + product + "]";
	}
	
	

	
}
