package in.co.rays.basic;

public class LargestNumber {
	
	public static void main(String[] args) {
		
		int[] num= {5,8,20,50,25,10,40};
		
		int a=0;
		
		
		for (int i = 0; i < num.length; i++) {
			
			if (num[i]>a) {
				
				a=num[i];
				
			}
			
		}
		
	System.out.println(a);
	}

}
