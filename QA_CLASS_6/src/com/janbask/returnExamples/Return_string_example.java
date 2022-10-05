package com.janbask.returnExamples;

public class Return_string_example {
	
	
	public String substr(String input) {
		
		
		String changed_input=input.substring(5,10);
		
		//System.out.println(changed_input);
		return changed_input;
		
	}

	public static void main(String[] args) {
	
		Return_string_example r= new Return_string_example();
		String v= r.substr("WeLCOME TO jANBASK");
		
	   System.out.println(v.toLowerCase());
		
		
		

	}

}
