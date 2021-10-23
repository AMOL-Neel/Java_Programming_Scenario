package Tree;

import java.util.Comparator;
import java.util.TreeSet;

public class Test1 
{
	public static void main(String[] args) 
	{
		TreeSet<String> ts = new TreeSet<String>(new MyComp());
	    ts.add("amol");
	    ts.add("ketan");
	    ts.add("sameer");
	    ts.add("sandeep");
	    System.out.println(ts);
	    

		TreeSet<Integer> ts1 = new TreeSet<Integer>(new MyCompt());
		ts1.add(1);
		ts1.add(45);
		ts1.add(5556);
		ts1.add(5786);
		ts1.add(543);
		System.out.println(ts1);
	}
	

}


// for decending order 
class MyComp implements Comparator<String>
{

	@Override
	public int compare(String o1, String o2) 
	{
		
		return -o1.compareTo(o2);
	}
	
}

class MyCompt implements Comparator<Integer>
{

	@Override
	public int compare(Integer i1, Integer i2) 
	{
		return -i1.compareTo(i2);
	}
	
}