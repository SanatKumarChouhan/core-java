package in.co.rays.oop;

public class XAccount {
	
	private int CustId;
	private String HolderName;
	private String LastName;
	
	
	public void setId(int CustId) {
	this.CustId=CustId;
	}
	public int getCustId() {
		return CustId;
	}
	
	
	public void setFirstName(String Fname) {
		this.HolderName=Fname;
	}
	public String getFirstName() {
		return HolderName;
	}
	
	
	public void setSurname(String surname) {
		this.LastName=surname;
	}
	public String getSurname() {
		return LastName;
		
	}
	
	
	
	
	
	
	

}
