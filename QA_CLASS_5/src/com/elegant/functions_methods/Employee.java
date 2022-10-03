package com.elegant.functions_methods;

public class Employee {
	
	public void emp_info() {
		
		System.out.println(" employee information ");
		
	}
	
	public void emp_salary() {
		
		System.out.println("employee salary");
	}
	

	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.emp_info();
		e.emp_salary();
		

	}

}
