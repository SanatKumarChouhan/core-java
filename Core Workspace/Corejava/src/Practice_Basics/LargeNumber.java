package Practice_Basics;

public class LargeNumber {
	
	public static void main(String[] args) {
		
		int [] num = {34, 74, 34, 85, 93, 43, 84};
		
		int a = 0;
		
		for (int i = 0; i < num.length; i++) {
			
			if (num[i]>a) {
				
				a = num[i];
				
			}
		}
		
		System.out.println(a);
	}

}
