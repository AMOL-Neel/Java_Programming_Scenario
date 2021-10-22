package interfaces;

public class M implements Cloneable
{
	int a = 10;
	int b = 20;
	public static void main(String[] args) throws CloneNotSupportedException 
	{
		M m = new M();
		System.out.println(m.a);
		System.out.println(m.b);
		m.a= 100;
		m.b=200;
		System.out.println(m.a); 
		System.out.println(m.b);
        M m1 = (M)m.clone();
		m1.a=1000;
		m1.b = 2000;
		System.out.println(m1.a);
		System.out.println(m1.b);
		
		
	}
	

}
