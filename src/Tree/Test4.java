package Tree;

import java.util.SortedSet;
import java.util.TreeSet;

public class Test4 
{
	public static void main(String[] args) 
	{
		TreeSet<Integer> ts = new TreeSet<Integer>();
		for(int i = 1 ; i<=45;i++)
		{
			ts.add(i);			
		}
		
		System.out.println(ts);
		
		SortedSet<Integer> t1 =ts.subSet(3, 9);
		System.out.println(t1);
		TreeSet<Integer> tt  = new TreeSet<Integer>();
		tt.addAll(t1);
		System.out.println(tt);
		
		
		SortedSet<Integer>t2 =ts.tailSet(5);
		TreeSet<Integer> ttt = new TreeSet<Integer>();
		System.out.println(t2);
		
		SortedSet<Integer>t3 =ts.headSet(30);
		TreeSet<Integer> tttt = new TreeSet<Integer>();
		System.out.println(t3);
		

	    
		
	}

}
