package New;

import java.util.ArrayList;
public class Test1
{
	public static void main(String[] args) 
	{
		ArrayList a = new ArrayList();

		a.add(23);
		a.add("amol");
		a.add("Ketan");
		a.add(45.5);
		a.add(55.5f);
		a.add(null);
		a.add("amol");
		a.add("ketan");

		a.remove(4);
		a.add(4, "selenium");

		a.remove("amol");
		a.set(1, "Java");

		//a.clear();

		System.out.println(a.isEmpty());
		System.out.println(a);
		System.out.println();
		System.out.println(a.toString());
	}
}


class Test2
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		a.add(34);
		a.add(45);
		System.out.println(a);
		System.out.println(a.toString());
		
		ArrayList<Integer> a1 = new ArrayList<Integer>(a);
		
		a1.add(56);
		a1.add(78);
		System.out.println(a1);
		System.out.println();
		System.out.println(a1.toString());
		
		ArrayList<Integer> a2 = new ArrayList<Integer>(a1);
		
		a2.add(22);
		a2.add(44);
		a2.add(55);
		a2.add(66);
		a2.add(77);
		a2.add(88);
		a2.add(99);
		a2.add(00);
		a2.add(11);
		a2.add(100);
		a2.add(300);
		a2.add(499);
		
		System.out.println(a1);
		System.out.println(a2.size());
		System.out.println(a2.toString());
		
	
		
		

	}

}