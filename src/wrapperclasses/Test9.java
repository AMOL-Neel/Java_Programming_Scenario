package wrapperclasses;

public class Test9 
{
	public static void main(String[] args) 
	{
		// autoboxing 
		Integer i = 10;
		Integer i1 = 10;
		
		// within the range values
		System.out.println(i==i1);
		System.out.println();
		System.out.println(i.equals(i1));
		System.out.println();
		
		// outside of the range values
		Integer i2 = 200;
		Integer i3 = 200;
		System.out.println(i2==i3);
		System.out.println();
		System.out.println(i2.equals(i3));
		
	}

}
