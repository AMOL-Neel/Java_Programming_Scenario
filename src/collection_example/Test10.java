package collection_example;

import java.util.ArrayList;
import java.util.Collection;

public class Test10 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("amol");
		al.add("suyog");
		al.add("sameer");
		al.add("ketan");
		al.add("gitesh");
		System.out.println(al);

		ArrayList<String> all = new ArrayList<String>();
		all.addAll(al);
		all.add("ashish");
		all.add("raj");
		all.add("akash");
		System.out.println(all);
		System.out.println();

		all.retainAll(al);
		System.out.println(all);

		Emp e = new Emp(100, "amol_neel", "visionit");
		Emp e1 = new Emp(200, "ketan_aware", "vision");
		Emp e2 = new Emp(300, "suyog_neel", "parason");

		ArrayList<Emp> al1 = new ArrayList<Emp>();
		al1.add(e);

		ArrayList<Emp> al2 = new ArrayList<Emp>();
		al2.add(e1);
		al2.add(e2);
		al2.addAll(al1);

		for (Emp ee : al2) {
			System.out.println(ee.empid + " " + ee.empname + " " + ee.empcompany);

		}
		System.out.println();

		al2.retainAll(al1);
		for (Emp e12 : al2) {
			System.out.println(e12.empid + " " + e12.empname + " " + e12.empcompany);
		}
		
		System.out.println(al2.size());
		System.out.println();
		System.out.println(al.size());
		
		

	}

}
