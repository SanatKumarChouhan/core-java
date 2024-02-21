package in.co.rays.collection;

public class TestEmployee {
	
	public static void main(String[] args) {
		
		Employee e1=new Employee(1,"sameer", 577);
		
		Employee e2=new Employee(1,"sameer", 577);
		
		System.out.println(e1);
		System.out.println(e2);
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		
		System.out.println(e1.equals(e2));
		
	
	
	
	
	
	}
	

}
