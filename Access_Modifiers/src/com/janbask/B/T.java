package com.janbask.B;

import com.janbask.A.Default_Example;
import com.janbask.A.Protected_Example;

public class T extends Protected_Example {

	public static void main(String[] args) {
		/*
		 * Default_Example de= new Default_Example(); System.out.println(de.age);
		 * System.out.println(de.name); de.method1();
		 */

		
T t = new T();
System.out.println(t.age);
System.out.println(t.name);
t.method1();
		
	}

}
