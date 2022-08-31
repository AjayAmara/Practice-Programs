package pacticePrograms;

public class PrimeNumbers2 {

	public static void main(String[] args) {
		for(int i=2;i<=10;i++)
		{

			// TODO Auto-generated method stub
			int num = i, count = 0;
			for (int  j = 1; j <= num; j++) {
				if (num % j == 0) {
					count++;
				}
			}
			{
				if (count == 2)

					System.out.println(num + " is prime number");
				/*else {
					System.out.println(num + " is non prime number");*/
				}
			}
		
		}
	}


