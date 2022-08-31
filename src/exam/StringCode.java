package exam;

import java.util.Scanner;

public class StringCode {
	public static void main(String[] args) {

		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter String");
        String str = myObj.nextLine();
        
		System.out.println("Enter another String");
	    String str2 = myObj.nextLine();
		int count = 0;
		String res =null;

		
			char[] ch= charArray(str);
			char[] ch2= charArray(str2);
		
		 
		 

			/*
			 * char[] ch = new char[str.length()];
			 * 
			 * for (int i = 0; i < str.length(); i++) { ch[i] = str.charAt(i); } char[] ch2
			 * = new char[str2.length()];
			 * 
			 * for (int i = 0; i < str2.length(); i++) { ch2[i] = str2.charAt(i); }
			 */

		if (str.length() == str2.length()) {

			for (int i = 0; i < str.length(); i++) {
				for (int j = 0; j < str.length(); j++) {

					if (ch[i] == ch2[j])
						count++;

				}

			}

			if (count == str.length())
				res = "yes";
			else res="no";
		}else res="no";

		System.out.println(res);
	}

	public static char[] charArray(String str1) {
		char[] ch = new char[str1.length()];

		for (int i = 0; i < str1.length(); i++) {
			ch[i] = str1.charAt(i);
		}
		return ch;
	}

}
