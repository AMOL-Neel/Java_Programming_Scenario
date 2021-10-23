package Comparat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class Test 
{
	public static void main(String[] args) 
	{
		ArrayList<Emp> al = new ArrayList<Emp>();

		al.add(new Emp(111, "amol"));
		al.add(new Emp(333, "ketan"));
		al.add(new Emp(222, "sandeep"));
		al.add(new Emp(444, "rahul")); 



		Collections.sort(al,new EidComp());

		for(Emp ee:al)
		{
			System.out.println("After sorting ="+ee.eid+" "+ee.ename);
		}

		System.out.println();


		Collections.sort(al,new EnameComp());

		for(Emp ee:al)
		{
			System.out.println("After sorting ="+ee.eid+" "+ee.ename);
		}

	}

}
