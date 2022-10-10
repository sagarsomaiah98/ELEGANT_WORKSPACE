import java.util.LinkedList;
import java.util.List;

public class LinkedList_Ex {

	public static void main(String[] args) {
		
		
		List<String> names= new LinkedList<String>();
		
		names.add("JAMES");//0
		names.add("HENRY");//1
		names.add("WILL");//2
		names.add("HONG");//3
		names.add("LEE");//4
		names.add("STEVE");//5
		names.add("DANNY");//6
		
		System.out.println(names.size());
		
	//	System.out.println(names.get(7));
		
		
		for(int i=0;i<names.size();i++) {
			System.out.println(names.get(i));
		}

	}


	}


