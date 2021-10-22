package stringex;

public class Emp
{
	String empname;
	int empid;

	Emp(String empname, int empid)
	{
		this.empname = empname;
		this.empid = empid;
	}
	
	public static void main(String[] args) 
	{
		Emp e = new Emp("amol",100);
		System.out.println(e);
		System.out.println(e.toString());
		// the output will be printed because we cant override toString()
		//		stringex.Emp@15db9742
		//		stringex.Emp@15db9742
		
		
		
		
	}
}
