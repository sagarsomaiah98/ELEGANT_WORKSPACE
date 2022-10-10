import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_Ex {

	public static void main(String[] args) {
		
		//set doesnt store duplicate values
		
		Set<String> names= new HashSet<String>();
		
		names.add("JAMES");
		names.add("LEE");
		names.add("HENRY");
		names.add("STEVE");
		names.add("BRUCE");
		names.add("james");
		names.add("Lee");
		names.add("STEVE");
		names.add("HENRY");
		
		System.out.println(names.size());
		
		Iterator<String> itr=names.iterator();
		/*
		 * System.out.println(itr.next()); System.out.println(itr.hasNext());
		 * System.out.println(itr.next()); System.out.println(itr.hasNext());
		 * System.out.println(itr.next()); System.out.println(itr.hasNext());
		 * System.out.println(itr.next()); System.out.println(itr.hasNext());
		 * System.out.println(itr.next()); System.out.println(itr.hasNext());
		 */
		
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
		
		
		
		
	}

}
