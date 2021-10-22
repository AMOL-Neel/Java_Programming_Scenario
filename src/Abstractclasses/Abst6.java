package Abstractclasses;

public abstract class Abst6 
{
	void m1()
	{
		System.out.println("amol");
	}
	void m2()
	{
		System.out.println("babasaheb ");
	}
	void m3()
	{
		System.out.println("neel");
	}
}

class Testee extends Abst6
{
	public static void main(String[] args) 
	{
		Testee t = new Testee();
		t.m1();t.m2();t.m3();
		
	}
}
