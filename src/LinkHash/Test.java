package LinkHash;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Test 
{
	public static void main(String[] args) 
	{
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
			lhs.add("amol");
			lhs.add("ketan");
			lhs.add("sagar");
			lhs.add("rahul");
			lhs.add("sandeep");
			
			System.out.println(lhs);
			System.out.println();
			
			LinkedHashSet<String> lhs1 = new LinkedHashSet<String>(lhs);
			
			lhs1.add("selenium");
			System.out.println(lhs1);

			/*lhs1.add("amol");
			System.out.println(lhs1);
			
			lhs1.add("rahul");
			System.out.println(lhs1);*/
			
			System.out.println();
			
			
			HashSet<String> hs = new HashSet<String>();
			hs.add("java");
			hs.add("python");
			System.out.println(hs);
			hs.addAll(lhs1);
			System.out.println(hs);
			
			
			
		
	}

}
