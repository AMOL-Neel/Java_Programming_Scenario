package Vector;

import java.util.ArrayList;
import java.util.Vector;

public class Test 
{
	public static void main(String[] args) 
	{
		Vector<String> v1 = new Vector<String>(2,6);
		System.out.println(v1.capacity());
		v1.add("amol");
		v1.add("ketan");
		v1.add("vinod");
		v1.add("suyog");
		System.out.println(v1);
		System.out.println(v1.capacity());
		
		Vector<String> v2 = new Vector<String>(v1);
		System.out.println(v2);
		
		ArrayList<String> v3 = new ArrayList<String>(v2);
		System.out.println(v3);
		
		
		

		
	}

}
