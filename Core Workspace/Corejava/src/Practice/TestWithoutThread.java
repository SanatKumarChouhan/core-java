package Practice;

public class TestWithoutThread {
	
	public static void main(String[] args) {
		
		WithoutThread t=new WithoutThread("sameer");
		
		WithoutThread t1=new WithoutThread("prakhar", 5, 56);
		
		WithoutThread t2=new WithoutThread(7, 37);
		
		t.run();
		
		t1.run();
		
		t2.run();
		
		t2.sum();
		
	}

}
