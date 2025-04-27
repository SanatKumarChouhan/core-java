package Practice_Thread;

public class Racing extends Thread {

	public String name;

	static Account acc = new Account();

	public Racing(String name) {
		this.name = name;
	}

	public void run() {

		for (int i = 1; i <= 5; i++) {

			this.acc.deposite(name, 1000);
		}
	}

}
