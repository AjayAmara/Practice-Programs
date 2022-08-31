package pacticePrograms;

import java.util.Scanner;

public class RecursiveCall {
	
	static int count =1;
	
	static void printNum(int num) {
		
		System.out.println(count);
		count++;
		
		if (count==num+1) return;
		printNum(num);
		
		
	}
	
	public static void main(String[] args) 
	{
          Scanner sc= new Scanner(System.in);
          int n=sc.nextInt();
          printNum(n);
			}
	
	
	

}
