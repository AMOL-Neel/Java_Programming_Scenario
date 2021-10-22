package Abstractclasses;

public abstract class Abst3
{
	abstract void m1(int a, int b);
	abstract void m1(char ch, char ch1);
	abstract void m1(String uname, String pwd);
}

abstract class Test07 extends Abst3
{
	public void m1(int a, int b)
	{
		System.out.println(a+b);
	}
}
abstract class Test06 extends Test07
{
	public void m1(char ch, char ch1)
	{
		System.out.println("ch:"+ch+"ch1:"+ch1);
	}
}
class Test05 extends Test06
{
	void m1(String uname, String pwd) 
	{
		System.out.println("username:"+uname+"password:"+pwd);
	}
	public static void main(String[] args) 
	{
		Test05 t = new Test05();
		t.m1('a', 'm');
		t.m1(10, 20);
		t.m1("amol", "311094");

	}



}
