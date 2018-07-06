package com.capgemini.shopManagement.junittest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.capgemini.shopManagement.Exceptions.CustomExp;
import com.capgemini.shopManagement.dao.ProductDao;
import com.capgemini.shopManagement.dao.ProductDaoImpl;
import com.capgemini.shopManagement.entity.Product;

public class ProductTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
	}

	@Test
	public void GetCompanyName(){
		Product product = new Product(20000.00f);
		assertEquals("Capgemini",product.getCompanyName());
	}
	@Test
	public void GetModelName(){
		Product product1=new Product();
		assertEquals("JEE Full Stack",product1.getModelName());
	}
	@Test
	public void GetId() throws CustomExp{
		ProductDao serviceDao=new ProductDaoImpl();
		Product Product2=new Product("Samsung","Galaxy7",20000.0f);
		int prdId=serviceDao.addProduct(Product2);
		assertEquals(112, prdId);
	}
}
