package Practice_Thread;

public class TestRacing {

	public static void main(String[] args) {

		Racing r1 = new Racing("sameer");
		Racing r2 = new Racing("riya");

		r1.start();
		r2.start();
	}

}
