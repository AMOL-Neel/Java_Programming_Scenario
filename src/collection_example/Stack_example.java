package collection_example;

import java.util.Stack;

public class Stack_example {
	public static void main(String[] args) {
		Stack<String> st = new Stack<String>();
		st.push("amol");
		st.push("sujit");
		st.push("suyog");
		st.push("gitesh");
		st.push("sameer");
		System.out.println(st);

		System.out.println(st.search("sameer"));
		System.out.println();
		System.out.println(st.peek());
		System.out.println(st);
		System.out.println();
		System.out.println(st.pop());
		System.out.println(st);
		System.out.println();
		System.out.println(st.pop());
		System.out.println(st);
		System.out.println(st.empty());
		System.out.println();
		System.out.println(st.pop());
		System.out.println(st);
		System.out.println();
		System.out.println(st.pop());
		System.out.println();
		System.out.println(st.pop());
		System.out.println(st);
		System.out.println();
		System.out.println(st.empty());

	}

}
