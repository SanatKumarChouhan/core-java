package Practice_Thread;

public class DaemonThread extends Thread{
	
	public String name;
	
	public DaemonThread(String name) {
		this.name=name;
	}
	
	//@override
	public void run() {
		
		while(true) {
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
			System.out.println(name);	
		}
		
		
	}

}
