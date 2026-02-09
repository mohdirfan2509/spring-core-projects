package in.pw.ioi.model;


import java.util.List;
import java.util.Map;
import java.util.Set;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapKeyColumn;
import jakarta.persistence.OrderColumn;
import jakarta.persistence.Table;

@Entity
@Table(name="Product")
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer pId;
	
	
	private String pCode;
	
	@ElementCollection
	@CollectionTable(name="product_colors",joinColumns=@JoinColumn(name="pidFk"))
	@OrderColumn(name="pos")
	@Column(name="data")
	private List<String> colors;
	
	@ElementCollection
	@CollectionTable(name="product_models",joinColumns=@JoinColumn(name="pidFk"))
	@Column(name="model")
	private Set<String> models;
	
	
	@ElementCollection
	@CollectionTable(name="product_details",joinColumns=@JoinColumn(name="pidFk"))
	@MapKeyColumn(name="code")
	@Column(name="details")
	private Map<String,String> details;
	
	public Product() {
		
	}

	public Product(String pCode, List<String> colors, Set<String> models, Map<String, String> details) {
		super();
		this.pCode = pCode;
		this.colors = colors;
		this.models = models;
		this.details = details;
	}
    
	
	public Integer getpId() {
		return pId;
	}
	public void setpId(Integer pId) {
		this.pId = pId;
	}
	public String getpCode() {
		return pCode;
	}

	public void setpCode(String pCode) {
		this.pCode = pCode;
	}

	public List<String> getColors() {
		return colors;
	}

	public void setColors(List<String> colors) {
		this.colors = colors;
	}

	public Set<String> getModels() {
		return models;
	}


	public void setModels(Set<String> models) {
		this.models = models;
	}

	public Map<String, String> getDetails() {
		return details;
	}

	public void setDetails(Map<String, String> details) {
		this.details = details;
	}

	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pCode=" + pCode + ", colors=" + colors + ", models=" + models + ", details="
				+ details + "]";
	}

	

}
