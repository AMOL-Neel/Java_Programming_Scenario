package Sorting;

import java.util.ArrayList;
import java.util.Collections;

public class Test1  
{

	public static void main(String[] args) 
	{
		
		// sorting of eid using normal version of comparable 
		ArrayList<Emp> str = new ArrayList<Emp>();
		
		str.add(new Emp(333, "amol"));
		str.add(new Emp(444, "ketan"));
		str.add(new Emp(111, "sandeep"));
		str.add(new Emp(222, "rahul"));
		str.add(new Emp(000, "karan"));
		
		Collections.sort(str);
		
		for(Emp oo:str)
		{
			System.out.println(oo.eid+" "+oo.ename);
		}
		
		
		
		
		
		
	}
	
}


