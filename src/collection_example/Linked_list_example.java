package collection_example;

import java.util.LinkedList;

public class Linked_list_example 
{
	public static void main(String[] args) 
	{
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("amol");
		ll.add("suyog");
		ll.add("vinod");
		ll.add("ganesh");
		ll.add("gitesh");
		ll.add("sameer");
		System.out.println(ll);
		System.out.println();
		ll.addFirst("neel");
		ll.addLast("purnpatre");
		System.out.println(ll);
		System.out.println();
		System.out.println(ll.size());
		System.out.println();
		ll.add(1, "suyog babasaheb neel");
		System.out.println(ll);
		ll.set(3, "vishnu neel");
		System.out.println(ll);
		System.out.println(ll.isEmpty());
		System.out.println();
		System.out.println(ll.removeFirst());
		System.out.println(ll);
		System.out.println();
		System.out.println(ll.removeLast());
		System.out.println();
		System.out.println(ll.remove("gitesh"));
		System.out.println(ll);
		System.out.println();
		System.out.println(ll.remove(3));
		System.out.println();
		
		ll.clear();
		System.out.println(ll.isEmpty());
		
		
		
	}

}
