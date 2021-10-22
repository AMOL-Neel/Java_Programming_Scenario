package collection_example;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting_Emp_1 {
	public static void main(String[] args) {
		ArrayList<Emp_1> al = new ArrayList<Emp_1>();
		al.add(new Emp_1(12, "amol", 23000));
		al.add(new Emp_1(22, "ketan", 2000));
		al.add(new Emp_1(886, "yogesh", 45000));
		al.add(new Emp_1(44, "sandeep", 55990));
		al.add(new Emp_1(999, "sam", 10000));
		al.add(new Emp_1(46, "gitesh", 35000));
		
		Collections.sort(al);
		
		for(Emp_1 e:al)
		{
			System.out.println(e.id+" "+e.name+" "+e.salary);
		}

	}

}
