package Basics;

public class Variable
{
	// instance variable
	int a  = 100;
	int b = 200;

	void m1()
	{
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) 
	{
		Variable t1 = new Variable();
		System.out.println(t1.a);
		System.out.println(t1.b);

		t1.m1();

	}

}

class Variable01
{
	static int a = 100;
	static int b = 200;

	void m1()
	{
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) 
	{
		Variable01 v = new Variable01();
		System.out.println(a);
		System.out.println(b);
		System.out.println();

		// 
		System.out.println(v.a);
		System.out.println(v.b);
		System.out.println();

		// 
		System.out.println(Variable01.a);
		System.out.println(Variable01.b);
		System.out.println();

		// 
		v.m1();
	}
}

class Variable02
{
	int a = 200;
	static int b = 300;

	public static void main(String[] args) 
	{
		Variable02 v = new Variable02();
		System.out.println(v.a);
		System.out.println(v.b);
		System.out.println();

		// 
		v.a = 4000;
		v.b =5000;

		System.out.println(v.a);
		System.out.println(v.b);
		System.out.println();

		//
		Variable02 v1= new Variable02();
		System.out.println(v1.a);// instance variable saperate memory allocated
		System.out.println(v1.b);// static variable for all object one memory allocated.


	}
}

class Variable03
{
	static String a = "visionit";
	String b = "amol";
	String c = "ketan";
	String d = "sandeep";

	public static void main(String[] args) 
	{
		Variable03 v = new Variable03();
		System.out.println(v.a);
		System.out.println(v.b);
		System.out.println(v.c);
		System.out.println(v.d);
		System.out.println();

		v.a = "VISIONIT";
		v.b ="amol1";
		v.c = "ketan2";
		v.d = "sandeep3";
		
		System.out.println(v.a);
		System.out.println(v.b);
		System.out.println(v.c);
		System.out.println(v.d);
		System.out.println();
		
		//
		Variable03 v1 = new Variable03();
		System.out.println(v1.a);// for the static variable there is no separate copy it shared the previous copy
		System.out.println(v1.b);// separate object means separate copy 
		System.out.println(v1.c);
		System.out.println(v1.d);
		System.out.println();
		
		// 
		v1.a = "VIT";
		v1.b = "am";
		v1.c = "ket";
		v1.d = "san";
		
		Variable03 v2 = new Variable03();
		System.out.println(v2.a);
		System.out.println(v2.b);
		System.out.println(v2.c);
		System.out.println(v2.d);
		
	}
}

class Variable04
{
	int a = 20;
	int b = 40;
	
	static void m1()
	{
		Variable04 v = new Variable04();
		System.out.println(v.a);
		System.out.println(v.b);
	}
	
	static void m2()
	{
		Variable04 v = new Variable04();
		System.out.println(v.a);
		System.out.println(v.b);
	}
	
	public static void main(String[] args) 
	{
		Variable04.m1();
		Variable04.m2();
		
	}
}

class Variable05
{
	int a = 10;
	int b = 20;
	static int c = 30;
	static int d = 40;
	
	static void m1()
	{
		Variable05 v = new Variable05();
		System.out.println(v.a);
		System.out.println(v.b);
		System.out.println(Variable05.c);
		System.out.println(Variable05.d);
	}
	
	void m2()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(Variable05.c);
		System.out.println(Variable05.d);
	}
	
	public static void main(String[] args) 
	{
		Variable05 v = new Variable05();
		v.m2();
		Variable05.m1();
		
	}
}
