package collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class Demo {
	public static void main(String[] args) {
		ArrayList<Integer> l1=new ArrayList<Integer>();
		l1.add(1);
		l1.add(13);
		l1.add(110);
		l1.add(100);
		l1.add(31);
		l1.add(550);
	    System.out.print("The ArrayList Values Are:"+ l1);
	    LinkedList<Integer> l2=new LinkedList<Integer>();
		l2.add(122);
		l2.add(34);
		l2.add(44);
		l2.add(11);
		l2.add(122);
		l2.add(550);
		System.out.println();
	    System.out.print("The LinkedList Values Are:"+ l2);
		ArrayList<String> l3=new ArrayList<String>();
		l3.add("sai");
		l3.add("ts");
		l3.add("latha");
		l3.add("sai");
		l3.add("nse");
		System.out.println();
		System.out.println(l3);
		System.out.println(l3.size());
		System.out.println(l2.get(1));
		}
}
