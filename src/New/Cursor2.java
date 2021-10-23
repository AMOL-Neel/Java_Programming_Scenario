package New;

import java.util.ArrayList;
import java.util.Iterator;

public class Cursor2 
{
	public static void main(String[] args) 
	{
		ArrayList<String> str = new ArrayList<String>();
		str.add("amol");
		str.add("ketan");
		str.add("kedar");
		str.add("nilesh");
		str.add("ravi");
		str.add("sandeep");
		System.out.println(str);
		
		
		// for normal version 
		Iterator itr= str.iterator();
		
		while(itr.hasNext())
		{
			String s = (String)itr.next();
			System.out.println(s);
		}
		System.out.println();
		
		// for generics version 
		
		Iterator<String> itr1 =str.iterator();
		
		while(itr1.hasNext())
		{
		  String s1=	itr1.next();
		  System.out.println(s1);
		}
		
	}

}
