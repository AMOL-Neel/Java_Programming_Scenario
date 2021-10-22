package Nested;

public class Outer4
{
	private int a= 10,b = 20;
	
	{
		System.out.println("outer class instance block");
	}
	static {
		System.out.println("outer class static block");
	}
	
	Outer4(){
		System.out.println("outer constructor");
	}
	class Inner4
	{
		final static int a=100,b=200;
		{
			System.out.println("inner class instance block");
		}
		Inner4()
		{
			System.out.println("inner class constructor");
		}
		void m1(int a, int b)
		{
			System.out.println(this.a+this.b);
			System.out.println(Outer4.this.a+Outer4.this.b);
			System.out.println(a+b);
		}
		
	}
	public static void main(String[] args) 
	{
		//new Outer4().m1();
		new Outer4().new Inner4().m1(1000, 2000);
		
	}

}
