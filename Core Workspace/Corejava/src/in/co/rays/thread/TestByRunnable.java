package in.co.rays.thread;

public class TestByRunnable {
	
	public static void main(String[] args) {
		
		Test t1=new Test("sanat");
		
		
		Test t2=new Test("riya");
		
	Thread th=new Thread(t1);
	
	Thread th1=new Thread(t2);
	
	th.start();
	
	
	th1.start();

	
	
		
		
		
		
		
		
		
		
		
		
	}
	

}
