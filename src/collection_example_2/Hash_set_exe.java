package collection_example_2;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Hash_set_exe 
{
	public static void main(String[] args)
	{
		HashSet<String> hs = new HashSet<String>();
		hs.add("amol");
		hs.add("kiran");
		hs.add("sujit");
		hs.add("sameer");
		hs.add("sankalp");
		hs.add("gitesh");
		hs.add("sagar");
		hs.add("kalpesh");
		hs.add("gangadhar");
		hs.add("shakitman");
		System.out.println(hs);
		System.out.println();
		System.out.println(hs.size());
		
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("kakasahen");
		lhs.add("babasaheb");
		lhs.add("dadasaheb");
		lhs.add("mamasaheb");
		lhs.add("nanasaheb");
		lhs.add("raosaheb");
		lhs.add("mamasaheb");
		System.out.println(lhs.add("babasaheb"));;
		System.out.println(lhs.add("nanasaheb"));
		System.out.println(lhs);
		
		System.out.println(lhs.size());
		
		
	}

}
