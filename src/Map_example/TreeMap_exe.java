package Map_example;

import java.util.TreeMap;

public class TreeMap_exe 
{
	public static void main(String[] args) 
	{
		TreeMap<String,Integer> tm= new TreeMap<String,Integer>();
		tm.put("amol", 111);
		tm.put("vishal",44);
		tm.put("karan", 555);
		tm.put("salman", 776);
		tm.put("ratan", 998);
		System.out.println(tm);
		
		
		TreeMap<Integer,String> tm1 = new TreeMap<Integer,String>();
		tm1.put(5, "amol");
		tm1.put(4, "karan");
		tm1.put(3, "ashok");
		tm1.put(2, "gitesh");
		tm1.put(1, "sagar");
		tm1.put(8, "sagar");
		tm1.put(7, "yogesh");
		System.out.println(tm1 );
		
	}

}
