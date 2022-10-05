package com.janbask.builtInMethods;

public class StringFunctions_Ex {

	public static void main(String[] args) {	
		
		           //0123456789
		String input="WELCOME TO JAVA TRAINING";
		String msg="Welcome  Rahul to Elegant institute";
		
		String confirmation="your order is placed and order number is 25463";
		
		System.out.println(input.charAt(5));//character at specific index
		System.out.println(input.indexOf('E'));
		System.out.println(input.indexOf('E', 3));
		System.out.println(input.substring(15));
		System.out.println(input.substring(10,15));
		
		String[] value= confirmation.split(" ");
		
		System.out.println("*********************");
		
		for(int i=0;i<value.length;i++) {
		
		System.out.println(value[i]);
		}

	}

}
