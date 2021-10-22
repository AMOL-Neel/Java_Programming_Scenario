package interfaces;

public interface It51
{
	int a  =100,b=200;
	void m1();
}

class A51 implements It51
{
	public void m1()
	{
		System.out.println(a+b);
	}
	public static void main(String[] args) 
	{
		A51 a = new A51();
		a.m1();
		
	}
}
 