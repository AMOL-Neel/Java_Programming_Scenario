package interfaces;

public interface It52 
{
	int a = 200;
	void m1();
}
interface It53
{
	int a = 300;
	void m1();
}
class D implements It52, It53
{
	public void m1()
	{
		//System.out.println(a+a); the field a is ambigious. 
		System.out.println(It52.a+It53.a);
	}
	public static void main(String[] args) 
	{
		D d = new D();
		d.m1();
		
	}
}
