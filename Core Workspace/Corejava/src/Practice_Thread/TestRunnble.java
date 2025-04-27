package Practice_Thread;

public class TestRunnble {

	public static void main(String[] args) {

		Runnble r1 = new Runnble();

		Runnble r2 = new Runnble();

		Thread th1 = new Thread(r1);

		Thread th2 = new Thread(r2);

		th1.start();
		th2.start();

	}

}
