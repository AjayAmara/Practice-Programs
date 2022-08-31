package exam;

import java.util.Scanner;

public class findSumOSmallAndLarg {

	public static void main(String[] args) {

		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter size");

		int size = Integer.parseInt(myObj.nextLine());
		System.out.println("Enter numbers");
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {

			arr[i] = myObj.nextInt();
		}

		int bigNo = 0, smlNo = 0, sum = 0;

		for (int i = 0; i <= size - 1; i++) {

			if (arr[i] > bigNo) {

				bigNo = arr[i];
			}

		}
		smlNo = arr[0];
		for (int i = 0; i <= size - 1; i++) {

			if (arr[i] < smlNo) {

				smlNo = arr[i];
			}

		}

		sum = smlNo + bigNo;
		System.out.println(sum);
	}

}
