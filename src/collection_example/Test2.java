package collection_example;

import java.util.ArrayList;

public class Test2 {

	public static void main(String[] args) 
	{
		ArrayList  al = new ArrayList();
		al.add(new Emp(100, "amol", "capjmini"));
		al.add(new Student(1, "ketan", "SB", 25000.00f));
		al.add("visionit");
		al.add(200);
		al.add(45.55f);
		al.add(35.5);
		al.add('a');
		al.add(null);
		System.out.println(al);
		System.out.println(al.toString());
		
		for(Object oo:al)
		{
		if(oo instanceof Emp)
		{
			Emp e = (Emp) oo;
			System.out.println(e.empid+" "+e.empname+" "+e.empcompany);
		}
		if(oo instanceof Student)
		{
			Student st= (Student)oo;
			System.out.println(st.sid+" "+st.sname+" "+st.schname+" "+st.fees);
		}
		if(oo instanceof Integer)
		{
			System.out.println(oo);
		}
		if(oo instanceof String)
		{
			System.out.println(oo);
		}
		if(oo instanceof Float)
		{
			System.out.println(oo);
		}
		if(oo instanceof Double)
		{
			System.out.println(oo);
		}
		if(oo==null)
		{
			System.out.println(oo);
		}
		if(oo instanceof Character)
		{
			System.out.println(oo);
		}
		
		}
		
	}
}
