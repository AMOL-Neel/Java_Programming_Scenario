package stringex;

public class Test0 
{
	public static void main(String[] args) 
	{
		String s = "    amol    ";
		
		
		// length()
		System.out.println(s.length());
		System.out.println();
		
		// trim().length()
		System.out.println(s.trim().length());
		System.out.println();
		
		//trim().substring()
		System.out.println(s.trim().substring(2));
		System.out.println();
		
		//trim().substring() startwith,endswith
		System.out.println(s.trim().substring(0, 3));
		System.out.println();
		
		//trim().substring(startwith,endswith).length()
		System.out.println(s.trim().substring(0,4).length());
		System.out.println();
		
		//length is variable to find out the length of the array
		int[] a = {10,20,30,40,50,60,70,80,90,100};
		System.out.println(a.length);
		
		// length() is the method to find out the length of the string
		String str = "india is my country";
		System.out.println(str.length());
		System.out.println(str.indexOf("country"));
		System.out.println();
		
		// split()
		String str1 = "java is a language";
		String[] ss =str1.split(" ");
		for(String sss:ss)
		{
			System.out.println(sss);
		}

		
		
	}

}
