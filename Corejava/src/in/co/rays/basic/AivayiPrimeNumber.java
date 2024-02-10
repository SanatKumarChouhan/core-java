package in.co.rays.basic;

public class AivayiPrimeNumber {
	
	public static void main(String[] args) {
		
		int num=7;
		int count=0;
		
		for (int i=0; i<num; i++) {
			
			if (num%i==0) {
				count++;
			
			}
		}
		if (count==0) {
			System.out.println("This is your Prime number");
			
		}else {
			System.out.println("That is not your Prime Number");
		}
	}
	
	

}
