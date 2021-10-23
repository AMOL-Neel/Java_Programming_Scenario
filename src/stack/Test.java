package stack;

import java.util.Stack;

public class Test 
{
	public static void main(String[] args) 
	{
		Stack<String> st = new Stack<String>();
		st.push("amol");
		st.push("ketan");
		st.push("sandeep");
		st.push("sameer");
		st.push("suyog");
		System.out.println(st);
		st.pop();
		System.out.println(st);
		System.out.println(st.search("sandeep"));
		System.out.println();
		
		System.out.println(st.peek());
		
		System.out.println(st.empty());
		st.clear();
		System.out.println(st.empty());

	}

}
