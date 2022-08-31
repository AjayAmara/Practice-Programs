package exam;

import java.util.Scanner;

public class Febinocci {
	
public static void main(String[] args) {
	
	/*
	 * Scanner myObj = new Scanner(System.in); System.out.println("Enter size");
	 * 
	 * int size = Integer.parseInt(myObj.nextLine());
	 * System.out.println("Enter numbers"); int[] arr = new int[size]; for (int i =
	 * 0; i < size; i++) {
	 * 
	 * arr[i] = myObj.nextInt(); }
	 */
	
	 int n1=0,n2=1,n3,i,count=10;
	 int[] febinocci=new int[count];
	 febinocci[0]=n1;
	 febinocci[1]=n2;
	// System.out.print(n1+" "+n2);    
	    
	 for(i=2;i<count;++i)   
	 {    
	  n3=n1+n2;
	  febinocci[i]=n3;
	 // System.out.print(" "+n3);    
	  n1=n2;    
	  n2=n3;    
	 } 
	 for(int j=0;j<febinocci.length;j++) {
		 System.out.println(febinocci[j]);
	 }
	
}
	   

}
