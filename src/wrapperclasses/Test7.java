package wrapperclasses;

public class Test7 
{
	public static void main(String[] args) 
	{
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		Float f1 = new Float(23.5f);
		Float f2 = new Float(23.5f);
		
		System.out.println(i1==i2);
		System.out.println();
		System.out.println(i1.equals(i2));
		System.out.println();
		System.out.println(f1==f2);
		System.out.println();
		System.out.println(f1.equals(f2));
		
		Integer i3 = new Integer(90);
		Integer i4 = Integer.valueOf(90);
		System.out.println(i3==i4);
		System.out.println();
		System.out.println(i3.equals(i4));
	}

}
