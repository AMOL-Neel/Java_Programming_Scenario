package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

public class Test 
{
	public static void main(String[] args) 
	{
		ArrayList<String> str = new ArrayList<String>();
		
		str.add("amol");
		str.add("ketan");
		str.add("sandeep");
		str.add("rahul");
		System.out.println("before sorting :"+str);
		Collections.sort(str);
		System.out.println("after sorting :"+str);
		
		System.out.println();
		
		ArrayList<Integer> str1 = new ArrayList<Integer>();
		str1.add(45);
		str1.add(55);
		str1.add(678);
		str1.add(8);
		str1.add(5);
		System.out.println("before sorting ="+str1);
		Collections.sort(str1);
		System.out.println("after sorting ="+str1);
		
		ArrayList al = new ArrayList();
		al.add("amol");
		al.add(55);
		System.out.println("before sorting "+al);
		Collections.sort(al);
		System.out.println("after sorting "+al);
		
		
		Vector v = new Vector();
		v.add(45);
		v.add("amol");
		v.add(null);
		System.out.println("before sorting "+v);
		Collections.sort(v);
		System.out.println("after sorting "+v);
		
		
		
		
		
	}

}
