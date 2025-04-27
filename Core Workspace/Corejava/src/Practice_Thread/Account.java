package Practice_Thread;

public class Account {

	private int balance;

	public void setBalance(int balance) {
		try {
			Thread.sleep(200);
			
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		this.balance = balance;
	}

	public int getBalance() {
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return balance;
	}

	public synchronized void deposite(String name, int ammount) {

		int total = getBalance() + ammount;

		setBalance(total);

		System.out.println(name + " balance " + getBalance());
	}

}
