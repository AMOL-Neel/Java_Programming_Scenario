package interfaces;

public interface It3 
{
	void m1();
}
interface It4 extends It3
{
	void m2();
}
interface It5 extends It4
{
	void m3();
}
class Test001 implements It5
{
	public void m1()
	{
		System.out.println("amol");
	}
	public void m2()
	{
		System.out.println("babasaheb");
	}
	public void m3()
	{
		System.out.println("neel");
	}
	public static void main(String[] args) 
	{
		Test001 t = new Test001();
		t.m1(); t.m2(); t.m3();
		
	}
}
