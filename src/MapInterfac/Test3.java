package MapInterfac;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Test3 
{
	public static void main(String[] args)
	{
		LinkedHashMap<Emp,Student> lhm = new LinkedHashMap<Emp, Student>();
		lhm.put(new Emp(111, "amol") , new Student(222, "ketan"));
		lhm.put(new Emp(333, "sagar"), new Student(444, "gitesh"));
		lhm.put(new Emp(555, "vinod"), new Student(666, "ganesh"));
		lhm.put(new Emp(777, "Santosh"), new Student(888, "sanket"));
		lhm.put(new Emp(001, "yogesh"), new Student(998, "sarthak"));
		

		Set<Emp> s =lhm.keySet();
		for(Emp ee:lhm.keySet())
		{
			System.out.println(ee.eid+" "+ee.ename);
		}
		
		System.out.println();
		
		Collection c= lhm.values();
		for(Student sss:lhm.values())
		{
			System.out.println(sss.sid+" "+sss.sname);
			
		}
		
		System.out.println();
		
		Set<Entry<Emp,Student>> s1 = lhm.entrySet();
		
		Iterator<Entry<Emp,Student>> it =s1.iterator();
		
		while(it.hasNext())
		{
		   Entry<Emp,Student> ees =it.next();
		   Emp  em =ees.getKey();
		   System.out.println(em.eid+" "+em.ename);
		   
		   System.out.println();
		   
		   Student st =ees.getValue();
		   System.out.println(st.sid+" "+st.sname);
		}

	}

}
