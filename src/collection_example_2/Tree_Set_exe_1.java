package collection_example_2;

import java.util.Comparator;
import java.util.TreeSet;

public class Tree_Set_exe_1 {
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("amol");
		ts.add("gitesh");
		ts.add("sameer");
		ts.add("arjun");
		ts.add("ketan");
		System.out.println(ts);

		TreeSet<String> ts1 = new TreeSet<String>(new Comp());
		ts1.addAll(ts);
		System.out.println(ts1);

		TreeSet<Integer> ts2 = new TreeSet<Integer>();
		ts2.add(3);
		ts2.add(1235);
		ts2.add(5);
		ts2.add(100);
		ts2.add(12);
		System.out.println(ts2);

		TreeSet<Integer> ts3 = new TreeSet<Integer>(new Mycomp());
		ts3.addAll(ts2);
		System.out.println(ts3);

	}

}

class Comp implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		return -s1.compareTo(s2);
	}

}

class Mycomp implements Comparator<Integer> {
	public int compare(Integer i1, Integer i2) {
		return -i1.compareTo(i2);

	}
}