package wrapperclasses;

public class Test10 
{
	public static void main(String[] args) 
	{
		// static factory method
		Integer i = Integer.valueOf(10);
		Runtime r = Runtime.getRuntime();
		
		// instance factory method 
		String s = "amol";
		String ss = s.concat("neel");
		
		//pattern factory method
		Integer i1 = Integer.valueOf(10);
		String str =i1.toString();
		
		System.out.println(i.toString());
		System.out.println(r.toString());
		System.out.println(s);
		System.out.println(ss);
		System.out.println(i1);
		System.out.println(str);
		
		
	}

}
