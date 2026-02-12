package in.pw.ioi.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table
public class Products {
	
	@Id
	private Integer pId;
	
	private String pName;
	
	private String pCost;
	
	@OneToMany(mappedBy="product")
	private List<Variant> variant;
	
	public Products() {
		
	}

	public Products(Integer pId, String pName, String pCost) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pCost = pCost;
	}

	public Integer getpId() {
		return pId;
	}

	public void setpId(Integer pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getpCost() {
		return pCost;
	}

	public void setpCost(String pCost) {
		this.pCost = pCost;
	}

	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + ", pCost=" + pCost + "]";
	}

	
	

	
	
}
