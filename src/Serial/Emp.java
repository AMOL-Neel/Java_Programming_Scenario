package Serial;

import java.io.Serializable;

public class Emp  implements Serializable
{ 
	int id;
	String name;
	transient String pass;
	transient int pnumber;
	
	
	Emp(int id, String name, String pass, int pnumber)
	{
		this.id = id;
		this.name = name;
		this.pass = pass;
		this.pnumber = pnumber;
		
	}

}
