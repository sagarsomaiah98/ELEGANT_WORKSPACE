
public class MethodLocalVariable {
	
	int age=70;
	String name="Chris";
	
public void display1() {
		
		//Defining local variable- variable inside the method
		int age=30;
		String name="Paul";
		
		double height=5.5;
		
		System.out.println("Age is "+age);
		System.out.println("Name is "+name);
		System.out.println("Height is "+height);
		//this keyword is used to access global variable
		System.out.println(this.age);
		System.out.println(this.name);
		
		
	}
	
	
	public void display2() {
		
		//Defining local variable- variable inside the method
		int age=10;
		String name="Kevin";
		double height=4.5;
		
		     System.out.println("Age is "+age); 
		  System.out.println("Name is "+name);
		  System.out.println("Height is "+height);
		 
		
		
	}
	

	public static void main(String[] args) {
		
		
		MethodLocalVariable m= new MethodLocalVariable();
		m.display1();
		System.out.println("**********************");
		m.display2();
		

	}

}
