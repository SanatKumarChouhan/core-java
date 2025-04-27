package Practice_Basics;

public class SwitchCase {
	
	public static void main(String[] args) {
		
		String month="march";
		
		switch (month) {
		
		case "january":
			System.out.println("first month of the year");
			break;
		
		case "fabuary":
			System.out.println("second month of the year");
			break;
		
		case "march":
			System.out.println("third month of the year");
			break;
			
		case "april":
			System.out.println("fourth month of the year");
			break;
			
		default:
			
			System.out.println("input not found");
		}
		
		String name="saga";
		
		switch (name) {
		
		case "sagar":
			System.out.println("7771041580");
			break;
			
		case "sameer":
			System.out.println("7486285935");
			break;
			
		case "sanat":
			System.out.println("9179118642");
			break;
			
		case "bittu":
			System.out.println("4563289765");
			break;
			
		default:
			
			System.out.println("contact not found");
			break;
		}
		
		int rollno=44;
		
		switch (rollno) {
		
		case 41:
			System.out.println("sameer");
			break;
			
		case 42:
			System.out.println("sahil");
			break;
			
		case 43:
			System.out.println("prakhar");
			break;
			
		default:
			System.out.println("not found");
			break;
		}
	}

}
