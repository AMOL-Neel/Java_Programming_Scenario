package LinkHash;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Test1 
{
	// parent p = new Child(); parent class ref. variable is able to hold child class object
	
	public static void main(String[] args) 
	{
		Set<String> s = new HashSet<String>();
		s.add("amol");
		s.add("ketan");
		s.add("sameer");
		System.out.println(s);
		
		System.out.println();
		
		HashSet<String> hs = new LinkedHashSet<String>();
		hs.addAll(s);
		System.out.println(hs);
		
		System.out.println();
		
		Set<String> s1 = new TreeSet<String>();
		s1.addAll(hs);
		System.out.println(s1);
		
		System.out.println();
		
		SortedSet<String> ss = new TreeSet<String>();
		ss.addAll(s1);
		System.out.println(ss);
		
		System.out.println();
		
		// eliminating duplicates
		
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("amol");
		al.add("ketan");
		al.add("sagar");
		al.add("amol");
		al.add(null);
		al.add(null);
		al.add("ketan");
		al.add("sagar");
		System.out.println(al);
		
		HashSet<String> hss = new HashSet<String>();
		
		hss.add(null);
		hss.add(null);
		hss.add("amol");
		hss.addAll(al);
		System.out.println(hss);
		
		
		
		
		
		
	}

}
