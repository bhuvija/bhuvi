package com.capgemini.shopManagement.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.capgemini.shopManagement.Exceptions.CustomExp;
import com.capgemini.shopManagement.entity.Product;

public class ProductDaoImpl implements ProductDao {
	static int prdId = 111;
	Product product = null;
	Product dproduct = null;
	Product upproduct = null;
	public ArrayList<Product> list;
	{
		list = new ArrayList();
	}

	@Override
	public int addProduct(Product p) throws CustomExp {
		try {
			prdId++;
			p.setId(prdId);
			list.add(p);
			return prdId;
		} catch (Exception e) {
			throw new CustomExp("Sorry could not add the data in the data base");
		}

	}

	@Override
	public List<Product> listAllProductRecords() throws CustomExp {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Product getProductById(int pId) throws CustomExp{
		Iterator<Product> iterator = list.iterator();
		while (iterator.hasNext()) {
			product = iterator.next();
			if (product.getId() == pId) {
				return product;

			}

		}
		return null;
	}

	@Override
	public Product deleteProductById(int deleteId) {
		Iterator<Product> iterator = list.iterator();
		while (iterator.hasNext()) {
			dproduct = iterator.next();
			if (dproduct.getId() == deleteId) {
				list.remove(dproduct);
				return dproduct;
			}
		}
		return null;
	}

	@Override
	public Product updateCost(int upId, float upcoast) {

		Iterator<Product> iterator = list.iterator();
		while (iterator.hasNext()) {

			upproduct = iterator.next();
			if (upproduct.getId() == upId) {
				upproduct.setCoast(upcoast);
				return upproduct;
			}
			else{
				System.out.println("There is no mobile of that id");
				return null;
			}
		}
		return null;
	}

}
