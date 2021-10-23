package New;

import java.util.ArrayList;
import java.util.ListIterator;

public class Cursor3
{
	public static void main(String[] args) 
	{
		ArrayList<String> str = new ArrayList<String>();
		str.add("amol");
		str.add("ketan");
		str.add("kedar");
		str.add("nilesh");
		str.add("karan");
		str.add("sandeep");
		str.add("suyog");
		System.out.println(str);
		
		
		// normal

		ListIterator s1 = str.listIterator();

		while(s1.hasNext())
		{

			String st = (String)s1.next();
			System.out.println(st);
		}
		//generics
		
		
		ArrayList<String> str2 = new ArrayList<String>();
	    str2.addAll(str);
	    System.out.println(str2);
	    
	    ListIterator<String> st2= str2.listIterator();
	    while(st2.hasNext())
	    {
	    	System.out.println(st2.next());
        }
	    System.out.println();
    	while(st2.hasPrevious())
    	{
    		System.out.println(st2.previous());
    	}
    	
    	str2.set(4, "mayank");
    	System.out.println(str2.toString());
    	str2.remove(4);
    	System.out.println(str2.toString());
    	str2.add("avinash");
    	System.out.println(str2.toString());
    	
    	
		
    	
    	
    	

	    
	}

}
