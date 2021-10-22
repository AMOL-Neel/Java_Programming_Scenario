package collection_example_2;

import java.io.Serializable;

public class Emp implements Serializable
{
	transient int id;
	transient String name;
	
	Emp(int id,String name)
	{
		this.id = id;
		this.name = name;
	}

}
