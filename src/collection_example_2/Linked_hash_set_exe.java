package collection_example_2;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linked_hash_set_exe {
	public static void main(String[] args) {
		LinkedHashSet<Emp> lsh = new LinkedHashSet<Emp>();
		lsh.add(new Emp(111, "amol"));
		lsh.add(new Emp(22, "ketan"));
		lsh.add(new Emp(33, "kiran"));
		lsh.add(new Emp(444, "sujit"));

		Iterator<Emp> itr = lsh.iterator();

		while (itr.hasNext()) {
			Emp e = itr.next();
			System.out.println(e.id + " " + e.name);

			if (e.id == 111)
				itr.remove();
			if (e.name.equals("kiran"))
				itr.remove();
		}
		System.out.println();

		for (Emp e : lsh) {
			System.out.println(e.id + " " + e.name);

		}

	}

}
