package Vector;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Test2
{
	public static void main(String[] args) 
	{
		ArrayList<String> str = new ArrayList<String>();
		str.add("amol");
		str.add("ketan");
		str.add("sadeeep");

		Iterator<String> stt =str.iterator();

		while(stt.hasNext())
		{
			System.out.println(stt.next());
		}
		
		
		System.out.println("**************************************************************************");

			ArrayList<String> str1 = new ArrayList<String>();
		str1.addAll(str);
		
		ListIterator<String> stt1 = str1.listIterator();
		
		while(stt1.hasNext())
		{
			System.out.println(stt1.next());
		}
		
		while(stt1.hasPrevious())
		{
			System.out.println(stt1.previous());
		}
		
		System.out.println("*************************************************************************");
		
		Vector<String> str2 = new Vector<String>();
		
		 str2.addAll(str1);
		 
		 Enumeration e =str2.elements();
		 
		 while(e.hasMoreElements())
		 {
			 System.out.println(e.nextElement());
		 }
		
		
		
	}

}
