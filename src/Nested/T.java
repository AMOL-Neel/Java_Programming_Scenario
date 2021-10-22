package Nested;

public abstract class T 
{
	abstract void m1();
	abstract void m2();
}

/*class U extends T
{
	void m1(){}
	void m2(){}
}*/

class W
{
	T t = new T()			
	{
		void m1(){System.out.println("aurangabad");}
		void m2(){System.out.println("pune");}

	};
	public static void main(String[] args) 
	{
		W w = new W();
		w.t.m1(); w.t.m2();
	}
}
