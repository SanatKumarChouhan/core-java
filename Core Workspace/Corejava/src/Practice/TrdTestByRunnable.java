package Practice;

public class TrdTestByRunnable {
	
	public static void main(String[] args) {
		
		TrdRunnable t1=new TrdRunnable("sameer");
		
		TrdRunnable t2=new TrdRunnable("Prakhar");
		
		Thread th1=new Thread(t1);
		
		Thread th2=new Thread(t2);
		
		th1.start();
		
		th2.start();
		
	}

}
