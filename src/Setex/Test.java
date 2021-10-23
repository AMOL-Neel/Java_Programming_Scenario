package Setex;

import java.util.HashSet;

public class Test
{
	public static void main(String[] args) 
	{
		HashSet<String> hs =  new HashSet<String>();

		hs.add("amol");
		hs.add("ketan");
		hs.add("kedar");
		hs.add("sagar");
		hs.add("amol");
		hs.add("ram");
		hs.add("sujit");
		hs.add("pranav");
		System.out.println(hs);
		
		HashSet<String> hs1 = new HashSet<String>();
		System.out.println(hs1.add("amol"));
		System.out.println(hs1.add("amol"));
		System.out.println(hs1);
		
	}
	

}
