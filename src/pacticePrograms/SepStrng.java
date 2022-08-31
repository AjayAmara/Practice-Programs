package pacticePrograms;

import java.util.Scanner;

public class SepStrng {

	public static void main(String[] args) {

		Scanner myObj = new Scanner(System.in); // Create a Scanner object
		//

		// Read user input
		System.out.println("Enter name"); // Output user input
		String userName = myObj.nextLine();
		System.out.println("Enter number");
		int usNum = myObj.nextInt();

		String[] splited = userName.split(" ");

		StringBuilder str2 = new StringBuilder();

		for (int i = 0; i < splited.length; i++) {

			str2.append(splited[i]);
			if (i != splited.length - 1)
				str2.append(usNum);

		}
		System.out.println(str2);

	}

}
