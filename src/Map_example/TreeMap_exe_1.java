package Map_example;

import java.util.TreeMap;

public class TreeMap_exe_1 
{
	public static void main(String[] args) 
	{
		TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
		tm.put(111, "amol");
		tm.put(222, "sagar");
		tm.put(333, "gitesh");
		
		// by using constructor approch 
		TreeMap<Integer,String> tm1 = new TreeMap<Integer,String>(tm);
		tm1.put(555, "sujit");
		tm1.put(444, "kiran");
		System.out.println(tm1);
		
		
		// by using putAll() 
		TreeMap<Integer,String > tm2 = new TreeMap<Integer,String>();
		tm2.putAll(tm1);
		tm2.put(888, "suyog");
		tm2.put(777, "chetan");
		tm2.put(999, "vinay"); 
		System.out.println(tm2);
		
		
	}

}
