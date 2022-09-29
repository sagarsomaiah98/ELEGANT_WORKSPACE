package com.trycatch;

public class tryCatch2 {

	public static void main(String[] args) {
		try {
		String[]  student= new String[2];
		student[0]="john";
		student[1]="henry";
		student[0]="james";
		
		System.out.println(student[0]);
		System.out.println(student[1]);
		}
		catch(Exception e) {
			
			System.out.println("found error while storing and retrieving the arrays");
		}
		
		
		int[] marks=new int[4];
		
		marks[0]=200;
		marks[1]=300;
		marks[2]=100;
		marks[3]=120;
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		
	}

}
