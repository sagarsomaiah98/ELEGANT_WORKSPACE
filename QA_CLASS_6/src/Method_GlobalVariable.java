
public class Method_GlobalVariable {
	
	//global variables
	
	int age=30;
	
	String name="Paul";
	
	double height=6.3;
	
	//Method declaration
	public void display() {
		
		//Accessing global variables inside method
		age=age+10;
		
		System.out.println("Age is "+age);
		System.out.println("Name is "+name);
		System.out.println("Height is "+height);
		
		
	}
	
	
	public void change() {
		height=height+1.0;
		System.out.println("Age is "+age);
		System.out.println("Name is "+name);
		System.out.println("Height is "+height);
		
		
	}
	
	

	public static void main(String[] args) {
		
		Method_GlobalVariable m= new Method_GlobalVariable();
		m.display();
		System.out.println("**************************************");
		m.change();
		

	}

}
