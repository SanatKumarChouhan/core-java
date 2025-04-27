package in.co.rays.cloning;

public class Account implements Cloneable {
	
	
	int balance=0;
	
	
	
	public Account(int balance) {
		
		
		
		this.balance=balance;
	}
	
	protected Object Clone() throws  CloneNotSupportedException{
		return super.clone();
		
		
		
	}
	

}
