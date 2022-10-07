package com.elegant.interfaceExample;

public class ICICI implements RBI {
	
	

	public static void main(String[] args) {
		
ICICI I = new ICICI();
I.savings();

	}

	@Override
	public void savings() {
	
		System.out.println("ICICI SAVINGS ACCOUNT MIN AMOUNT IS 25k");
		
	}

	@Override
	public void creditcard() {
		System.out.println("ICICI CREDIT CARD CHARGES 100$");
		
	}

	

	@Override
	public void kyc() {
		// TODO Auto-generated method stub
		
	}

}
