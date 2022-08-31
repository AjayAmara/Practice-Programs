package pacticePrograms;

import java.util.Scanner;

public class ClassObjects {
	
	public static void main(String args[]) {
		
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter username");

	    int userNum = myObj.nextInt();
	    
	    String userName = myObj.nextLine();
	    
	    System.out.println("Usernum is: " + userNum);// Read user input
	    System.out.println("Username is: " + userName);  // Output user input
		
	}

}
