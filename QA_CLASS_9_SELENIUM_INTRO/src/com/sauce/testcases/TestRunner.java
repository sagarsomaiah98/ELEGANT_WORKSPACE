package com.sauce.testcases;

public class TestRunner {

	public static void main(String[] args) {
		
		
		LoginTest l = new LoginTest();
		l.login();
		
		AddTocartTest a = new AddTocartTest();
		a.addtocart();
		
		LogOutTest lo= new LogOutTest();
		
		lo.logout();

	}

}
