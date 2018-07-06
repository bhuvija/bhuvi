package com.capgemini.shopManagement.service;

import java.util.List;



import com.capgemini.shopManagement.Exceptions.CustomExp;
import com.capgemini.shopManagement.entity.Product;

public interface ProductService {
	public abstract int addProducts(Product P) throws CustomExp;
	public List<Product> listAllProductRecords() throws CustomExp;

	public abstract Product getProductById(int pId) throws CustomExp;
	public abstract Product deleteProductById(int deleteId) throws CustomExp;
	public abstract Product updateCost(int upId, float upcoast) throws CustomExp;
	
}
