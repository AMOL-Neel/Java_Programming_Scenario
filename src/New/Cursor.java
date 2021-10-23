package New;

import java.util.Enumeration;
import java.util.Vector;

public class Cursor 
{
	public static void main(String[] args) 
	{
		Vector<String> v = new Vector<String>();
		v.add("amol");
		v.add("vinod");
		v.add("ketan");
		v.add("kedar");
		v.add("rahul");
		
		
		//v.removeAll(v);

		System.out.println(v);

		// for normal version 
		Enumeration e =  v.elements();

		while(e.hasMoreElements())
		{
			String str=(String)e.nextElement();
			System.out.println(str);
		}
		
		System.out.println();

		// for generics version 
		Enumeration<String> str = 	v.elements();
		
		while(str.hasMoreElements())
		{
			String str1 = str.nextElement();
			System.out.println(str1);
			
		}

	}

}
