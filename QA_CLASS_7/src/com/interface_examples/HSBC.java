package com.interface_examples;

public class HSBC  implements Central_Bank {



	@Override
	public void savings() {
		
		System.out.println("HSBC savings account interest rate is 4.5%");
		
	}

	@Override
	public void insurance() {
		System.out.println("HSBC insurance is 100$");
		
	}
	
	

	
	public static void main(String[] args) 
	{
		HSBC h = new HSBC();
		
		h.savings();
		h.insurance();
		

	}

	@Override
	public void kyc() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void locker() {
		// TODO Auto-generated method stub
		
	}

}
