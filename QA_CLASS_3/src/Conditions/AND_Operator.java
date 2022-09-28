package Conditions;

public class AND_Operator {

	public static void main(String[] args) {
		
		//assignment - find greatest of 4 numbers
		
		int a=35;
		int b=30;
		int c=10;
		int d=78;
		
		
		if(a>b & a>c)//true & true
			System.out.println(a+" is greater");
		
		else if(b>c)// true
			System.out.println(b+" is greatest");
		else
			System.out.println(c+" is greatest ");
		

	}

}
