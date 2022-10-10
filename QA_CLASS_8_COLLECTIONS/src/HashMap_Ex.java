import java.util.HashMap;

public class HashMap_Ex {

	public static void main(String[] args) {
		
		HashMap<String,Integer> score= new HashMap<String,Integer>();
		
		score.put("steve", 90);
		score.put("rose", 85);
		score.put("merlin", 65);
		score.put("joe", 70);
		score.put("kevin", 69);
		
		System.out.println(score.get("merlin"));
		System.out.println(score.containsKey("bob"));
		System.out.println(score.containsValue(90));
		System.out.println(score);
		
	}

}
