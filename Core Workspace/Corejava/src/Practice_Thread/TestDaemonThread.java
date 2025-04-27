package Practice_Thread;

public class TestDaemonThread {
	
	public static void main(String[] args) {
		
		DaemonThread dt=new DaemonThread("rahul");
		
		dt.setDaemon(true);
		dt.start();
		
		for (int i=1; i<=5; i++) {
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
			System.out.println(i+"riya");
			
		}
	}

}
