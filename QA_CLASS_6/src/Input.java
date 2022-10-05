import java.util.Scanner;

public class Input {

	
	public static void main(String args[]) {
		
		
		//Scanner is built in class to read the user input values
		Scanner scan=new Scanner(System.in); 
		
		
		System.out.print("Enter the number: ");  
		//reading value from the user  
	     int num=  scan.nextInt(); 
		//method calling  
	     
	     System.out.println("Number entered is "+num);
	     
	     
	     System.out.println("Enter the double value");
	     
	     double value=scan.nextDouble();
	     
	     System.out.println("Double value entered is "+value);
		
		
		
		//findEvenOdd(num); 
	}
}
