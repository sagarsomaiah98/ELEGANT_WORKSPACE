package Break_Continue;

public class Continue_Keyword {

	public static void main(String[] args) {
        int key=7;
		
		for(int i=0;i<10;i++) {
			if(key==i)
				continue;
			
			System.out.println(i);
		
		}
	}
}
