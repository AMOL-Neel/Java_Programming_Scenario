 package Tree;

import java.util.TreeSet;

public class Test 
{
	public static void main(String[] args) 
	{
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("amol");
		ts.add("ketan");
		ts.add("yogesh");
		ts.add("sujit");
		System.out.println(ts);
		System.out.println();
		
		TreeSet<Integer> ts1 = new TreeSet<Integer>();
		ts1.add(1);
		ts1.add(45);
		ts1.add(6789);
		ts1.add(54);
		ts1.add(2);
		ts1.add(6);
		System.out.println(ts1);
		
		System.out.println();
		
		
		// class cast exception 
		TreeSet ts2  = new TreeSet();
		ts2.add("amol");
		ts2.add(56);
		System.out.println(ts2);
		
		System.out.println();
		
		// null pointer exception
		TreeSet ts3 = new TreeSet();
        ts3.add("amol");
        ts3.add("karan");
        ts3.add(null);
        System.out.println(ts3);
		
        System.out.println();
        
        // null is not allowed else null pointer exception
        TreeSet ts4 = new TreeSet();
        ts4.add(null);
        System.out.println(ts4);
		
	}

}
