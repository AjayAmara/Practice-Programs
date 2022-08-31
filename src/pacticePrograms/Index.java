package pacticePrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Index {
	
	
	public static void main(String[] args) {
		
	
	List<String> strings = new ArrayList<String>();
	
	strings.add("ajay");
	strings.add("amara");
	Iterator<String> strng=strings.iterator();
	
	  List<String> strings2=strings; 
	  //System.out.println(strings);
	  System.out.println(strings.get(1)); 
	  System.out.println(strings.size());
	  System.out.println(strings2); 
	  System.out.println(strings2.get(1));
	 
	}
}
