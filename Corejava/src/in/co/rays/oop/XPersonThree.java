package in.co.rays.oop;

import java.util.Date;

public class XPersonThree {
	
	private int AccNo;
	private String FirstName;
	private String MiddleName;
	private String LastName;
	private Date dob;
	private int age;
	
	public void setAccNo(int accno) {
		this.AccNo=accno;
	}
	public int getAccNo() {
		return AccNo;
	}
	
	public void setPehlaNaam(String pehlanaam) {
		this.FirstName=pehlanaam;
	}
	public String getMadhyaNaam() {
		return FirstName;
	}
	
	public void setPooraNaam(String pooranaam) {
		this.LastName=pooranaam;
	}
	public String getAakhriNaam() {
		return LastName;
	}
	
	public void setJanmTithi(Date janmtithi) {
		this.dob=janmtithi;
	}
	public Date getJanmTarik() {
		return dob;
	}
	
	public void setAiyu(int sankhya) {
		this.age=sankhya;
	}
	public int getUmra() {
		return age;
	}
	
	
	
	

}
