package collection_example_2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.RandomAccess;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Vector;

public class Test5 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		System.out.println(al instanceof List);
		System.out.println(al instanceof RandomAccess);
		System.out.println(al instanceof Cloneable);
		System.out.println(al instanceof Serializable);

		LinkedList<String> ll = new LinkedList<String>();
		System.out.println(ll instanceof Cloneable);
		System.out.println(ll instanceof Serializable);
		System.out.println(ll instanceof List);
		System.out.println(ll instanceof RandomAccess);
		
		Vector<String> v = new Vector<String>();
		System.out.println(v instanceof List);
		System.out.println(v instanceof Cloneable);
		System.out.println(v instanceof Serializable);
		System.out.println(v instanceof RandomAccess);
		
		TreeSet<String> ts = new TreeSet<String>();
		System.out.println(ts instanceof Cloneable);
		System.out.println(ts instanceof Serializable);
		System.out.println(ts instanceof SortedSet);
		

	}

}
