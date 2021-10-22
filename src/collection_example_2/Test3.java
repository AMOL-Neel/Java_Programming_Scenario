package collection_example_2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Test3 
{
	public static void main(String[] args) 
	{
		Set<String> s = new HashSet<String>();
		s.add("amol");
		s.add("arjun");
		s.add("suyog");
		s.add("ketan");
		s.add("kishor");
		s.add("ashish");
		
		System.out.println(s);
		
		// eleminating duplicate object
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("amol");
		al.add("neel");
		al.add("amol");
		
		
		LinkedHashSet<String> lhs = new LinkedHashSet<String>(al);
		System.out.println(lhs);
		
		
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("sujit");
		al1.add("neel");
		al1.add("suyog");
		al1.add("neel");
		al1.add("sujit");
		al1.add("neel");
		
		HashSet<String> hs = new HashSet<String>();
		hs.addAll(al1);
		hs.add("gitesh");
		hs.add("sameer");
		hs.add("suyog");
		System.out.println(hs);
	}

}
