package Basics;

public class Insta 
{
	Insta()
	{
		System.out.println("this is constructor");
	}
	
	{
		System.out.println("this is instance block");
	}
	
	public static void main(String[] args) 
	{
		Insta i = new Insta();
	}
}


class Insta01
{
	Insta01()
	{
		System.out.println("0- arg constructor");
	}
	
	Insta01(int a)
	{
		System.out.println("1-arg constructor");
	}
	
	Insta01(int a, int b)
	{
		System.out.println("2-arg constructor");
	}
	{
		System.out.println("instance block");
	}
	
	public static void main(String[] args) 
	{
		new Insta01();
		new Insta01(19);
		new Insta01(20,21);
	}
}

class Insta02
{
	{
		System.out.println("instance block-3");
	}
	
	{
		System.out.println("instance block-1");
	}
	
	{
		System.out.println("instance block-2");
	}
	Insta02()
	{
		System.out.println("0-arg constructor");
	}
	
	Insta02(int a)
	{
		System.out.println("1-arg constructor");
	}
	Insta02(int a, int b)
	{
		System.out.println("2-arg constructor");
	}
	
	public static void main(String[] args) 
	{
		new Insta02();
		new Insta02(10);
		new Insta02(34,45);
		
	}
	
}

class Insta03
{
	Insta03()
	{
		this(34);
		System.out.println("0-arg constructor");
	}
	{
		System.out.println("instance block-2");
	}
	
	Insta03(int a)
	{
		System.out.println("1-arg constructor");
	}
	{
		System.out.println("instance block-1");
	}
	
	public static void main(String[] args)
	{
		new Insta03();
		
	}
	
}

class Insta04
{
	int a ;
	
	{
		a = 56;
	}
	
	void disp()
	{
		System.out.println(a);
	}
	
	public static void main(String[] args) 
	{
		new Insta04().disp();
		
	}
}


