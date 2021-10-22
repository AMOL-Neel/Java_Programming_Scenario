package collection_example;

import java.util.Enumeration;
import java.util.Vector;

public class Cursor_example 
{
	public static void main(String[] args)
	{
		Vector<String> v = new Vector<String>();
		v.add("amol");
		v.add("sameer");
		v.add("vinod");
		v.add("akash");
		v.add("ketan");
		
		// read the data by using enumeration : without generics
		Enumeration e =v.elements();
		
		while(e.hasMoreElements())
		{
			String st =(String)e.nextElement();
			System.out.println(st);
		}
		System.out.println();
		
		
		// read the data by using enumeration : with generics version
		Enumeration<String> e1 =v.elements();
		
		while(e1.hasMoreElements())
		{
			String st =e1.nextElement();
			System.out.println(st);
		}
		
	}
	

}
