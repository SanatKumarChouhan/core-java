package in.co.rays.thread;

public class TestWithThread {
	
	
	public static void main(String[] args) {
		
		WithThread t1=new WithThread("sanat");
		
		
		WithThread t2=new WithThread("riya");
		
		
		
		t1.start();
		
		t2.start();
		
		
		
		
	}

}
