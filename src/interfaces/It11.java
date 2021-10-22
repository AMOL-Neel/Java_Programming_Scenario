package interfaces;

public interface It11 
{
	void m1();
}
interface It12
{
	void m2();
}
interface It13
{
	void m3();
}

class Test11 implements It11,It12,It13
{
	public void m1()
	{
		System.out.println("good");
	}
	public void m2()
	{
		System.out.println("better");
	}
	public void m3()
	{
		System.out.println("best");
	}
	public static void main(String[] args) 
	{
		Test11 t = new Test11();
		t.m1();t.m2();t.m3();
		
	}
}
