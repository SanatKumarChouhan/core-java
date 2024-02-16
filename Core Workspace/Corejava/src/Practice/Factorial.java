package Practice;

public class Factorial {
	
	public static void main(String[] args) {
		
		int a=1;
		int b=1;
		
		while (a<=5) {
			
			b=a*b;
			System.out.println(b);
			a++;
		}
	}

}
