package com.elegant.AbstractExample;

public class Test_abs extends Abstract_Ex{

	public static void main(String[] args) {
		
		Test_abs t = new Test_abs();
		
		t.kyc();
		t.savings();
		t.insurance();
		t.locker();
		

	}

	@Override
	public void savings() {
		System.out.println("savings ");
		
	}

	@Override
	public void insurance() {
	System.out.println("insurace");
		
	}

	@Override
	public void locker() {
		System.out.println("locker");
		
	}

}
