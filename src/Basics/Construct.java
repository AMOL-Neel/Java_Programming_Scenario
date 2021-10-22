package Basics;

public class Construct
{
	void m1()
	{
		System.out.println("m1 method");
	}
	
	Construct()
	{
		System.out.println("0-arg constructor");
	}
	
	Construct(int a)
	{
		System.out.println("1-arg constructor");
	}
	
	public static void main(String[] args) 
	{
		Construct c1 = new Construct();
		Construct c = new Construct(12);
		c.m1();
		
	}

}

class Construct01
{
	int a;
	float b;
	String c;
	
	Construct01()
	{
		a = 10;
		b= 23.3f;
		c= "amol";
	}
	
	void disp()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
	public static void main(String[] args) 
	{
		Construct01 c = new Construct01();
		c.disp();
		
	}
}

class Construct02
{
	int sid;
	String sname;
	
	Construct02(int sid, String sname)
	{
		
	}
	
	void disp()
	{
		System.out.println("student id ="+sid);
		System.out.println("student name ="+sname);
	}
	
	public static void main(String[] args) 
	{
		Construct02 c  = new Construct02(111,"amol");
		c.disp();
		
		
	}
}

class Construct03
{
	int sid;
	String sname;
	float sfees;
	String scname;
	
	Construct03(int sid, String sname)
	{
	}
	
	Construct03(float sfees, String scname)
	{
		this.sfees = sfees;
		this.scname = scname;
		
	}
	
	void disp()
	{
		System.out.println("student id ="+sid);
		System.out.println("student name ="+sname);
		System.out.println("student fees = "+sfees);
		System.out.println("student school name ="+scname);
	}
	
	public static void main(String[] args) 
	{
		Construct03 c  = new Construct03(111,"amol");
		c.disp();
		
		Construct03 c1 = new Construct03(1500.00f,"VISIONTI");
		c1.disp();	
	}
}

class Construct04
{
	Construct04()
	{
		System.out.println("this is 0 arg constructor.");
	}
	
	Construct04(int a)
	{
		System.out.println("this is 1 arg constructor.");
	}
	
	Construct04(int a, int b)
	{
		System.out.println("this is 2 arg constructor.");
	}
	
	public static void main(String[] args) 
	{
		// named object 
		Construct04 c = new Construct04();
		Construct04 c1 =new Construct04(10);
		Construct04 c2 = new Construct04(20,30);
		System.out.println();
		
		// nameless approach
		new Construct04();
		new Construct04(90);
		new Construct04(80,70);
		
	}
	
}
