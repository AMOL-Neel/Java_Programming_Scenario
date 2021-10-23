package CloSir;

import java.util.ArrayList;

public class Test1 
{
	public static void main(String[] args) 
	{

		ArrayList<String> al = new ArrayList<String>();
		al.add("amol");
		al.add("ketan");
		al.add("saurabh");
		al.add("sandeep");
		System.out.println(al);
		
		ArrayList<String> str = (ArrayList<String>)al.clone();
		System.out.println(str);
	}

}
