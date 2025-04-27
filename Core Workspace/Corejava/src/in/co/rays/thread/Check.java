package in.co.rays.thread;

public class Check extends Thread {

	public void run() {
		
		if (Thread.currentThread().isDaemon()) {
			
			
			System.out.println("Deamon thread");
			
		}else {
			
			
			
			System.out.println("simple thread");
		}
		
		
	}
	
	

}
