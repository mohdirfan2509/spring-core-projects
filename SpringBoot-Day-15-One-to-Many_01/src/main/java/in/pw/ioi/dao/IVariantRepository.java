package in.pw.ioi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import in.pw.ioi.model.Variant;

public interface IVariantRepository extends JpaRepository<Variant, Integer> {

	

}
