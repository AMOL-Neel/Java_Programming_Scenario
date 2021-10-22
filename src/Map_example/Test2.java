package Map_example;

import java.util.SortedMap;
import java.util.TreeMap;

public class Test2 {
	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		tm.put(22, "amol");
		tm.put(1, "sujit");
		tm.put(33, "suyog");
		tm.put(2, "sujit");
		tm.put(5, "gitesh");
		tm.put(3, "sameer");

		System.out.println(tm);

		SortedMap<Integer, String> sm = tm.subMap(1, 33);
		TreeMap<Integer, String> tm1 = new TreeMap<Integer, String>(sm);
		System.out.println(tm1);

		// tailMap()
		SortedMap<Integer, String> sm1 = tm.tailMap(3);
		TreeMap<Integer, String> tm2 = new TreeMap<Integer, String>(sm1);
		System.out.println(tm2);

		// headMap()
		SortedMap<Integer, String> sm2 = tm.headMap(33);
		TreeMap<Integer, String> tm3 = new TreeMap<Integer, String>(sm2);
		System.out.println(tm3);

	}

}
