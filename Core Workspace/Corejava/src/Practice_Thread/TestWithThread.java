package Practice_Thread;

public class TestWithThread {

	public static void main(String[] args) {

		WithThread wt1 = new WithThread("shanu");

		WithThread wt2 = new WithThread("bittu", 2, 34);

		WithThread wt3 = new WithThread(5, 73);

		wt1.start();

		wt2.start();

		wt3.start();
	}

}
