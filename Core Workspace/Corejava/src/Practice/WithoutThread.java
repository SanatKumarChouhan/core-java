package Practice;

public class WithoutThread {
	
	public String name;
	public int id;
	public int marks;
	
	public WithoutThread(String name) {
		
		this.name=name;
	}
	
	public WithoutThread(String name, int id, int marks) {
		
		this.name=name;
		this.id=id;
		this.marks=marks;
	}
	
	public WithoutThread(int id, int marks) {
		
		this.id=id;
		this.marks=marks;
	}
	
	public void run() {
		
		for (int i=1; i<=5; i++) {
			
			System.out.println(i+" "+name+" "+id+" "+marks);
			
		}
	}
	
	public void sum() {
		
		int add=id+marks;
		
		System.out.println("sum"+add);
	}
	
	

}
