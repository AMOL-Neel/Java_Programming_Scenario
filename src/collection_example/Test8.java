package collection_example;

import java.util.ArrayList;

public class Test8 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("amol");
		al.add("suyog");
		al.add("sameer");
		al.add("sandeep");
		al.add("sagar");
		al.add("gitesh");
		System.out.println(al);
		System.out.println();

		ArrayList<String> all = new ArrayList<String>();
		all.add("ashish");
		all.add("vinay");
		all.add("ganesh");
		all.add("raj");
		all.add("vinod");
		System.out.println(all);
		all.addAll(al);
		System.out.println();
		System.out.println(all);

	}

}
