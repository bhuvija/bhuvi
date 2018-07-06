package com.capgemini.shopManagement.userinterface;

import java.util.List;
import java.util.Scanner;



import com.capgemini.shopManagement.Exceptions.CustomExp;
import com.capgemini.shopManagement.entity.Product;
import com.capgemini.shopManagement.service.ProductService;
import com.capgemini.shopManagement.service.ProductServiceImpl;

public class SampleProject {
	public static void main(String[] args) throws CustomExp {
		ProductService service;//Reference to service package
		{
			service = new ProductServiceImpl();
		}
		List mylist;
		Scanner sc = new Scanner(System.in);
		String ans;
		int no;
		do {
			System.out.println("**********Dmart Products Services");
			System.out.println("1.Add Product");
			System.out.println("2.Display all products data");
			System.out.println("3.Search for a product");
			System.out.println("4.Delete a new record");
			System.out.println("5.Update the cost");
			System.out.println("6.Exit");
			System.out.println("Pls enter your choice");
			no = sc.nextInt();

			switch (no) {
			case 1:
				//System.out.println("**********Enter Product details **********************");
				
				
				System.out.println("Enter company");
				String cName=sc.next();
				System.out.println("Enter model");
				String mName=sc.next();
				System.out.println("Enter coast");
				float c=sc.nextFloat();
				
				Product p=new Product(cName,mName,c);
				
				int prdId=service.addProducts(p);
				System.out.println("Your product id:"+prdId);
				System.out.println(p);
				break;
			case 2:
				List<Product> prdList=service.listAllProductRecords();
				System.out.println(prdList);
				break;
			case 3:
				System.out.println("Enter Product id");
				int pId=sc.nextInt();
				Product product=service.getProductById(pId);
				System.out.println(product);
				break;
			case 4:
				System.out.println("Enter Product id that to be deleted");
				int deleteId=sc.nextInt();
				Product deleteproduct=service.deleteProductById(deleteId);
				System.out.println("ID is deleted");
				break;
			case 5:
				System.out.println("Enter the product id to be updated");
				int upId=sc.nextInt();
				System.out.println("Enter the updated coast");
				float upcoast=sc.nextFloat();
				Product updateproduct=service.updateCost(upId,upcoast);
				System.out.println(updateproduct);
			default:
				System.out.println("some error in switch case");
				break;
			}
			System.out.println("do you want to continue yes/no");

			ans = sc.next();
		} while (ans.equals("yes") || ans.equals("no") || ans.equals("y")
				|| ans.equals("n"));
	}
}
