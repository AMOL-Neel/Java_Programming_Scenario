package Sorting;

public class Emp  implements Comparable
{
	int eid;
	String ename;
	
	Emp(int eid, String ename)
	{
		this.eid = eid;
		this.ename = ename;
		
	}

	@Override
	public int compareTo(Object o) 
	{
		
		Emp ee= (Emp)o;
		if(eid== ee.eid)
			return 0 ;
		else if(eid>ee.eid)
			return 1;
		else 
		return -1;
		
	}

	
}

// sorting of eid using normal version of comparable 
// you have to check Emp and Test1 class 
