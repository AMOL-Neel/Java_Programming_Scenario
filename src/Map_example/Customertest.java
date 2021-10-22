package Map_example;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Customertest 
{
	public static void main(String[] args) 
	{
		LinkedHashMap<Integer,Customer> lhm = new LinkedHashMap<Integer,Customer>();
		lhm.put(1, new Customer(111, "amol", "aurangabad"));
		lhm.put(2, new Customer(222, "ketan", "vaijapur"));
		lhm.put(3, new Customer(333, "sujit", "hasta"));
		lhm.put(4, new Customer(444, "sankalp", "jalgaon"));
		lhm.put(5, new Customer(555, "sameer", "jalna"));
		
		Set<Integer> s= lhm.keySet();
		System.out.println(s);
		System.out.println();
		
		Collection<Customer> c= lhm.values();
		for(Customer c1:c)
		{
			System.out.println(c1.cid+" "+c1.cname+" "+c1.caddress);
		}
		
		Set<Entry<Integer,Customer>> s1 =lhm.entrySet();
		Iterator<Entry<Integer,Customer>> itr =s1.iterator();
		while(itr.hasNext())
		{
			Entry<Integer,Customer> e =itr.next();
			Integer in =e.getKey();
			System.out.println(in);
			
			
			Customer c1 =e.getValue();
			if(c1.cid==111)
				itr.remove();
			if(c1.caddress.equals("jalna"))
				itr.remove();
			
		}
		
		for(Entry<Integer,Customer>  e:lhm.entrySet())
		{
			Customer cc =e.getValue();
			System.out.println(cc.cid+" "+cc.cname+" "+cc.caddress    );
			 
		}
		
	}

}
