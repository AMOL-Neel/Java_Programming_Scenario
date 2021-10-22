package collection_example;

import java.util.ArrayList;

public class Sublist
{
	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("amol");
		al.add("sujit");
		al.add("suyog");
		al.add("ketan");
		al.add("sameer");
		al.add("gitesh");
		al.add("sagar");
		al.add("sahadev");
		al.add("bhushan");
		al.add("devanand");
		al.add("sonu_dada");
		System.out.println(al.size());
		System.out.println();
		
		ArrayList<String> all = new ArrayList<String>(al.subList(1, 4));
		System.out.println(all);
		
	}

}
