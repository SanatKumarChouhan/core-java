package Practice_Thread;

public class WithThread extends Thread {

	public String name;
	public int id;
	public int marks;

	public WithThread(String name) {

		this.name = name;
	}

	public WithThread(String name, int id, int marks) {

		this.name = name;
		this.id = id;
		this.marks = marks;
	}

	public WithThread(int id, int marks) {

		this.id = id;
		this.marks = marks;
	}

	public void run() {

		for (int i = 1; i <= 3; i++) {

			System.out.println(i + " " + name + " " + id + " " + marks);

			int add = id + marks;

			System.out.println("sum= "+add);
		}
	}

	public void sum() {

		int add = id + marks;

		System.out.println(add);
	}

}
