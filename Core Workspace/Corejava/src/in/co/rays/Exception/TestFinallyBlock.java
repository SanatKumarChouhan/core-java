package in.co.rays.Exception;

public class TestFinallyBlock {
	
	public static void main(String[] args) {
		
		try {
			
			int a=100;
			int b=0;
			int devide=a/b;
			
			System.out.println(devide);
			
		}catch (Exception e) {
			
			System.out.println(e);
			e.printStackTrace();
			
		}finally {
			
			System.out.println("finally block");
			
		}
		System.out.println("after finally block");
	}

}
