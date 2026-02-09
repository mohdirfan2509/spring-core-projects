package in.pw.ioi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import in.pw.ioi.model.Product;

public interface IProductDao extends JpaRepository<Product, Integer> {

	

}
