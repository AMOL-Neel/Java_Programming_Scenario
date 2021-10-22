package interfaces;

public interface It61 
{
	void m1();
	void m2();
	void m3();
	void m4();
	void m5();
}
class E implements It61
{
	public void m1(){}
	public void m2(){}
	public void m3(){}
	public void m4(){}
	public void m5(){}
}
class F extends E
{
	public void m1()
	{
		System.out.println("amol babasaheb neel");
	}
	public void m2()
	{
		System.out.println("suyog babasaheb neel");
	}
	public void m3()
	{
		System.out.println("monika babasaheb neel");
	}
	public static void main(String[] args) 
	{
		F f = new F();
		f.m1();f.m2();f.m3();
		
	}
}
