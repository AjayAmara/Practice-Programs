package exam;

import java.util.Scanner;

public class Students {
	
	public static void main(String[] args) {
		int temp;
		
		
		
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter students");

		int students = myObj.nextInt();
		System.out.println("Enter numbers");
		int[] totalMarks = new int[students];
		for (int i = 0; i < students; i++) {

			totalMarks[i] = myObj.nextInt();
		}
		System.out.println("Enter sortedStudents");
		int sortedStudents =myObj.nextInt() ;
		
		  for (int i = 0; i < totalMarks.length; i++) {     
	            for (int j = i+1; j < totalMarks.length; j++) {     
	               if(totalMarks[i] < totalMarks[j]) {    
	                   temp = totalMarks[i];    
	                   totalMarks[i] = totalMarks[j];    
	                   totalMarks[j] = temp;    
	               }     
	            }     
	        }    
		
	for(int i=sortedStudents-1;i>=0;i--) {
		System.out.println(totalMarks[i]);
	}
		
	}

}
