package in.co.rays.thread;

public class BackgroundThread extends Thread {

	String name = null;

	// int i=1;

	public BackgroundThread(String name) {
		
		this.name = name;

	}

	public void run() {

		while (true) {

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println(name);
			// i++;
		}

	}

}
