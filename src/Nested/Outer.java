package Nested;

public class Outer
{
	private int a=10,b= 20;
	void m1(){System.out.println("m1 method");}
	class Inner
	{
		int x=100,y=200;
		void m2(){System.out.println("m2 method");}
		void m3()
		{
			System.out.println("inner class m3 method.");
			System.out.println(a+b);
			System.out.println(x+y);
			this.m2();
			m1();
		}
	}

}

class Test
{
	public static void main(String[] args) 
	{
		Outer o = new Outer();
		o.m1();
		Outer.Inner i = o.new Inner();
		i.m2();i.m3();
		
	}
}
