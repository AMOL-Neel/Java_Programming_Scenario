package Basics;

import java.util.concurrent.SynchronousQueue;

public class Methods 
{
	void m1()
	{
		System.out.println("this is instance m1 method");
	}
	
	static void m2()
	{
		System.out.println("this is static m2 method");
	}
	
	public static void main(String[] args) 
	{
		Methods m = new Methods();
		m.m1();
		Methods.m2();
		
	}

}

class Methods01
{
	void m1(int a, char c)
	{
		System.out.println("this is instance method");
		System.out.println(a);
		System.out.println(c);
	}
	
	static void m2(String s, float f)
	{
		System.out.println("this is static method");
	    System.out.println(s);
	    System.out.println(f);
	}
	
	public static void main(String[] args) 
	{
		Methods01 m = new Methods01();
		m.m1(10, 'a');
		Methods01.m2("amol", 12.5f);
	}
}

class Emp{
	void m1(int a ,int b)
	{
		System.out.println(a);
		System.out.println(b);
	}
}
class Student{}
class X{}
class Y{}

class Methods02
{
	void m1(Emp e , Student s)
	{
		System.out.println("this is m1 method");
	}
	
	static void m2(X x , Y y)
	{
		System.out.println("this is m2 method");	
	}
	
	public static void main(String[] args) 
	{
		Methods02 m = new Methods02();
		Emp e = new Emp();
		e.m1(45, 55);
		Student s = new Student();
		
		m.m1(e, s);
		
		X x = new X();
		Y y = new Y();
		Methods02.m2(x, y);
	}
	
}

class Methods03
{
	void m1()
	{
		m2();
		System.out.println("m1 method");
		m2();
	}
	
	void m2()
	{
		m3();
		System.out.println("m2 method");
	}

	void m3()
	{
		System.out.println("m3 method");
	}
	
	public static void main(String[] args) 
	{
		Methods03 m = new Methods03();
		m.m1();
		
	}
}

class Methods04
{
	int a = 100;
	int b = 200;
	
	void m1(int a, int b)
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println();
		// 
		System.out.println(this.a);
		System.out.println(this.b);
	}
	
	public static void main(String[] args) 
	{
		Methods04 m = new Methods04();
		m.m1(19, 29);
		
	}
}

class Methods05
{
	int m1()
	{
		System.out.println("the m1 method");
		return 10;
	}
	
	float m2()
	{
		System.out.println("m2 method");
		return 12.5f;
	}
	
	String m3()
	{
		System.out.println("m3 method");
		return "amol";
	}
	public static void main(String[] args) 
	{
		Methods05 m = new Methods05();
		int a =m.m1();
		System.out.println("the return value of m1():"+a);
		float f =m.m2();
		System.out.println("the return value of m2():"+f);
		String s = m.m3();
		System.out.println("the return value of m3():"+s);
	}
}

class Empl{
	Empl m1()
	{	System.out.println("this is m1 method");  return new Empl();}}

class M{}
class Methods06
{
	Empl m1()
	{
		System.out.println("emp class method");
		return new Empl() ;
	}
	
	M m2()
	{
		System.out.println("this is m2 method");
		M m = new M();
		return m;
	}
	
	public static void main(String[] args) 
	{
		Methods06 m = new Methods06();
		Empl ee =m.m1();
		System.out.println(ee);
		M mm =m.m2();
		System.out.println(mm);
		
	}
}

class Methods07
{
	Methods07 m1()
	{
		System.out.println("m1 method");
		return new Methods07();
	}
	
	Methods07 m2()
	{
		System.out.println("m2 method");
		return this;
	}
	
	public static void main(String[] args) 
	{
		Methods07 m = new Methods07();
		Methods07 m07 = m.m1();
		System.out.println(m07);
		Methods07 m007=m.m2();
		System.out.println(m007);
	}
}

class Methods08 
{
	int a = 100;
	
	int m1(int a)
	{
		System.out.println("m1 method"+a);
		return a;
	}
	
	int m2(int a)
	{
		System.out.println("m2 method"+a);
		return this.a;
	}
	
	int m3()
	{
		System.out.println("m3 method"+a);
		return a;
	}
	
	public static void main(String[] args) 
	{
		Methods08 m  = new Methods08();
		int aa =m.m1(29);
		System.out.println("the return value of m1():"+aa);
		int bb = m.m2(45);
		System.out.println("the return value of m2():"+bb);
		int cc = m.m3();
		System.out.println("the return value of m3():"+cc);
	}
}