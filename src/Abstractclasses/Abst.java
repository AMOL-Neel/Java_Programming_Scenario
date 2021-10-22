package Abstractclasses;

public abstract class Abst 
{
	abstract void m1();
	abstract void m2();
	abstract void m3();
}

class Abstr extends Abst
{
	void m1(){System.out.println("good morning");}
	void m2(){System.out.println("good night");}
	void m3(){System.out.println("good evening");}
	
	public static void main(String[] args) 
	{
		Abstr a = new Abstr();
		a.m1();a.m2();a.m3();
		
		Abst aa = new Abstr();
		aa.m1();aa.m2();aa.m3();
		
	}
}
