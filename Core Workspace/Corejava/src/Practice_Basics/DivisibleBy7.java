package Practice_Basics;

public class DivisibleBy7 {
	
	public static void main(String[] args) {
		
		int a=7;
		
		int sum=0;
		
		for(int i=0; i<=100; i=i+1) {
			
			if(i%a==0) {
				
				System.out.println(i);
				
				 sum=sum+i;
			}
		}
		
		System.out.println("sum = "+ sum);
	}

}
