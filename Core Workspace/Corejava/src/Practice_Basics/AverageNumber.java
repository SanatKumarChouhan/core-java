package Practice_Basics;

public class AverageNumber {

	public static void main(String[] args) {

		int n = 10;
		int sum = 0;
		int count = 0;
		double avg;

		for (int i = 1; i <= n; i++) {

			if (i % 1 == 0) {

				sum = sum + i;

				count++;
			}
		}

		avg = sum / count;
		
		System.out.println(sum);
		System.out.println(count);

		System.out.println(avg);
	}

}
