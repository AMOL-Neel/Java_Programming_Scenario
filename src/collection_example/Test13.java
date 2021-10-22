package collection_example;

import java.util.ArrayList;
import java.util.Iterator;

public class Test13
{
	public static void main(String[] args) 
	{
		ArrayList<Emp> al = new ArrayList<Emp>();
		al.add(new Emp(111, "amol", "capjmini"));
		al.add(new Emp(222, "ketan", "cogni"));
		al.add(new Emp(333, "rahul", "vartusa"));
		al.add(new Emp(444, "sandeep", "mylan"));
		
		Iterator<Emp> itr = al.iterator();
		while(itr.hasNext())
		{
			Emp ee =itr.next();
			if(ee.empid==222)
				itr.remove();
			System.out.println();
			if(ee.empname.equals("sandeep"))
				itr.remove();
		}
		
		for(Emp ee:al)
		{
			System.out.println(ee.empid+" "+ee.empname+" "+ee.empcompany);
		}
		
	}

}
