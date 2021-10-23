package New;

import java.util.ArrayList;

public class Test3
{
	public static void main(String[] args) 
	{
		// Constructor Approach to add data into another collection 
		// only one collection into another 
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		a.add(34);
		a.add(444);
		
		ArrayList <Integer> a1 = new ArrayList<Integer>(a);
		a1.add(5555);
		a1.add(55553);
		
		System.out.println(a1);
		System.out.println(a1.toString());
		
		// 2nd approach to add data into another collection 
		// to add more then one collection into another 
		
		
		ArrayList<Integer> a2= new ArrayList<Integer>();
		a2.add(88);
		a2.add(99);
		a2.addAll(a);
		a2.addAll(a1);
		System.out.println(a2.toString());
		System.out.println(a2);
		
		
	}

}
