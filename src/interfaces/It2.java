package interfaces;

public interface It2 
{
	void m1();
	void m2();
	void m3();
}
abstract class Test0 implements It2
{
	public void m1()
	{
		System.out.println("good morning");
	}
}
abstract class Test1 extends Test0
{
	public void m2()
	{
		System.out.println("good evening");
	}
}

class Test2 extends Test1
{
	public void m3()
	{
		System.out.println("good night");
	}
	public static void main(String[] args) 
	{
		Test2 t = new Test2();
		t.m1();t.m2();t.m3();
		System.out.println();
		It2 i = new Test2();
		i.m1();i.m2();i.m3();
		
	}
	
}