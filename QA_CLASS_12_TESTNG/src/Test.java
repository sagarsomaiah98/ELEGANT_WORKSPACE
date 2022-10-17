
public class Test {
	
	public void method1() {
		
		System.out.println("calling method 1");
	}
	public void method2() {
		
		System.out.println("calling method 2");
	}

	public void method3() {
		
		System.out.println("calling method 3");
	}


	public static void main(String[] args) {
		
		Test t = new Test();
		t.method1();
		t.method2();
		t.method3();
		

	}

}
