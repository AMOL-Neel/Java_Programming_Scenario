package stringex;

public class Test1 
{
	public static void main(String[] args) 
	{
		String s = new String("amol");
		String s1 = new String("amol");
		String s2 = new String("babasaheb");
		String s3 = new String("babasaheb neel");
		String s4 = new String("amol babasaheb neel");
		String s5 = new String("amol babasaheb neel");
		
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		
		System.out.println();
		
		System.out.println(s==s1);
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s3==s4);
		System.out.println(s4==s5);
		
		
		String str = "amol";
		String str1 = "amol";
		String str2 = "amol babasaheb";
		String str3 = "amol babasaheb neel";
		String str4 = "amol neel";
		String str5  = "amol neel";
		
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		System.out.println();
		
		System.out.println(str==str1);
		System.out.println(str1==str2);
		System.out.println(str2==str3);
		System.out.println(str3==str4);
		System.out.println(str4== str5);
		System.out.println();
		
		// StringBuffer
		StringBuffer sb = new StringBuffer("amol");
		StringBuffer sb1 = new StringBuffer("amol");
		StringBuffer sb2 = new StringBuffer("babasaheb");
		StringBuffer sb3 = new StringBuffer("neel");
		
		System.out.println(sb);
		System.out.println(sb1);
		System.out.println(sb2);
		System.out.println(sb3);
		System.out.println(sb1+" "+sb2+" "+sb3);
		System.out.println();
		
		System.out.println(sb==sb1);
		System.out.println(sb1==sb2);
		System.out.println(sb2==sb3);
		
		
		
		
	}

}
