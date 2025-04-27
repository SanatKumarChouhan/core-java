package Practice_Basics;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		int num=7;
		
		int count=0;
		
		for(int i=2; i<num; i++) {
			
			if(num%i==0) {
				
				count= count+1;
			}
		}
		
		if(count==0) {
			
			System.out.println("Yes, This is a Prime Number");
		
		}else {
			
			System.out.println("NO, This is not a Prime Number");
		}
		
	}

}
