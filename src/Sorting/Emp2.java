package Sorting;

public class Emp2  implements Comparable<Emp2>
{
	int eid;
	String ename;
	
	Emp2(int eid, String ename)
	{
		this.eid = eid;
		this.ename = ename;
		
	}

	@Override
	public int compareTo(Emp2 oo) 
	{
		 return ename.compareTo(oo.ename);
	}

}

// sorting of ename generics version of Comparable 
// check Emp2 and Test2 program 