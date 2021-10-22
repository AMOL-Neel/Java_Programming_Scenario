package oops;

import java.util.concurrent.SynchronousQueue;

public class Inherit 
{
	void m1()
	{
		System.out.println("m1 method");
	}
	void m2()
	{
		System.out.println("m2 method");
	}
}

class Inherit01 extends Inherit
{
	void m3()
	{
		System.out.println("m3 method");
	}
	void m4()
	{
		System.out.println("m4 method");
	}
}

class Inherit02 extends Inherit01
{
	void m5()
	{
		System.out.println("m5 method");
	}
	void m6()
	{
		System.out.println("m6 method");
	}
	
	public static void main(String[] args) 
	{
		Inherit02 i = new Inherit02();
		i.m1();
		i.m2();
		i.m3();
		i.m4();
		i.m5();
		i.m6();	
	}
}

class Inherit03
{
	void m1()
	{
		System.out.println("m1 method");
	}
	
	void m2()
	{
		System.out.println("m2 method");
	}
}

final class Inherit04 extends Inherit03
{
	void m3()
	{
		System.out.println("m3 method");
	}
	void m4()
	{
		System.out.println("m4 method");
	}
	public static void main(String[] args) 
	{
		Inherit04 i = new Inherit04();
		i.m1();i.m2();i.m3();i.m4();
	}
}
/*class Inherit05 extends Inherit04
{
	public static void main(String[] args) {
		
	}
}*/

class Parent 
{
	int a  = 10;
	int b = 20;
}

class Child extends Parent
{
	int x = 100;
	int y = 200;
	
	void add(int i, int j)
	{
		System.out.println(i+j);
		System.out.println(x+y);
		System.out.println(a+b);
	}
	public static void main(String[] args) 
	{
		Child c = new Child();
		c.add(1000, 2000);
	}
}

class Parent1
{
	int a  = 10;
	int b = 20;
}

class Child1 extends Parent1
{
	int a = 100;
	int b = 200;
	
	void add(int a, int b)
	{
		System.out.println(a+b); // local variable
		System.out.println(this.a+this.b);// current class variable
		System.out.println(super.a+super.b);// super class variable
	}
	public static void main(String[] args) 
	{
		Child1 c = new Child1();
		c.add(1000, 2000);
	}	
}

class Parent2
{
	void m1()
	{
		System.out.println("parent class m1 method");
	}
}

class Child2 extends Parent2
{
	void m1()
	{
		System.out.println("child class m1 method.");
	}
	void m2()
	{
		m1();
		super.m1();
	}
	
	public static void main(String[] args) 
	{
		new Child2().m2();
	}
}

class Parent3
{
	Parent3()
	{
		System.out.println("parent class 0-arg constructor.");
	}
}

class Child3 extends Parent3
{
	Child3()
	{
		this(12);
		System.out.println("child class 0-arg constructor");
	}
	
	Child3(int a)
	{
		super();
		System.out.println("child class 1-arg constructor");
	}
	public static void main(String[] args) 
	{
		new Child3();
	}
}

class Parent4
{
	Parent4()
	{
		System.out.println("parent class 0-arg constructor.");
	}
}

class Child4 extends Parent4
{
	Child4(){
		System.out.println("child class 0-arg constructor");
	}
	public static void main(String[] args) 
	{
		new Child4();	
	}
}

class Parent5
{
	Parent5()
	{
		System.out.println("parent class 0-arg constructor.");
	}
}

class Child5 extends Parent5
{
	Child5(){
		System.out.println("child class 0-arg constructor.");
	}
	
	Child5(int a)
	{
		System.out.println("child class 1-arg constructor.");
	}
	
	public static void main(String[] args) 
	{
		new Child5();
		new Child5(45);
		
	}
}


