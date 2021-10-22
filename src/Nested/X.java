package Nested;

public class X 
{
	void m1(){}
	void m2(){}
	void m3(){}
}

class Y extends X
{
	X x = new X()
	{
		void m1(){System.out.println("mumbai");}
		void m2(){System.out.println("aurangabad");}
		void m3(){System.out.println("kannad");}

	};
	public static void main(String[] args) 
	{
		Y y = new Y();
		y.x.m1(); y.x.m2(); y.x.m3();
	}
}

