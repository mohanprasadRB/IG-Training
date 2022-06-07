package com.java.DesignPattern.Factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

abstract class Plan{  
    protected double rate;  
    abstract void getRate();  

    public void calculateBill(int units){  
         System.out.println(units*rate);  
     }  
}

class  DomesticPlan extends Plan{  
    //@override  
     public void getRate(){  
         rate=3.50;              
    }  
}

class CommercialPlan extends Plan {

	@Override
	void getRate() {
		rate = 7.50;
	}
}

class InstitutionalPlan extends Plan {

	@Override
	void getRate() {
		rate=5.50;
	}
}

class GetPlanFactory {
	
	public Plan getplan(String planType) {
		if(planType == null)
		{
			return null;
		}
		 
		if(planType.equalsIgnoreCase("DOMESTICPLAN"))
		{
			return new DomesticPlan();
		}
		else if(planType.equalsIgnoreCase("COMMERCIALPLAN"))
		{
			return new CommercialPlan();
		}
		else if (planType.equalsIgnoreCase("INSTITUTIONALPLAN"))
		{
			return new InstitutionalPlan();
		}
		return null;
	
		
		
}
}
public class Factory_Pattern
{
	public static void main(String[] args) throws IOException {
		
		GetPlanFactory planFactory = new GetPlanFactory();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		
		System.out.println("Enter the name of the plan for which the bill will be generated");
		String planName = br.readLine();
		
		System.out.println("Enter the number of units for bill will be calculated");
		int units = Integer.parseInt(br.readLine());
		
		Plan p = planFactory.getplan(planName);
		
		System.out.println("Bill amount for :"+planName+" of "+units+" unit is ");
		p.getRate();
		p.calculateBill(units);
	}
}
