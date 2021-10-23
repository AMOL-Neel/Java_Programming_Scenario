package SortedMa;

import java.util.Comparator;
import java.util.TreeMap;


public class Test1 
{
	public static void main(String[] args) 
	{
	
		TreeMap<Integer,String> tm = new TreeMap<Integer,String>(new MyComp() );
		tm.put(2, "amol");
		tm.put(22, "sagar");
		tm.put(44, "gitesh");
		tm.put(443, "sanket");
		tm.put(95, "lokesh");
		
		System.out.println(tm);
		
		
	}

}

class MyComp implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) {
		return o1.compareTo(o2);
	}
	
}
