package New;

import java.util.ArrayList;
import java.util.Arrays;

public class Test7 
{
	public static void main(String[] args) 
	{
		ArrayList<String> al= new ArrayList<String>();
		al.add("amol");
		al.add("ketan");
		al.add("rahul");
		System.out.println(al.toString());
		
		String[] str = new String[al.size()];
		al.toArray(str);
		for(String s1:str)
		{
			System.out.println(s1);
		}
		
		String[] str1 = {"aaa","bbb","ccc","ddd","eee","fff","ggg"};
		ArrayList<String> a2 = new ArrayList<String>(Arrays.asList(str1));
		System.out.println(a2.toString());
		
		ArrayList all = new ArrayList();
		all.add(152);
		all.add("kedar");
		all.add("sujit");
		System.out.println(all);
		System.out.println("conversion in array");
		Object[] o=all.toArray();
		for(Object oo:o)
		{
			System.out.println(oo);
		}
		
		
		
		
		}
	    
		
		
		
	}

