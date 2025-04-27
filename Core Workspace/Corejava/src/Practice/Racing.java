package Practice;

public class Racing extends Thread{
	
	String name;
	
	static Account account=new Account();
	
	public Racing(String name) {
		
		this.name=name;
	}
	
	
	public void run() {
		
		for(int i=1; i<=5; i++) {
			
			this.account.deposit(name, 1000);
		}
			
			
	}
	

}
