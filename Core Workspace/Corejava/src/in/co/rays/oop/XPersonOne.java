package in.co.rays.oop;

public class XPersonOne {
	
	public void sum(int a, int b) {
		
		int add = a+b;
		
		System.out.println(add);
		
	}
	
	public void PrimeNumber(int number) {
		
		int count=0;
		
		for (int i=2; i<=number; i++) {
			
			if(number%2==0) {
				count++;
			}
			
		}
		if (count==0) {
			System.out.println("prime number");
		} else {
			System.out.println("not a prime number");
		}
		
	}
	
	public void EvenNumber(int no) {
		
		int sum=0;
		
		for (int i=0; i<=100; i++) {
			if (i%no==0) {
				int count=i;
				System.out.println(i);
				sum=sum+i;
			}
			
		}
		System.out.println("sum of even no. = "+sum);
	}
	

}
