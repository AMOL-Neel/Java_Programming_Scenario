package SortedMa;

import java.util.SortedMap;
import java.util.TreeMap;

public class Test 
{

	public static void main(String[] args) 
	{
		TreeMap<Integer,String > tm = new TreeMap<Integer,String>();
		tm.put(1, "amol");
		tm.put(2, "ketan");
		tm.put(3, "sanket");
		tm.put(4, "sagar");
		tm.put(5, "santosh");
		
		System.out.println(tm);
		
		SortedMap stm =tm.subMap(3, 5);
		TreeMap<Integer, String> tmm = new TreeMap<Integer,String>(stm);
		System.out.println(tmm);
		
		SortedMap<Integer,String> sm = tm.tailMap(3);
		TreeMap<Integer, String> ttt = new TreeMap<Integer,String>(sm);
		System.out.println(ttt);
		
		
		SortedMap<Integer,String> sm1 =tm.headMap(4);
		TreeMap<Integer,String> tttt = new TreeMap<Integer,String>(sm1);
		System.out.println(tttt);
		
	}

}
