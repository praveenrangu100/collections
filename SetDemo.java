package collections;
import java.util.*;
public class SetDemo {
	public static void main(String[] args) {
		HashSet aSet= new HashSet();
		System.out.println(aSet.isEmpty());
		aSet.add("varun");
		aSet.add(1);
		aSet.add(22);
		aSet.add("arun");
		aSet.add(1);
		System.out.println(aSet.size());
		System.out.println(aSet);
		aSet.remove(22);
		System.out.println(aSet);
		System.out.println(aSet.size());
		System.out.println(aSet.isEmpty());
		System.out.println("================================");
		LinkedHashSet lSet = new LinkedHashSet();
		System.out.println(lSet.isEmpty());
		lSet.add(1);
		lSet.add("bad");
		lSet.add('A');
		lSet.add('A');
		lSet.add(3.5);
		System.out.println(lSet.size());
		System.out.println(lSet);
		lSet.remove('A');
		System.out.println(lSet);
		System.out.println(lSet.size());
		System.out.println(lSet.isEmpty());
	}
}
