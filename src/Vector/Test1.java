package Vector;

import java.util.Iterator;
import java.util.Vector;

public class Test1 
{
	public static void main(String[] args) 
	{
		Vector<Integer> v1 = new Vector<Integer>();
		for(int i = 1; i<=30; i++)
		{
			v1.add(i);
		}
		
		System.out.println(v1);
		
	Iterator<Integer> sss=	v1.iterator();
	
	while(sss.hasNext())
	{
	  Integer int1 =sss.next();
	  if(int1%2==0)
		  System.out.println(int1);
	  else
		  sss.remove();
	}
	
	System.out.println(v1);
	
		
	}

}
