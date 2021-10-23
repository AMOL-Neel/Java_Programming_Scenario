package MapInterfac;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Test4 
{
	public static void main(String[] args) 
	{
		LinkedHashMap<Integer,Product> lhm = new LinkedHashMap<Integer,Product>();
		lhm.put(1, new Product(1, "pencil", 45.5f));
		lhm.put(2, new Product(2, "pen", 56.5f));
		lhm.put(3, new Product(3, "Mobile", 35.5f));
		lhm.put(4, new Product(4, "Chair", 78.5f));
		
		Set<Entry<Integer,Product>> p =lhm.entrySet();
		Iterator<Entry<Integer,Product>> itr= p.iterator();
		
		while(itr.hasNext())
		{
			Entry<Integer,Product> e =itr.next();
			Product p1 =e.getValue();
			if(p1.pid==1)
				itr.remove();
			if(p1.pname.equals("Mobile"))
				itr.remove();
		}
		
		for(Entry<Integer,Product> aa:lhm.entrySet())
		{
		    Product c=	aa.getValue();
		    System.out.println(c.pid+" "+c.pname+" "+c.pcost);
		}
		



	}

}
