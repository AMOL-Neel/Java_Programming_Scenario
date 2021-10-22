package Abstractclasses;

public abstract class Abst1 
{
	abstract void m1();
	abstract void m2();
	abstract void m3();
}

abstract class Test extends Abst1
{
	void m1()
	{
		System.out.println("india");
	}
}
abstract class Test2 extends Test
{
	void m2()
	{
		System.out.println("aurangabad");
	}
}
class Test3 extends Test2
{
	void m3()
	{
		System.out.println("maharashtra");
	}
	public static void main(String[] args) 
	{
		Test3 t = new Test3();
		t.m1(); t.m2(); t.m3();
		
	}
}
