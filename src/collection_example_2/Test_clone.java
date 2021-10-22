package collection_example_2;

import java.util.ArrayList;

public class Test_clone 
{
	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("amol");
		al.add("sujit");
		al.add("kunal");
		al.add("sanket");
		al.add("ketan");
		System.out.println(al);
		
		ArrayList<String> al1 =(ArrayList<String>)al.clone();
		System.out.println(al1);
		
	}

}
