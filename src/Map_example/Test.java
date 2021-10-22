package Map_example;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Test 
{
	public static void main(String[] args) 
	{
		HashMap<Integer,String> hm =new HashMap<Integer,String>();
		hm.put(111, "pen");
		hm.put(222, "light");
		hm.put(333, "compass");
		hm.put(444, "pencil");
		hm.put(555, "register");
		hm.put(666, "diary");
		System.out.println(hm);
		
		Set<Integer> newset =hm.keySet();
		System.out.println(newset);
		
		Collection<String> newmap =hm.values();
		System.out.println(newmap);
		
		Set<Entry<Integer,String>> newmap1 =hm.entrySet();
		System.out.println(newmap1);
		System.out.println();
		
		for(Entry<Integer,String> e:newmap1)
		{
			System.out.println(e.getKey()+" "+e.getValue());
			
		}
		
		
		
	}

}
