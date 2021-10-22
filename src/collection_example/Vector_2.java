package collection_example;

import java.util.Iterator;
import java.util.Vector;

public class Vector_2 
{
	public static void main(String[] args) 
	{
		Vector<Integer> v = new Vector<Integer>();
		for(int i= 1;i<=30;i++)
		{
			v.add(i);
		}
		
		System.out.println(v);
		
		// remove alll element by using iterator
		Iterator<Integer> itr =v.iterator();
		while(itr.hasNext())
		{
			Integer i =itr.next();
			
			if(i%2==0)
				System.out.println(i);
			else 
				itr.remove();
			
		}
		
		Integer[] i1 = new Integer[v.size()];
		v.toArray(i1);
		
		for(Integer ii:i1)
		{
			System.out.println(v);
		}
	}
	
	

}
