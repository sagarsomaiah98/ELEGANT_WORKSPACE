
public class Array_Ex {

	public static void main(String[] args) {
		
		
		//single dimension array
		
		String[]  student= new String[10];
		student[0]="john";
		student[1]="henry";
		student[2]="kevin";
		student[3]="joe";
		student[4]="lee";
		student[1]="bob";
		student[1]="steve";
		
		System.out.println(student.length);
		
	//	System.out.println(student[1]);
		
		for(int i=0;i<student.length;i++) {
			
			System.out.println(student[i]);
		}
		

	}

}
