package com.java.DesignPattern.Factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

interface Bank {
	String getBankName();
}

class HDFC implements Bank {
	
	private final String BNAME;

	HDFC() {
		 BNAME="HDFC BANK";
	}
	@Override
	public String getBankName() {
		// TODO Auto-generated method stub
		return BNAME;
	}
}


class  ICICI implements Bank {
	
	private final String BNAME;
	
	ICICI() {
		BNAME="ICICI BANK";
	}

	@Override
	public String getBankName() {
		// TODO Auto-generated method stub
		return BNAME;
	}
}

class SBI implements Bank{
	
	private final String BNAME;
	
	SBI() {
		
		BNAME="SBI BANK";
	}

	@Override
	public String getBankName() {
		// TODO Auto-generated method stub
		return BNAME;
	}
	
}

abstract class Loan {
	
	protected double rate;
	abstract void getInterestRate(double rate);
	
	public void calculateLoanPayment(double loanamount, int years) {
		
		 double EMI;
		 int n;
		 
		 n=years*12;
		 rate=rate/1200;
		 EMI=((rate*Math.pow((1+rate),n))/((Math.pow((1+rate),n))-1))*loanamount;
		 
		 System.out.println("Monthly EMI is " +EMI+" for the amount "+loanamount+" you have borrowed");

	}
}


class HomeLoan extends Loan
{

	@Override
	void getInterestRate(double rate) {
		// TODO Auto-generated method stub
		this.rate=rate;
		
	}
	
}

class BuisnessLoan  extends Loan{

	@Override
	void getInterestRate(double rate) {
		// TODO Auto-generated method stub
		this.rate=rate;
	}
	
}

class EducationLoan extends Loan{  
    public void getInterestRate(double r){  
      rate=r;  
}
}

abstract class AbstractFactory {
	public abstract Bank  getBank(String Bank);
	public abstract Loan getLoan(String Loan);
}

class BankFactory extends AbstractFactory  {

	@Override
	public Bank getBank(String bank) {
		// TODO Auto-generated method stub
		if(bank == null) { 
		return null;
		}
		else if (bank.equalsIgnoreCase("HDFC")) {
			return new HDFC();
		}
		else if (bank.equalsIgnoreCase("ICICI")) {
			return new ICICI();
		}
		else if(bank.equalsIgnoreCase("SBI")) {
			return new SBI();
		}
		
		return null;
	}

	@Override
	public Loan getLoan(String Loan) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

class LoanFactory extends AbstractFactory {
	
	 

	@Override
	public Bank getBank(String Bank) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Loan getLoan(String loan) {
		// TODO Auto-generated method stub
		if(loan == null) {
			return null;
		}
		
		if(loan.equalsIgnoreCase("Home")) {
			return new HomeLoan();
		}
		else if(loan.equalsIgnoreCase("Buisness")) {
			return new BuisnessLoan();
		}
		else if(loan.equalsIgnoreCase("Education")) {
			return new EducationLoan();
		}
		
		return null;
	}
	
}

class FactoryCreator {
	
	public static AbstractFactory getFactory(String choice) {
		if(choice.equalsIgnoreCase("Bank")) {
			return new BankFactory();
		}
		else if(choice.equalsIgnoreCase("Loan")) {
			return new LoanFactory();
		}
		return null;
	}
}
public class AbstractFacoryMain {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Eneter the name of the bank you want to take loan");
		String bankName = br.readLine();
		
		System.out.println("\n");
		System.out.println("Enter the type of Loan HOME EDUCATION BUISNESS loan");
		
		String loanName=br.readLine();
		AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");
		Bank b =  bankFactory.getBank(bankName);
		
		System.out.println("\n");
		System.out.println("Enter the Interest Rate for"+b.getBankName());
		
		double rate = Double.parseDouble(br.readLine());
		System.out.println("\n");
		System.out.println("Enter the Loan Amount you want");
		
		double loanAmount = Double.parseDouble(br.readLine());
		System.out.println("\n");
		System.out.println("Enter the number of years to pay your Loan");
		int years = Integer.parseInt(br.readLine());
		
		
		System.out.println("\n");
		System.out.println("You are taking the loan from " +b.getBankName());
		
		AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");
		Loan l = loanFactory.getLoan(loanName);
		l.getInterestRate(rate);
		l.calculateLoanPayment(loanAmount, years);
		
	}

}
