package Nested;

public abstract class Anon 
{
	abstract void m1();
}

class Test6 
{
	public static void main(String[] args) 
	{
		Anon a = new Anon()
		{
	void m1()
	{
		System.out.println("good morning");
	}
		};
		a.m1();
		
	}
}
