package collection_example;

import java.util.ArrayList;

public class Test9 {
	public static void main(String[] args) {
		Emp e = new Emp(100, "amol", "visionit");
		Emp e1 = new Emp(200, "vinod", "vision");
		Emp e2 = new Emp(300, "devanand", "yashshree");
		Emp e3 = new Emp(400, "sameer", "shree_ganesh");

		ArrayList<Emp> al = new ArrayList<Emp>();
		al.add(e);
		al.add(e1);

		ArrayList<Emp> al1 = new ArrayList<Emp>();
		al1.add(e2);
		al1.add(e3);
		al1.addAll(al);
		System.out.println(al1);

		for(Emp ee:al1)
		{
			System.out.println(ee.empid+" "+ee.empname+" "+ee.empcompany);
			
		}
		System.out.println();
		System.out.println(al1.contains(e));
		System.out.println();
		System.out.println(al1.containsAll(al));
		System.out.println();
		System.out.println(al1.remove(e));
		for(Emp ee:al1)
		{
			System.out.println(ee.empid+" "+ee.empname+" "+ee.empcompany);
			
		}
		
		
		System.out.println();
		System.out.println(al1.removeAll(al));
		System.out.println();
		System.out.println(al1.isEmpty());
		System.out.println();
		al1.clear();
		System.out.println(al1.isEmpty());
		System.out.println();

	}

}
