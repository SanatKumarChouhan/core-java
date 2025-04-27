package Practice_Thread;

public class TestWithoutThread {

	public static void main(String[] args) {

		WithoutThread wt1 = new WithoutThread("sameer");

		WithoutThread wt2 = new WithoutThread("sahil");

		WithoutThread wt3 = new WithoutThread("bittu", 3, 45);

		WithoutThread wt4 = new WithoutThread(34, 44);

//		wt1.run();
//		
//		wt1.sum();

//		wt2.run();

		wt3.sum();
//		
//		wt3.run();
//		
//		wt4.run();

	}

}
