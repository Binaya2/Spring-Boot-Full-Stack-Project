package com.SoleVaultProject.SoleVaultGLA16;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Products {
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	 private int shoeId;
	 private String brandName;
	 private String modelName;
	 private double rrp;
	 private int marketValue;
	 private int unitsSold;
	 
	public Products() {}

	public Products(int shoeId, String brandName, String modelName, int rrp, int marketValue, int unitsSold) {
		this.shoeId = shoeId;
		this.brandName = brandName;
		this.modelName = modelName;
		this.rrp = rrp;
		this.marketValue = marketValue;
		this.unitsSold = unitsSold;
	}

	public int getShoeId() {
		return shoeId;
	}

	public void setShoeId(int shoeId) {
		this.shoeId = shoeId;
	}

	public void setRrp(double rrp) {
		this.rrp = rrp;
	}

	public int getUnitsSold() {
		return unitsSold;
	}

	public void setUnitsSold(int unitsSold) {
		this.unitsSold = unitsSold;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public double getRrp() {
		return rrp;
	}

	public void setRrp(int rrp) {
		this.rrp = rrp;
	}

	public int getMarketValue() {
		return marketValue;
	}

	public void setMarketValue(int marketValue) {
		this.marketValue = marketValue;
	}
	
	

}
