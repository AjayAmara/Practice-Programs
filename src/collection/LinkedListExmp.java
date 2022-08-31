package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedListExmp {
	
	public List<String> linkListM(){
	
	List<String> linkList= new LinkedList<String>();
	
	linkList.add("ajay");
	linkList.add("amara");
	linkList.add("bhavani");
	linkList.add("chinnodu");
	return linkList;
	}
	public static void main(String[] args) {
		   Scanner scan = new Scanner(System.in);
		   scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	        StringBuilder sb=new StringBuilder();
	        int i = scan.nextInt();
	        double d=scan.nextDouble();
	        while(scan.hasNext()){
	        String s=scan.next();
	        sb.append(s+" ");
	        }
	        scan.close();
	        // Write your code here.

	        System.out.println("String: " + sb);
	        System.out.println("Double: " + d);
	        System.out.println("Int: " + i);
		
		LinkedListExmp ll=new LinkedListExmp();
		
	List<String> lll  =ll.linkListM();
	
	ListIterator<String> lisitr=lll.listIterator();
	

	
	while(lisitr.hasNext()) {
		
		System.out.println(lisitr.next());
		
		 
		                                  
	}
	}

}
