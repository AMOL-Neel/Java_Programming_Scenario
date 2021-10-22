package collection_example;

import java.util.ArrayList;

public class Test5 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		al.add(70);
		al.add(80);
		al.add(90);
		al.add(100);
		System.out.println(al);
		System.out.println();

		ArrayList al1 = new ArrayList(al);
		al1.add(100);
		al1.add(200);
		al1.add(300);
		al1.add(400);
		al1.add(400);
		al1.add(500);
		System.out.println(al1);
		System.out.println();

	}

}
