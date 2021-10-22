package wrapperclasses;

public class Test1 
{
	// conversion into wrapper object to primitive data 
	public static void main(String[] args) 
	{
		Integer i = new Integer(100);
		
		int i1 =i.intValue();
		float f =i.floatValue();
		double d= i.doubleValue();
		long l =i.longValue();
		short s =i.shortValue();
		
		System.out.println(i1);
		System.out.println(f);
		System.out.println(d);
		System.out.println(l);
		System.out.println(s);	
		
	}
}


