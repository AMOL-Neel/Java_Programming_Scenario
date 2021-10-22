package Abstractclasses;

public abstract class Abst2 
{
	abstract int m1(char h, int a);
	abstract String m2(boolean b);
	abstract String Login(String uname, String upwd);
}

abstract class Test09 extends Abst2
{
	int m1(char h, int a)
	{
		System.out.println(h);
		System.out.println(a);
		return 10;
	}
	
	String m2(boolean b)
	{
		System.out.println(b);
		return "amol";
	}
}

class Test08 extends Test09
{
	String Login(String uname, String upwd)
	{
		System.out.println(uname);
		System.out.println(upwd);
		return "facebook";
	}
	public static void main(String[] args) 
	{
		Test08 t = new Test08();
		int a =t.m1('a', 100);
		System.out.println(a);
		String str =t.m2(false);
		System.out.println(str);
		String str1 =t.Login("amol", "311094");
		System.out.println(str1);
		
	}
}
