package com.capgemini.shopManagement.entity;

public class Product {
	int id;
	 String companyName;
 String modelName;
	 float coast;
	public Product(String companyName, String modelName, float coast) {
		super();
		this.id=00;
		this.companyName = companyName;
		this.modelName = modelName;
		this.coast = coast;
	}
	
	public Product() {
		super();
		
		this.modelName="JEE Full Stack";
		
	}

	public Product(float f) {
		super();
		
		this.companyName="Capgemini";
		
		this.coast=0.0f;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public float getCoast() {
		return coast;
	}
	public void setCoast(float coast) {
		this.coast = coast;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", companyName=" + companyName
				+ ", modelName=" + modelName + ", coast=" + coast + "]";
	}
	
	
	
	

}
