package com.interface_examples;

public class ICICI implements Central_Bank{

	public static void main(String[] args) {
		ICICI i = new ICICI();
		i.savings();
		
		i.insurance();
		

	}

	@Override
	public void savings() {
		System.out.println("ICICI savings account interest rate is 3.5%");
		
	}

	@Override
	public void insurance() {
		System.out.println("ICICI insurance is 50$");
		
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
