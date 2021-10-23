package Sorting;

import java.util.ArrayList;
import java.util.Collections;

public class Test2 
{
	public static void main(String[] args) 
	{
		ArrayList<Emp2> str1 = new ArrayList<Emp2>();

		str1.add(new Emp2(111, "ratan"));
		str1.add(new Emp2(444, "anu"));
		str1.add(new Emp2(333, "durga"));
		str1.add(new Emp2(222, "sravya"));

		Collections.sort(str1);

		for(Emp2 ot: str1)
		{
			System.out.println(ot.eid+" "+ot.ename);
		}



	}

}
