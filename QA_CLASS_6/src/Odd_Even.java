
public class Odd_Even {
	
	
	public  void findEvenOdd(int num)  
	{  
	//method body  
	if(num%2==0)   
	System.out.println(num+" is even");   
	else   
	System.out.println(num+" is odd");  
	}  

	public static void main(String[] args) {
		
		
		//CLASSNAME OBJECT/KEY= NEW CLASSNAME();
		
		Odd_Even o= new Odd_Even();
		
		o.findEvenOdd(21);
		o.findEvenOdd(16);
		o.findEvenOdd(23);
		o.findEvenOdd(11);
		

	}

}
