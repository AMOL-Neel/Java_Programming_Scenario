package stack;

import java.util.LinkedList;

public class Test1 
{
	public static void main(String[] args)
	{
		LinkedList<String> str = new LinkedList<String>();
		str.add("amol");
		str.add("ketan");
		str.add("kedar");
		System.out.println(str);

		str.addFirst("sandeep");
		str.addLast("rahul");

		System.out.println(str);
		str.add(3, "Ram");
		System.out.println(str);
		System.out.println(str.size());
		str.push("sujit");
		System.out.println(str);
		
		str.add(4, "suraj");
		System.out.println(str);
		System.out.println(str.size());
		System.out.println(str.pop());
		System.out.println(str);
		System.out.println();
		
		str.removeFirst();
		System.out.println(str);
		
		System.out.println();
		
		str.removeLast();
		System.out.println(str);
		
		System.out.println();
		
		str.removeFirstOccurrence(str);
		System.out.println(str);
		
		System.out.println();
		
		str.removeLastOccurrence(str);
		System.out.println(str);


	}

}
