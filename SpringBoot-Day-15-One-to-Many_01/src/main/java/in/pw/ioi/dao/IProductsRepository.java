package in.pw.ioi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import in.pw.ioi.model.Products;

public interface IProductsRepository extends JpaRepository<Products, Integer> {

	

}
