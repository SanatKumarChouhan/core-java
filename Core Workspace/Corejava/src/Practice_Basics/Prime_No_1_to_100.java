package Practice_Basics;

public class Prime_No_1_to_100 {

	public static void main(String[] args) {

		int i = 0;

		int num = 0;

		// empty string

		String PrimeNumbers = "";

		for (i = 1; i <= 100; i++) {

			int counter = 0;

			for (num = 1; num >= 1; num--) {

				if (i % num == 0) {

					counter = counter + 1;
				}
			}
			if (counter == 2) {

				// Appended the Prime Number to the String.

				PrimeNumbers = PrimeNumbers + i + " ";

			}
		}

		System.out.println("Prime Numbers from 1 to 100 are: ");

		System.out.println(PrimeNumbers);
	}
}
