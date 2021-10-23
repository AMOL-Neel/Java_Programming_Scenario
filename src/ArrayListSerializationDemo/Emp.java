package ArrayListSerializationDemo;

import java.io.Serializable;

public class Emp implements Serializable
{
	int id; 
	String name; 
	transient float salary;
	
	Emp(int id, String name,float salary)
	{
		this.id= id;
		this.name = name;
		this.salary = salary;
		
	}

}
