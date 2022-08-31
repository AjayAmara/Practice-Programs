package exam;

import java.util.Scanner;

public class ZerosToEnd {
		public static void main(String[] args)
		{
			
			
			Scanner myObj = new Scanner(System.in);
			System.out.println("Enter students");

			int students = myObj.nextInt();
			System.out.println("Enter numbers");
			int[] totalMarks = new int[students];
			for (int i = 0; i < students; i++) {

				totalMarks[i] = myObj.nextInt();
			}
			
			int[] A = { 5, 6, 0, 4, 6, 0, 9, 0, 8 };
			int n = A.length;
			int j = 0;
			for (int i = 0; i < n; i++) {
				if (A[i] != 0) {
					
					swap(A, j, i); 
					j++;
				}
			}
			for (int i = 0; i < n; i++) {
				System.out.print(A[i] + " "); 
			}
		}

		
		public static void swap(int[] A, int a, int b)
		{
			int temp = A[a];
			A[a] = A[b];
			A[b] = temp;
		}
	}

	
