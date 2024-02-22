package in.co.rays.comparator;

public class Marksheet {
	
	public String name;
	public int id;
	public int marks;
	
	// constructor.
	
	public Marksheet(String name, int id, int marks) {
		
		this.name=name;
		this.id=id;
		this.marks=marks;
		
	}
	
	public String toString() {
		
		return name+" "+id+" "+marks;
	}
	

}
