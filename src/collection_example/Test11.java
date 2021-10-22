package collection_example;

import java.util.ArrayList;
import java.util.Iterator;

public class Test11 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("amol");
		al.add("gitesh");
		al.add("sameer");
		al.add("suyog");
		al.add("sagar");
		al.add("sandeep");
		System.out.println(al);
		System.out.println();

		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			String str = itr.next();
			if (str.equals("sandeep")) {
				itr.remove();

			}

			System.out.println(al);
		}

	}

}
