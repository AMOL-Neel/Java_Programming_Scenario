package Basics;

public class MaiMethod
{
	void m1()
	{
		System.out.println("m1 method");
	}
	
	// main method
	public static void main(String[] args) 
	{
		MaiMethod m = new MaiMethod();
		m.m1();
		
	}

}

class MaiMethod01
{
	void m1()
	{
		System.out.println("m1 method");
	}
	
	// main method
    static public void main(String[] args) 
	{
		MaiMethod01 m = new MaiMethod01();
		m.m1();
		
	}
	
}

class MaiMethod02
{
	void m1()
	{
		System.out.println("m1 method");
	}
	
	// main method
	public static void main(String  []args) 
	{
		MaiMethod02 m = new MaiMethod02();
		m.m1();
		
	}  
}

class MaiMethod03
{
	void m1()
	{
		System.out.println("m1 method");
	}
	
	// main method
	public static void main(String args[]) 
	{
		MaiMethod03 m = new MaiMethod03();
		m.m1();
		
	}
}

class MaiMethod04
{
	void m1()
	{
		System.out.println("m1 method");
	}
	
	// main method
	public static final void main(String[] args) 
	{
		MaiMethod04 m = new MaiMethod04();
		m.m1();
		
	}
}

class MaiMethod05
{
	void m1()
	{
		System.out.println("m1 method");
	}
	
	// main method
	public static void main(String... args) 
	{
		MaiMethod05 m = new MaiMethod05();
		m.m1();
		
	}
}

class MaiMethod06
{
	void m1()
	{
		System.out.println("m1 method");
	}
	
	// main method
	public static void main(String... amol) 
	{
		MaiMethod06 m = new MaiMethod06();
		m.m1();
		
	}
}

class MaiMethod07
{
	void m1()
	{
		System.out.println("m1 method");
	}
	
	// main method
	public static final strictfp synchronized void main(String[] args) 
	{
		MaiMethod07 m = new MaiMethod07();
		m.m1();
		
	}
}

class MaiMethod08 
{
	void m1()
	{
		System.out.println("m1 method");
	}
	
	// main method
	public static void main(String amol[]) 
	{
		MaiMethod08 m = new MaiMethod08();
		m.m1();
		
	}
}

class Parent 
{
	public static void main(String[] args) 
	{
		System.out.println("parent class main method");
	}
}

class Child extends Parent
{
	
}

class MaiMethod09
{
	void m1()
	{
		System.out.println("m1 method");
	}
	
	public static void main(String[] args) 
	{
		main(90);
		MaiMethod09 m = new MaiMethod09();
		m.m1();
		
	}
	
	public static void main (int a)
	{
		main('d');
		System.out.println("int main method"+a);
	}
	
	public static void main (char ch)
	{
		System.out.println("char main method"+ch);
	}
	
}





