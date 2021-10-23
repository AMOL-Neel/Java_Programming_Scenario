package MapInterfac;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Test1
{
	public static void main(String[] args) 
	{
		LinkedHashMap<Integer,String> lhm = new LinkedHashMap<Integer,String>();
		
		lhm.put(111, "amol");
		lhm.put(333, "ketan");
		lhm.put(454, "kedar");
		lhm.put(767, "sagar");
		lhm.put(898, "santosh");
		lhm.put(494, null);
		System.out.println(lhm);
		
		System.out.println();
		
		Set<Integer> s =lhm.keySet();
		System.out.println(s);
		
		System.out.println();
		
		Collection c= lhm.values();
		System.out.println(c);
		
		System.out.println();
		
		Set<Entry<Integer,String>> e =lhm.entrySet();
		
		for(Entry<Integer,String> ee:e)
		{
			System.out.println(ee.getKey()+"   "+ee.getValue());
			
		}
	}

}
