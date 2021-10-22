package collection_example_2;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
	public static void main(String[] args) {
		ArrayList<Emp> al = new ArrayList<Emp>();
		al.add(new Emp(1451, "amol"));
		al.add(new Emp(1225, "ketan"));
		al.add(new Emp(34255, "rahul"));
		al.add(new Emp(5505, "sanket"));
		al.add(new Emp(6450, "kiran"));

		// compare by using id
		Collections.sort(al, new Empcomptid());

		for (Emp e : al) {
			System.out.println(e.id + " " + e.name);
		}
		System.out.println();

		// compare by using name
		Collections.sort(al, new EmpComptname());

		for (Emp e : al) {
			System.out.println(e.id + " " + e.name);

		}

	}

}
