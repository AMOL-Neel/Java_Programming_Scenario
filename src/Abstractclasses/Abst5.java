package Abstractclasses;

public abstract  class Abst5
{
	abstract void m1();
	void m2()
	{
		System.out.println("m2 method");
	}
	{
		System.out.println("instance block");
	}
	static 
	{
		System.out.println("static block ");
	}
	Abst5()
	{
		System.out.println("abstract constructor");
	}
	

}

class Test001 extends Abst5
{

	void m1()
	{
		System.out.println("implementation m1 method ");
	}
	Test001()
	{
		System.out.println("implementation class constructor");
	}
	public static void main(String[] args) 
	{
		Test001 t = new Test001();
		t.m1();t.m2();
		
	}
}
