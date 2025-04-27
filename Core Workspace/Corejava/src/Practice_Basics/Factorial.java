package Practice_Basics;

public class Factorial {
	
	public static void main(String[] args) {
		
		int a,b;
		
		a=1;
		b=1;
		
		while(a<=9) {
			
			b=a*b;
			
			System.out.println(b);
			
			a=a+2;
		}
	}

}
