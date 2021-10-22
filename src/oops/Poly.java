package oops;

public class Poly 
{
	void m1(int a)
	{
		System.out.println("m1 method with 1 int argument");
	}
	
	void m1(int a, int b)
	{
		System.out.println("m1 method with 2 int argument");
	}
	void m1(char c)
	{
		System.out.println("m1 method with character");
	}
	
	
	public static void main(String[] args) 
	{
		Poly p = new Poly();
		p.m1(23);
		p.m1(34, 344);
		p.m1('k');
	}
}

class P 
{
	void marry()
	{
		System.out.println("black girl");
	}
	
}
class Ch extends P
{
	void marry()
	{
		System.out.println("white girl");
	}
	
	public static void main(String[] args) 
	{
		new Ch().marry();
	}
}

class P1
{
    int marry()
	{
		System.out.println("black girl"); return 10;
	}
}

class Ch1 extends P1
{
	int marry()
	{
		System.out.println("white girl"); return 20;
	}
	
	public static void main(String[] args)
	{
		new Ch1().marry();
		
	}
}

class Animal{}
class Dog extends Animal{}
class P2
{
	Animal marry()
	{
		System.out.println("black girl"); return new Animal();
	}
}
class Ch2 extends P2
{
	Dog marry()
	{
		System.out.println("white girl"); return new Dog();
	}
	public static void main(String[] args) 
	{ new Ch2().marry();
	}
}

final class Final
{
	int a = 10;
	void m1()
	{
		 a= a+10;
		 System.out.println(a);
	}
	public static void main(String[] args) 
	{
		new Final().m1();
		
	}
}

class Pa
{
	void m1()
	{ 
		System.out.println("parent class m1 method");
	}
}
class Chi extends Pa
{
	void m1()
	{
		System.out.println("child class m1 method");
	}
	void m2()
	{
		System.out.println("child class m2 method");
	}
	public static void main(String[] args) 
	{
		Pa p = new Chi();
		p.m1();
		Chi c =(Chi)p;
		c.m2(); 
		
		
	}
}