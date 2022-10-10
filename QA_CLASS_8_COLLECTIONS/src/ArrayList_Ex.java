import java.util.ArrayList;
import java.util.List;

public class ArrayList_Ex {

	public static void main(String[] args) {
		
		
		List<String>  names=new ArrayList<String>();
		
		names.add("JAMES");//0
		names.add("LEE");//1
		names.add("HENRY");//2
		names.add("STEVE");//3
		names.add("BRUCE");//4
		names.add("LEE");//5
		names.add("HENRY");//
	
		
		System.out.println(names.size());
		
	//	System.out.println(names.get(7));
		
		
		for(int i=0;i<names.size();i++) {
			System.out.println(names.get(i));
		}

	}

}
