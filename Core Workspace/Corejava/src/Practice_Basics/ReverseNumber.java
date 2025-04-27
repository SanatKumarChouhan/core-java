package Practice_Basics;

public class ReverseNumber {
	
	public static void main(String[] args) {
		
		int a=987654321;
		
		int b=0;
		
		int c;
		
		while(a!=0) {
			
			c = a%10;
			
			b = b*10+c;
			
			a = a/10;
		}
		
		System.out.println(b);
	}

}
