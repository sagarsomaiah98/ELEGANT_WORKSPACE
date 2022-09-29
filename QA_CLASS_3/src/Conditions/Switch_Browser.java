package Conditions;

public class Switch_Browser {
	
	
	public static void main(String args[]) {
		
	

	String Browser ="EDGE";
	
	switch(Browser)
	{
	case "CHROME":
		System.out.println("chrome launch");
		break;
		
	case "FIREFOX":
		System.out.println("firefox launch");
		break;
		
	case "EDGE":
		System.out.println("edge launch");
		break;
		
	case "IE":
		System.out.println("IE launch");	
		break;
	case "SAFARI":
		System.out.println("safari launch");	
		break;
	default:
		System.out.println("INVALID BROWSER");
		
	
	}
	
	
	}

}
