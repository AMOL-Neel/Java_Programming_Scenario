package New;

import java.util.ArrayList;
import java.util.Arrays;

// conversion process

public class Test6 
{
	public static void main(String[] args) 
	{
		String [] s = { "aaa", "bbb", "ccc"};
		
		ArrayList<String> a1 = new ArrayList<String>(Arrays.asList(s));
		a1.add("amol");
		a1.add("ketan");
		a1.add("ram");
		System.out.println("this is a1 collection");
		System.out.println(a1.toString());
		
		// conversion of <generics> Collection to String Array
		
		ArrayList<String> a2 = new ArrayList<String>();
		a2.addAll(a1);
		System.out.println("this is a2 collection ");
		System.out.println(a2);
		
		String [] str = new String[a2.size()];
		
		a2.toArray(str);
		
		for(String ss:str)
		{
			System.out.println(ss);
		}
		
		// collection of normal collection to array
		ArrayList a3 = new ArrayList();
		a3.add("amol");
		a3.add(56);
		a3.add(35.5f);
		
	    Object[] O =a3.toArray();
	    
	    for(Object OO : O)
	    {
	    	System.out.println(OO);
	    }
		
		System.out.println(a3);
		
		System.out.println("collection");
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("amol");
		al.add("ketan");
		al.add("sandeep");
		al.add("kedar");
		al.add("ram");
		al.add("rahul");
		al.set(2, "ravi");

		al.add(3, "Vinod");
		al.remove(3);
		al.remove("amol");
		al.remove("rahul");
		
		System.out.println(al.toString());
		System.out.println(al.isEmpty());
		al.clear();
		System.out.println(al.toString());

		
		
		
	}
	

}
