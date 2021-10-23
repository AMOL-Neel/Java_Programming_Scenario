package CloSir;

public class Test implements Cloneable
{
	int a = 10;
	int b = 20;
	int c = 30;
	
	public static void main(String[] args) throws Exception 
    {
		Test  t= new Test();
		System.out.println(t.a);
		System.out.println(t.b);
		System.out.println(t.c);
		
		 Test t1 =(Test)t.clone();
		 t1.a=45;
		 t1.b=55;
		 t1.c =66;
		 
		 System.out.println(t1.a);
		 System.out.println(t1.b);
		 System.out.println(t1.c);
		
	}
	

}
