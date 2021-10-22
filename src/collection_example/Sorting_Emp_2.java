package collection_example;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting_Emp_2 
{
	public static void main(String[] args) 
	{
		ArrayList<Emp_2> al = new ArrayList<Emp_2>();
		al.add(new Emp_2(11, "amol", 42346, 100));
		al.add(new Emp_2(12, "ketan", 45346, 200));
		al.add(new Emp_2(13, "kedar", 10000, 300));
		al.add(new Emp_2(14, "gitesh", 25000, 400));
		al.add(new Emp_2(15, "sameer", 10000, 500));
		al.add(new Emp_2(16, "rahul", 15000, 600));
		al.add(new Emp_2(17, "ram", 95000, 700));
		
		Collections.sort(al);
		
		for(Emp_2 e:al)
		{
			System.out.println(e.eid+" "+e.ename+" "+e.esalary+" "+e.esrlno);
			 
		}
		
	}

}
