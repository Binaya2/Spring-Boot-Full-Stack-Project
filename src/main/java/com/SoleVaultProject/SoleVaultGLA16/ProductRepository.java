package com.SoleVaultProject.SoleVaultGLA16;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Products, Integer> {
	List<Products> findTop5ByOrderByUnitsSoldDesc();

	List<Products> findTop10ByOrderByUnitsSoldDesc();

}
