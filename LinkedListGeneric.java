package collections;
import java.util.Collections;
import java.util.LinkedList;
public class LinkedListGeneric {
	public static void main(String[] args) {
		LinkedList<String> str= new LinkedList<String>();
		System.out.println(str.isEmpty());
		str.add("arun");
		str.add("chotu");
		str.add("mike");
		str.add("baga");
		System.out.println(str);
		str.add(2, "Psycho");
		System.out.println(str);
		str.remove(0); //using at index
		System.out.println(str);
		str.remove("baga");  //using object
		System.out.println(str);
		System.out.println(str.get(2));
		System.out.println(str.size());
		System.out.println(str.isEmpty());
		Collections.sort(str,Collections.reverseOrder());
		System.out.println(str);
	}
}
