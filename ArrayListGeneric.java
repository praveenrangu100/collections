package collections;
import java.util.*;
public class ArrayListGeneric {
	public static void main(String[] args) {
		ArrayList<Integer> a1= new ArrayList<Integer>();
	//	System.out.println(a1.isEmpty());
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(5);
		a1.add(6);
		a1.add(4);
		System.out.println(a1);
		/*System.out.println(a1);
		a1.add(2, 6);
		a1.remove(0); //using at index
		System.out.println(a1);
		a1.remove(4);  //using object
		System.out.println(a1);
		System.out.println(a1.get(2));
		System.out.println(a1.size());
		System.out.println(a1.isEmpty());
		Collections.sort(a1);  
		System.out.println(a1);
		Collections.reverse(a1);
		System.out.println(a1);*/
		Collections.sort(a1,Collections.reverseOrder());
		System.out.println(a1);
	}
}
