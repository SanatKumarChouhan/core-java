package in.co.rays.cloning;

public class TestShellow {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Account a1=new Account(100);
		
		
		Account a2=(Account)a1.Clone();
		
		
		a2.balance=200;
		
		
		System.out.println("balance="+a1.balance);
		
		System.out.println("balance="+a2.balance);
		
		
	}

}
