package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExmp {

	public List<String> show() {

		List<String> list = new ArrayList<String>();

		list.add("ajay");
		list.add("bhavani");
		list.add("mukesh");
		list.add("amara");
		
		
		return list;

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayListExmp ale = new ArrayListExmp();

		List<String> stringList = ale.show();
		stringList.add("chitti");
		stringList.add(1, "rama");

		System.out.println("    iterat using for");
		for (int i = 0; i < stringList.size(); i++) {

			System.out.println(stringList.get(i));
		}

		System.out.println("    iterat using iterator");
		Iterator str1 = stringList.iterator();

		while (str1.hasNext()) {

			System.out.println(str1.next());
		}

		System.out.println("    iterat using forEach");
		for (String str : stringList) {

			System.out.println(str);
		}
		
		
		System.out.println("    iterat using lambda");
		stringList.forEach((s) -> System.out.println(s));

	}

}
