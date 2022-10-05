
public class MinNumber {
	
	//user defined methods
	public void minNumber(int a , int b) {
		
		if(a<b)
			System.out.println(a+" is minimum number");
		else
			System.out.println(b+" is minimum number");
		
		
		
	}
	
	
	public static void main(String args[]) {
		
		MinNumber m = new MinNumber();
		m.minNumber(120, 135);
		m.minNumber(55, 20);
		m.minNumber(55, 10);
	}

}
