package collections;

import java.util.*;

public class TreeSet1 {

	public static void main(String[] args) {
		TreeSet<Character> t1=new TreeSet<Character>();
		t1.add('V');
		t1.add('b');
		t1.add('m');
		t1.add('c');
		t1.add('B');
		System.out.println(t1);
		Iterator<Character> t = t1.iterator();
		System.out.println(t1.size());
		while(t.hasNext()) {
			t.remove();
			System.out.println(t.next());
		}
		System.out.println(t1.size());
	}

}
