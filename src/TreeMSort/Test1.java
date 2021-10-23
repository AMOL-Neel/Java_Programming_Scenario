package TreeMSort;

import java.util.TreeMap;

public class Test1
{
	public static void main(String[] args) 
	{
		TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
		tm.put("amol", 111);
		tm.put("kedar", 222);
		tm.put("ketan", 54);
		tm.put("rahul", 45);
		tm.put("sagar", 98);
		System.out.println(tm);
		
		TreeMap<String, Integer> tm1 = new TreeMap<String, Integer>();
		tm1.put("sanket", 980);
		tm1.put("java", 587);
		tm1.putAll(tm);
		System.out.println(tm1);
		
		TreeMap<String, Integer> tm2 = new TreeMap<String, Integer>(tm1);
		System.out.println(tm2);
		
	}

}
