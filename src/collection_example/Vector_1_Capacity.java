package collection_example;

import java.util.Vector;

public class Vector_1_Capacity {
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		System.out.println(v.capacity());
		v.add("amol");
		v.add("sameer");
		v.add("suyog");
		System.out.println(v);
		System.out.println();
		System.out.println(v.capacity());
		System.out.println();

		Vector<String> v1 = new Vector<String>(5, 4);
		System.out.println(v1.capacity());
		v1.addAll(v);
		v1.add("kunal");
		v1.add("sandeep");
		v1.add("ketan");
		v1.add("sagar");
		v1.add("sujit");
		v1.add("yogesh");
		v1.add("pradeep");
		v1.add("abhishek");
		v1.add("abhijeet");
		v1.add("rushi");
		v1.add("bhushan");
		v1.add("vinay");
		v1.add("bharat");
		v1.add("tushar");
		v1.add("yash");

		System.out.println(v1);
		System.out.println(v1.capacity());

	}

}
