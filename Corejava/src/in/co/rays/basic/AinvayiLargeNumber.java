package in.co.rays.basic;

public class AinvayiLargeNumber {
	
	public static void main(String[] args) {
		
		int[] num= {27,38,74,19,47,93,18,10,17,15};
		
		int a=0;
		
		for (int i=0; i<num.length; i++) {
			
			if (num[i]>a) {
				
				a=num[i];
			}
			
		}
		System.out.println(a);
		
	}
	
	
	

}
