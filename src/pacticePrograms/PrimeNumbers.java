package pacticePrograms;

public class PrimeNumbers {

	public static void main(String[] args) {

		for (int j = 2; j <= 10; j++) {

			int num = j, count = 0;

			for (int i = 2; i <= num / 2; i++) {

				if (num % i == 0)
					count++;

			}
			if (count == 0)
				System.out.println(num);

		}
	}
}
