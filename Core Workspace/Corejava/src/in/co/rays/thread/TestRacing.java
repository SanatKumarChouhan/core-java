package in.co.rays.thread;

public class TestRacing {
	
	public static void main(String[] args) {
		

		Racing t1=new Racing("sanat");
		Racing t2=new Racing("riya");
		
		
		t1.start();
		
		t2.start();
		
		
		
		
	}

}
