package collection_example_2;

public class Test4 implements Cloneable
{
	int a = 100, b= 200;
	public static void main(String[] args) throws CloneNotSupportedException  
	{
		Test4 t = new Test4();
		System.out.println(t.a);
		System.out.println(t.b);
		
		Test4 t1 =(Test4)t.clone();
		System.out.println(t1.a);
		System.out.println(t1.b);
		
	}
	

}
