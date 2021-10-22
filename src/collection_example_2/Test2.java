package collection_example_2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Test2 {
	public static void main(String[] args) {
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("amol");
		lhs.add("sujit");
		lhs.add("suyog");

		// constructor approach adding one collection into another collection
		HashSet<String> hs = new HashSet<String>(lhs);
		hs.add("neel_patil");
		hs.add("vaidya");
		hs.add("neel");

		Iterator<String> itr = hs.iterator();
		while (itr.hasNext()) {
			String str = itr.next();
			System.out.println(str);
		}
		System.out.println();

		// adding one collection into another constructor by using addAll()
		HashSet<String> hs1 = new HashSet<String>();
		hs1.addAll(lhs);
		hs1.add("sagar");
		hs1.add("tushar");
		hs1.add("devanand");
		hs1.addAll(hs);

		Iterator itr1 = hs1.iterator();
		while (itr1.hasNext()) {
			String str = (String) itr1.next();
			System.out.println(str);
		}

	}

}
