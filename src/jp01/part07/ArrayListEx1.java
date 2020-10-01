
package jp01.part07;
import java.util.*;


public class ArrayListEx1 {
	
	public static void main(String[] args) {
		
		ArrayList list1 = new ArrayList(10);
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(3));
		list1.add(new Integer(2));
		list1.add(new Integer(1));
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		print(list1, list2);
		
		Collections.sort(list1);
		Collections.sort(list2);
		print(list1, list2);
		
		System.out.println("list1.containsAll(list2) : " + list1.containsAll(list2));
		
		list2.add(3, "A");
		print(list1, list2);
		
		list2.set(1, "1");
		//print(list1, list2);
		
		list2.remove(1);
		list2.remove("A");
		print(list1, list2);
		
	}

	private static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list2 : " + list2);
		System.out.println();
	}

}
