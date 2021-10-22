package collection_example;

import java.util.ArrayList;

public class Test4 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(20);
		al.add("amol");
		al.add("neel");
		al.add(null);
		al.add("amol");
		al.add(10.5f);
		al.add(20.5);
		al.add('a');

		System.out.println(al.toString());
		System.out.println();
		System.out.println(al.size());
		System.out.println();
		al.add(2, "ketan");
		System.out.println(al);
		System.out.println();
		System.out.println(al.remove(3));
		System.out.println(al);
		System.out.println();
		System.out.println(al.set(3, "india"));
		System.out.println(al);
		System.out.println();
		al.clear();
		System.out.println(al);
		System.out.println();
		System.out.println(al.isEmpty());
		

	}

}
