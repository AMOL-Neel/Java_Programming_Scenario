package New;

import java.util.ArrayList;

public class Test4 
{
	public static void main(String[] args) 
	{
		Emp  e = new Emp("amol",111);
		Emp  e1 = new Emp("Ketan",112);
		Emp  e2 = new Emp("Kedar",113);
		Emp  e3 = new Emp("Sameer",114);
		Emp  e4 = new Emp("Ram",115);
		
		ArrayList<Emp> a1 = new ArrayList<Emp>();
		a1.add(e);
		a1.add(e1);
		
		ArrayList<Emp> a2 = new ArrayList<Emp>(a1);
		System.out.println(a2.toString());
		a2.add(e2);
		a2.add(e3);
		a2.add(e4);
		a2.addAll(a1);
		System.out.println(a1.toString());
		
		a2.remove(e2);
		System.out.println(a2.toString());
		
		a2.removeAll(a1);
		System.out.println(a2.toString());
		
		a1.removeAll(a1);
		a2.removeAll(a2);
		System.out.println(a1);
		System.out.println(a2);
		ArrayList<Emp> i = new ArrayList<Emp>(a1);
		System.out.println(a1);
		a2.retainAll(a1);
		System.out.println(a1);
		
		
		
		for(Emp ee:a2)
		{
			System.out.println(ee.eid+" "+ee.ename );
		}
		
		 
		
		
		
		
	}

}
