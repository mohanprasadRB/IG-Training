package com.java.LambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product
{
	int id;
	String name;
	double price;
	  Product()
	  {
		  System.out.println("Constructor Default");
	  }
	  
	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
}
public class Lambda_Exp_Comparator {
	
	public static void main(String[] args) {
		
		 List<Product> list = new ArrayList<Product>();
		 list.add(new Product(101, "HP Laptop", 45000));
		 list.add(new Product(102, "Del Laptop", 55000));
		 list.add(new Product(103, "Sony", 65000));
		 
		 list.forEach((n)->System.out.println(n.id+"\t"+n.name+"\t\t"+n.price));
	
		 
		 System.out.println("\n\nSorting on the basis of name");
		 
		 Collections.sort(list,(p1,p2)->{return p1.name.compareTo(p2.name);});
		 
		 list.forEach((n)->System.out.println(n.id+"\t"+n.name+"\t"+n.price));
		 
		 //using Foreach loop
		 for (Product product : list) {
			 System.out.println(product.id+"\t"+product.name+"\t"+product.price);
			
		}
		 
		 
	}

}
