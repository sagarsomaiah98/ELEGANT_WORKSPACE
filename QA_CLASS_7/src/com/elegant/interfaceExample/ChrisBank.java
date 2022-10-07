package com.elegant.interfaceExample;

public class ChrisBank implements CentralBank {
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChrisBank c= new ChrisBank();
		c.savings_account();
		c.loan();
		c.insurance();

	}

	@Override
	public void savings_account() {
		System.out.println("Chris bank saving account is free");
		
	}

	@Override
	public void loan() {
		// TODO Auto-generated method stub
		
		System.out.println("Chris bank loan interest rate is 3%");
		
	}

	@Override
	public void insurance() {
		// TODO Auto-generated method stub
		System.out.println("Chris bank insurance for quater is 25 $");
	}

	@Override
	public void kyc() {
		// TODO Auto-generated method stub
		
	}

}
