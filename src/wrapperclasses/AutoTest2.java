package wrapperclasses;

import java.util.ArrayList;

public class AutoTest2 {
	public static void main(String[] args) {
		// no auto boxing
		ArrayList al = new ArrayList();
		al.add(new Integer(10));
		al.add(new Float(10.5f));
		al.add(new Double(12.5));
		al.add(new Character('a'));
		System.out.println(al);
		System.out.println();

		// with autoboxing
		ArrayList a = new ArrayList();
		a.add(10);
		a.add('b');
		a.add(23.5f);
		a.add(122.5);
		a.add("amol");
		System.out.println(a);

	}
}
