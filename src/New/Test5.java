package New;

import java.util.ArrayList;

public class Test5 
{
	public static void main(String[] args) 
	{
		Emp  e = new Emp("amol",111);
		Emp  e1 = new Emp("Ketan",112);
		Emp  e2 = new Emp("Kedar",113);
	
		ArrayList<Emp> a1 = new ArrayList<Emp>();
		a1.add(e);
		
		ArrayList<Emp> a2 = new ArrayList<Emp>();
		a2.addAll(a1);
		a2.add(e1);
		a2.add(e2);
		
		/*System.out.println(a1.contains(e));
		System.out.println(a2.containsAll(a1));
		System.out.println(a2.contains(e2));
		a2.remove(e1);
		System.out.println(a2.contains(e1));
		System.out.println(a2.containsAll(a1));
		*/
		
		a2.removeAll(a1);
		System.out.println();
		a2.retainAll(a1);
		
		for(Emp ee:a2)
		{
			System.out.println(ee.eid+""+ee.ename);
		}
		
		
		
	}

}
