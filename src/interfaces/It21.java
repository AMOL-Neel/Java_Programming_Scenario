package interfaces;

public interface It21
{
	void m1();
}
interface It22
{
	void m2();
}
interface It23
{
	void m3();
}
class Test21 
{
	void m4()
	{
		System.out.println("normal class m4 method");
	}
	static void m5()
	{
		System.out.println("normal class m5 method");
	}
}
class Test22 extends Test21
{
	void m6()
	{
		System.out.println("normal class m6 method");
	}
}
class Test23 extends Test22 implements It21,It22,It23
{
	public void m1(){System.out.println("m1 method of interface");}
	public void m2(){System.out.println("m2 method of interface");}
	public void m3(){System.out.println("m3 method of interface");}

	public static void main(String[] args) 
	{
		Test23 t = new Test23();
		t.m1();t.m2();t.m3();t.m4();t.m5();t.m6();
		
		
	}
}
