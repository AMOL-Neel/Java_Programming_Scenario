package collection_example;

import java.util.ArrayList;

public class Test7 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(199);
		al.add(299);
		al.add(399);
		System.out.println(al);
		System.out.println();

		ArrayList al1 = new ArrayList(al);
		al1.add(100);
		al1.add(200);
		al1.add(300);
		System.out.println(al1);
		System.out.println();
		
		
		ArrayList<Integer> all = new ArrayList<Integer>();
		all.add(400);
		all.add(500);
		all.add(600);
		System.out.println(all);
		System.out.println();
		
		ArrayList<Integer> all1 = new ArrayList<Integer>(all);
		all1.add(233);
		all1.add(333);
		all1.add(443);
		System.out.println(all1);

	}

}
