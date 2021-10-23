package Setex;

import java.util.HashSet;
import java.util.Iterator;

public class Test1 
{
	public static void main(String[] args) 
	{
		HashSet<Emp> hs = new HashSet<Emp>();
		hs.add(new Emp(111, "amol"));
		hs.add(new Emp(222, "ketan"));
		hs.add(new Emp(333, "kedar"));
		hs.add(new Emp(444, "rohit"));

		Iterator<Emp> it =	hs.iterator();

		while(it.hasNext())
		{
			Emp ee =it.next();
			System.out.println(ee.eid+" "+ee.ename );
		}


		System.out.println();

		HashSet<Emp> hs1 = new HashSet<Emp>();
		hs1.add(new Emp(551, "sameer"));
		hs1.add(new Emp(552, "sarang"));
		hs1.add(new Emp(553, "akash"));
		hs1.add(new Emp(554, "santosh"));
		hs1.add(new Emp(555, "ritesh"));

		Iterator<Emp> it1 =hs1.iterator();

		while(it1.hasNext())
		{
			Emp e1=  it1.next();

			if(e1.eid==551)
				it1.remove();
			if(e1.ename.equals("akash"))
			    it1.remove();
			if(e1.eid==555)
				it1.remove();
		}
		
		for(Emp e1:hs1)
		{
			System.out.println(e1.eid+" "+e1.ename);
		}


	}

}
