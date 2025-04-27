package Practice_Basics;

public class IfElse {

	public static void main(String[] args) {

		int a, b;

		a = 30;
		b = 20;

		if (a == b) {
			System.out.println("Both are Equal");
		} else {
			if (a < b) {
				System.out.println("a is lesser");
			} else {
				System.out.println("b is lesser");
			}
		}
	}

}
