package com.java.LambdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Lambda_Exp_Filter  {
	
	public static void main(String[] args) {
		
		List<Product> list = new  ArrayList<Product>();
		list.add(new Product(101, "Sony Laptop", 1000));
		list.add(new Product(102, "Del  Laptop", 2000));
		list.add(new Product(100, "HP   Laptop", 1500));
		 
		
		//Using Lambda to filter data
		
		Stream<Product> filteredData = list.stream().filter((predicate)->predicate.id==100);
		
		filteredData.forEach(action->System.out.println
				(action.id+" "+action.name+" "+action.price));
	}

}
