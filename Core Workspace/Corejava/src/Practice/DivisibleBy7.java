package Practice;

public class DivisibleBy7 {
	
	public static void main(String[] args) {
		
		int sum=0;
		
		
		for (int i=1; i<=100; i++) {
			if (i%7==0) {
				
				int count=i;
				System.out.println(count);
				sum=sum+i;
				
				
			}
		}
		System.out.println(sum);
		
	}

}
