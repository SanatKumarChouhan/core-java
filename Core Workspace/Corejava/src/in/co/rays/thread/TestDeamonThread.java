package in.co.rays.thread;

public class TestDeamonThread {

	public static void main(String[] args) {

		BackgroundThread t1 = new BackgroundThread("Deamon thread");

		//t1.setDaemon(true);
		

		t1.start();

		for (int i = 1; i <= 100; i++) {

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}

			System.out.println(i + "riya");

		}

	}

}
