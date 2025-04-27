package in.co.rays.thread;

public class Test implements Runnable {
	
	String name=null;
	
	
	public Test(String name) {
		
		this.name=name;
		
	}
	
	
	

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			
			System.out.println(i+" "+name);
			
			
		}
		
	}
	
	
	
	
	
	

}
