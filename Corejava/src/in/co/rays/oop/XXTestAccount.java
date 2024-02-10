package in.co.rays.oop;

public class XXTestAccount {
	
	public static void main(String[] args) {
		
		XXAccount xa=new XXAccount();
		
		xa.setAccNumber("98456378");
		xa.setAccType("Saving Account");
		xa.setAccBalance(70000);
		
		System.out.println("Account Number = "+xa.getAccNumber());
		System.out.println("Account Type = "+xa.getAccType());
		System.out.println("Account Balance = "+xa.getAccBalance());
		
		
	}

}
