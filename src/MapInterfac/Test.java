package MapInterfac;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Test 
{

	public static void main(String[] args) 
	{
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(111, "amol");
		hm.put(222, "sujit");
		hm.put(333, "ketan");
		hm.put(444, "sameer");
		hm.put(555, "gitesh");
		System.out.println(hm);
		
		Set<Integer> s= hm.keySet();
		System.out.println(s);
		
		Collection<String> c=hm.values();
		System.out.println(c);
		
		System.out.println();
		
		Set<Entry<Integer,String>> s1 = hm.entrySet();
		
		for(Entry<Integer,String> ee:s1)
		{
			System.out.println(ee.getKey()+" "+ee.getValue());
		}
	}
	

}
