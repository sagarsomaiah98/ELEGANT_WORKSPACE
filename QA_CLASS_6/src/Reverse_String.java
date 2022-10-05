
public class Reverse_String {

	public static void main(String[] args) {
		
		// you are given a string and you need to reverse the string
		
		//input : WELCOME output:EMOCLEW
		
		
		String input="SELENIUMTRAINING";
		int len =input.length();
		//System.out.println(len);
		
		for(int i=len-1;i>=0;i--) {
			
			System.out.print(input.charAt(i));
			
		}
		
		
	
		
		
		

	}

}
