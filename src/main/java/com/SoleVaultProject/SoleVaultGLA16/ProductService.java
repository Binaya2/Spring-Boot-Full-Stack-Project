package com.SoleVaultProject.SoleVaultGLA16;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	@Autowired
	private ProductRepository repo;

	public List<Products> getAllProducts() {
		return repo.findAll();
	}

	public void addProducts(Products p) {
		repo.save(p);

	}

	public void deleteByID(int shoeId) {
		repo.deleteById(shoeId);
	}

	public List<Products> getMostPopular() {
		return repo.findTop10ByOrderByUnitsSoldDesc();

	}
//		public List<Products> getMostPopularProducts(){
//			repo.findAll();
//			Collections.sort(products,Comparator.comparingInt(Products::getUnitsSold).reversed());
//			return
//					Products.stream().limit(5).collect(Collectors.toList());
//		}

}
