package Practice;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		int num=7;
		int count=0;
		
		for (int i=2; i < num; i++) {
			
			if(i%num==0) {
				count++;
			}
		}
		
		if (count==0) {
			System.out.println("Yes this is Prime Number");
		} else {
			System.out.println("This is not a Prime Number");
		}
		
	}

}
