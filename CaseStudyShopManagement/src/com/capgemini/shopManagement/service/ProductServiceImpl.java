package com.capgemini.shopManagement.service;

import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

import com.capgemini.shopManagement.Exceptions.CustomExp;
import com.capgemini.shopManagement.dao.ProductDao;
import com.capgemini.shopManagement.dao.ProductDaoImpl;
import com.capgemini.shopManagement.entity.Product;

public class ProductServiceImpl implements ProductService {
	private ProductDao serviceDao;
	private ArrayList<Product> mylist;

	public ProductServiceImpl() {
		serviceDao = new ProductDaoImpl();// reference to dao layer
	}

	@Override
	public int addProducts(Product p) throws CustomExp {

		acceptProductDetails(p);
		int prdId = serviceDao.addProduct(p);
		return prdId;
	}

	public void acceptProductDetails(Product p) throws CustomExp{
		Scanner scan = new Scanner(System.in);
		while (true) {
			String str = p.getCompanyName();
			if (validateName(str)) {
				break;

			}
			else{
				System.err.println("Wrong Company Name!! \n Please Enter the company as Capital Letter");
				System.out.println("Enter Compnay Name again Eg.Company");
				p.setCompanyName(scan.next());
			}
		}
		while(true){
			String str1=p.getModelName();
			if (validateName(str1)) {
				break;

			}
			else{
				System.err.println("Wrong Model Name!! \n Please Enter the model as Capital Letter");
				System.out.println("Enter Model Name again Eg.Model");
				p.setModelName(scan.next());
			}
			
		}

	}

	public boolean validateName(String pName) {
		String pattern ="[A-Z][a-z]*";
		if (pName.matches(pattern)) {
			return true;

		} else
			return false;
	}

	@Override
	public List<Product> listAllProductRecords() throws CustomExp {

		return serviceDao.listAllProductRecords();
	}

	@Override
	public Product getProductById(int pId) throws CustomExp {
		Product product = serviceDao.getProductById(pId);
		return product;
	}

	@Override
	public Product deleteProductById(int deleteId) throws CustomExp {
		Product dproduct=serviceDao.deleteProductById(deleteId);
		return serviceDao.deleteProductById(deleteId);
	}

	@Override
	public Product updateCost(int upId, float upcoast) throws CustomExp {
		Product upproduct=serviceDao.updateCost(upId,upcoast);
		return serviceDao.updateCost(upId, upcoast);
		
	}

	
	
}
