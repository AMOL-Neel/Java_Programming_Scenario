package interfaces;

public interface It04 
{
	void m1();
}
interface It7 
{
	void m2();
}
interface It8 extends It04,It7
{
	void m3();
}
class Test02 implements It8
{
	public void m1()
	{
		System.out.println("suyog");
	}
	public void m2()
	{
		System.out.println("babasaaheb ");
	}
	public void m3()
	{
		System.out.println("neel");
	}
	public static void main(String[] args) 
	{ 
		Test02 t = new Test02();
		t.m1(); t.m2(); t.m3();
		
	}
}
