package TreeMSort;

import java.util.TreeMap;

public class Test 
{
	public static void main(String[] args) 
	{
		TreeMap<String ,Integer>  t = new TreeMap<String, Integer>();
		t.put("amol", 111);
		t.put("ketan", 222);
		t.put("kedar", 333);
		t.put("rahul", 444);
		t.put("ramu", 555);
		//t.put(null, 666);
		
		System.out.println(t);
		
		TreeMap<Integer,String> tt = new TreeMap<Integer,String>();
		tt.put(11, "gitesh");
		tt.put(14, "santosh");
		tt.put(13, "satish");
		tt.put(12, "sagar");
		tt.put(15, "karan");
		tt.put(1, null);
     	System.out.println(tt);
		
		
	  
		
		
	}

}
