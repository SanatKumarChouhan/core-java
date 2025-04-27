package Practice_Basics;

public class Loops {

	public static void main(String[] args) {

		for (int i = 1; i <= 30; i++) {
			System.out.println(i);
		}
		
		System.out.println();
		
		for(int i=1; i<=20; i++) {
			if (i%2==0)
			System.out.println(i);
		}
		
		//odd numbers by for loops//
		
		System.out.println("odd no.");
		
		int i;
		
		for(i=1; i<=100; i++) {
			if(i%2==1)
				System.out.println(i);
		}
		System.out.println();
		
		//table of two's//
		System.out.println("table of two");
		
		for(i=0; i<=20; i=i+2) {
			System.out.println(i);
		}
		System.out.println();
		
		//table of three.
		
		for(int j=0; j<=30; j=j+3)
			for(int m=0; m<=10; m++){
			
			System.out.println("3 X "+m+" = "+j);
			
		}
	}

}
