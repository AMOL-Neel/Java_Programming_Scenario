package Basics;

public class Stat 
{
	
	{
		System.out.println("instance block -1");
	}
	{
		System.out.println("instance block-2");
	}
	static 
	{
		System.out.println("static block -3");
	}
	
	static
	{
		System.out.println("static block -1");
	}
	
	static 
	{
		System.out.println("static block -2");
	}
	
	Stat()
	{
		System.out.println("0-arg constructor");
	}
	
	Stat(int a)
	{
		System.out.println("1-arg constructor");
	}
	
	public static void main(String[] args) 
	{
		new Stat();
		new Stat(19);
	}

}

class Stat01
{
	{
		System.out.println("instance block-1");
	}
	{
		System.out.println("instance block-2");
	}
	
	static
	{
		System.out.println("static block -3");
	}
	static
	{
		System.out.println("static block--2");
	}
	static 
	{
		System.out.println("static block-1");
	}
	
	public static void main(String[] args) 
	{
		
		
	}
}

class Stat02
{
	{
		System.out.println("instance block");
	}
	
	static 
	{
		System.out.println("static block");
	}
	
}

class Stat03
{
	static int a;
	
	static
	{
		a =45;
	}
	
	void disp()
	{
		System.out.println(Stat03.a);
	}
	
	public static void main(String[] args) 
	{
		new Stat03().disp();
		
		
	}
}

class Stat04
{
	int a ;
	static int b ;
	
	void m1(int c)
	{
		System.out.println(c);
	}
	
	Stat04()
	{
		System.out.println("0-arg constructor");
	}
	
	{
		a=30;
		System.out.println("instance block"+a);
	}
	static
	{
		b=45;
		System.out.println("static block"+b);
	}
	public static void main(String[] args) 
	{
		new Stat04().m1(65);
		
	}
}

