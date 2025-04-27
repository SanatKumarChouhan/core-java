package Practice;

public class TrdRunnable implements Runnable {
	
	String name;
	
	public TrdRunnable(String name) {
	
		this.name=name;
	}
	
	public void run() {
		
		for(int i=1; i<=5; i++) {
		
		System.out.println(i+" "+name);
		}
		
	}
}
