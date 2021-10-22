package Map_example;

import java.util.Comparator;
import java.util.TreeMap;

public class Test3 {
	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>(new Mycomp());
		tm.put(1, "amol");
		tm.put(10, "sujit");
		tm.put(2, "gitesh");
		tm.put(20, "sameer");
		tm.put(3, "yogesh");
		tm.put(30, "sanjay");
		System.out.println(tm);
		System.out.println();

		TreeMap<String, Integer> tm1 = new TreeMap<String, Integer>(new Mycompt());
		tm1.put("aaa", 1);
		tm1.put("bbb", 2);
		tm1.put("zzz", 3);
		tm1.put("xxx", 4);
		tm1.put("ccc", 5);
		System.out.println(tm1);

	}

}

class Mycomp implements Comparator<Integer> {
	public int compare(Integer i1, Integer i2) {
		return -i1.compareTo(i2);
	}
}

class Mycompt implements Comparator<String> {
	public int compare(String s1, String s2) {
		return -s1.compareTo(s2);
	}
}