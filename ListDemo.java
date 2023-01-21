package collections;
import java.util.*;
public class ListDemo {
	public static void main(String[] args) {
		ArrayList aList = new ArrayList();
		System.out.println(aList.isEmpty());
		aList.add(1);
		aList.add(2);
		aList.add(3);
		aList.add(5);
		aList.add('a');
		aList.add(4);
		System.out.println(aList);
		aList.add(2, "Psycho");
		aList.remove(0); //using at index
		System.out.println(aList);
		aList.remove(4);  //using object
		System.out.println(aList);
		System.out.println(aList.get(2));
		System.out.println(aList.size());
		System.out.println(aList.isEmpty());
		System.out.println("=======================");
		LinkedList l1= new LinkedList();
		System.out.println(l1.isEmpty());
		l1.add(12);
		l1.add("chotu");
		l1.add('B');
		l1.add(3.5);
		l1.addFirst(252);
		System.out.println(l1);
		l1.add(2, "Psycho");
		System.out.println(l1);
		l1.remove(0); //using at index
		System.out.println(l1);
		l1.remove(3.5);  //using object
		System.out.println(l1);
		System.out.println(l1.get(2));
		System.out.println(l1.size());
		System.out.println(l1.isEmpty());
	}
}
