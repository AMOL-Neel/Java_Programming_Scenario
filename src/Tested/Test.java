package Tested;

import java.util.ArrayList;
import java.util.Iterator;

public class Test
{
	public static void main(String[] args) 
	{
		ArrayList a = new ArrayList();
		a.add("amol");
		a.add("ketan");
		a.add("rahul");
		a.add("kedar");
		a.add("Ram");
		
		for(Object p:a)
		{
			System.out.println(a);
		}
		
		ArrayList<Emp>  al = new ArrayList<Emp>();
		al.add(new Emp(111, "amol", 34000.00f));
		al.add(new Emp(222, "ketan", 45000.00f));
		
		Iterator<Emp> it =al.iterator();
		while(it.hasNext())
		{
		 Emp e = it.next();
		 System.out.println(e.eid+" "+e.ename+" "+e.esalary);
		}
		
		System.out.println();
		
		for(Object o:al)
		{
			System.out.println(o.toString());
		}
		
		
		
	}

}
