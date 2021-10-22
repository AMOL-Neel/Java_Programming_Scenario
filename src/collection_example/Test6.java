package collection_example;

import java.util.ArrayList;

public class Test6 
{
	public static void main(String[] args) 
	{
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1000);
		al.add(2000);
		al.add(3000);
		al.add(4000);
		al.add(5000);
		
		System.out.println(al);
		System.out.println();
		
		ArrayList<Integer> all = new ArrayList<Integer>(al);
		all.add(115);
		all.add(125);
		all.add(135);
		all.add(145);
		all.add(155);
		System.out.println(all);
		System.out.println();
		
		all.clear();
		System.out.println(all.isEmpty());
		

		
	}

}
