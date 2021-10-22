package wrapperclasses;

public class Test6 
{
	public static void main(String[] args)
	{
		Test6 t = new Test6();
		System.out.println(t);
		System.out.println(t.toString());
		System.out.println();
	    String str1 =t.toString();
	    System.out.println(str1);
	    System.out.println();
	
		
		String str = "amol";
		System.out.println(str.toString());
		
		// wrapper classes
		Integer i = Integer.valueOf(100);
		System.out.println(i);
		System.out.println(i.toString());
		
		// 
		Integer i1 = Integer.valueOf(100);
		String str2 =i1.toString();
		System.out.println(str1);
		System.out.println(i1);
		
	}

}
