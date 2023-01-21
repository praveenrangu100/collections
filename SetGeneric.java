package collections;
import java.util.*;
public class SetGeneric {
	public static void main(String[] args) {
		HashSet<Integer> ints= new HashSet<Integer>();
		System.out.println(ints.isEmpty());
		ints.add(12);
		ints.add(1);
		ints.add(11);
		ints.add(22);
		ints.add(32);
		ints.add(1);
		System.out.println(ints.size());
		System.out.println(ints);
		ints.remove(22);
		System.out.println(ints);
		System.out.println(ints.size());
		System.out.println(ints.isEmpty());
		System.out.println("======================");
		LinkedHashSet<String> lints= new LinkedHashSet<String>();
		System.out.println(lints.isEmpty());
		lints.add("evaru");
		lints.add("sir");
		lints.add("miru");
		lints.add("edey");
		lints.add("mimalni");
		lints.add("1 sari");
		System.out.println(lints.size());
		System.out.println(lints);
		lints.remove("edey");
		System.out.println(lints);
		System.out.println(lints.size());
		System.out.println(lints.isEmpty());	
	}
}
