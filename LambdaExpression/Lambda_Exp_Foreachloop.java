package com.java.LambdaExpression;

import java.util.ArrayList;
import java.util.List;

public class Lambda_Exp_Foreachloop {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("Mohan");
		list.add("Rohan");
		list.add("Sohan");
		list.add("Wohan");
		
		
		
		System.out.println("");
		 for (String slist : list) {
			 System.out.print(" "+slist);
		 }
			 System.out.println("\n");
			 list.forEach((n)->System.out.print(" "+n));
			
		}
	}

