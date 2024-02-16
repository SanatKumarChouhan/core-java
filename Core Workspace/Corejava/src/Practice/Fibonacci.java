package Practice;

public class Fibonacci {
	
	public static void main(String[] args) {
		
		int x=0;
		int y=1;
		
		System.out.println(x);
		System.out.println(y);
		
		for (int i=1; i<=5; i++) {
			
			int z=x+y;
			
			x=y;
			y=z;
			
			System.out.println(z);
		}
		
	}

}
