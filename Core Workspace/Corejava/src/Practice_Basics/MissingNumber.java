package Practice_Basics;

public class MissingNumber {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6, 7 };

		int[] b = { 1, 2, 3, 4, 5 };

		int suma = 0;

		int sumb = 0;

		for (int i = 0; i < a.length; i++) {

			suma = suma + a[i];
		}

		for (int j = 0; j < b.length; j++) {

			sumb = sumb + b[j];
		}

		int missing = suma - sumb;

		System.out.println(missing);
	}
}
