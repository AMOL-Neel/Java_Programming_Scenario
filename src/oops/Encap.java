package oops;

import javax.naming.ldap.ExtendedRequest;

public class Encap 
{
	private int eid;
	private String ename;
	
	public void SetEid(int eid)
	{
		this.eid = eid;
	}
	public void SetEname(String ename)
	{
		this.ename = ename;
	}
	public int getEid()
	{
		return eid;
	}
	public String getEname()
	{
		return ename;
	}
	public static void main(String[] args) 
	{
		Encap e = new Encap();
		e.SetEid(200);
		e.SetEname("amol");
		// for getting values
		int EID =e.getEid();
		System.out.println("the employee id is"+EID);
		
		String Ename =e.getEname();
		System.out.println("the employee name is"+Ename);
	}

}
class Encap1
{
	public static void main(String[] args) 
	{
		Encap e = new Encap();
		e.SetEid(200);
		e.SetEname("amol");
		// for getting values
		int EID =e.getEid();
		System.out.println("the employee id is"+EID);
		
		String Ename =e.getEname();
		System.out.println("the employee name is"+Ename);
		
		Encap e1 = new Encap();
		e1.SetEid(400);
		e1.SetEname("ketan");
		
		// for getting values
		int Eid =e1.getEid();
		System.out.println("the eid is "+Eid);
	
		String Ename1 = e1.getEname();
				System.out.println("the ename is "+Ename1);
				System.out.println();
				
				System.out.println(e1.getEid());
				System.out.println(e1.getEname());
		
	}
}
