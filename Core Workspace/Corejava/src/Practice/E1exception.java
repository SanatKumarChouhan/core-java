package Practice;

public class E1exception {
	
	public static void main(String[] args) {
		
		try {
			
			int a=100;
			int b=0;
			int devide=a/b;
			
			System.out.println(devide);
			
	  }catch (Exception e) {
		
		  System.out.println(e);
		  System.out.println(e.getMessage());
		  e.printStackTrace();
		
	  }
	

   }
}