package Practice;

public class WithThread extends Thread {
	
	String name;
	int id;
	int marks;
	
	WithThread(String name){
		
		this.name=name;
		
	}
	
	WithThread(String name, int id, int marks){
		
		this.name=name;
		this.id=id;
		this.marks=marks;
	}
	

	
	WithThread(int id, int marks){
		
		this.id=id;
		this.marks=marks;
	}
	
	public void run() {
		
		for (int i=1; i<=5; i++) {
			
			System.out.println(i+" "+name+" "+id+" "+marks);
		}
		
       int add=id+marks;
		
		System.out.println("sum"+add);
	}
	

	
	public void sum() {
		
		int add=id+marks;
		
		System.out.println("sum"+add);
	}
	

}
