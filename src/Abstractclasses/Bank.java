package Abstractclasses;

public abstract class Bank 
{
    abstract int roi();
}

class AxisBank extends Bank
{
	int roi()
	{
		return 8;
	}
}
class Kotak extends Bank
{
	int roi()
	{
		return 12;
	}
}
class ICICI extends Bank
{
	int roi()
	{
		return 10;
	}
}

class Testt
{
	public static void main(String[] args) 
	{
		AxisBank a = new AxisBank();
		System.out.println("rate of interest is:"+a.roi());
		
		Kotak k = new Kotak();
		System.out.println("rate of interest is:"+k.roi());
		
		ICICI i = new ICICI();
		System.out.println("rate of interest is:"+i.roi());
	}
}