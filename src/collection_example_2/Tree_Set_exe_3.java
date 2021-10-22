package collection_example_2;

import java.util.SortedSet;
import java.util.TreeSet;

public class Tree_Set_exe_3
{
	public static void main(String[] args) 
	{
		TreeSet<Integer> ts = new TreeSet<Integer>();
		for(int i = 1;i<=10;i++)
		{
			ts.add(i);
		
		}
		
		System.out.println(ts);
		
		// subset()
		SortedSet ts1 =ts.subSet(2, 7);
		System.out.println(ts1);
		
		
		// tailset()
		SortedSet ts2 =ts.tailSet(4);
		System.out.println(ts2);
		
		
		// headset()
		SortedSet ts3=ts.headSet(4);
		System.out.println(ts3);
		
		
	}

}
