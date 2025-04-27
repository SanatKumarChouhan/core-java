package Practice;

public class Account {
	
	private int balance;
	
	public void setBalance(int balance) {
		
		try {
			Thread.sleep(1000);
			
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		this.balance=balance;
	}
	
	public int getBalance() {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return balance;
	}
	
	public synchronized void deposit(String name, int amount) {
		
		int total=getBalance()+amount;
		
		setBalance(total);
		
		System.out.println(name+" Balance= "+getBalance());
	}

}
