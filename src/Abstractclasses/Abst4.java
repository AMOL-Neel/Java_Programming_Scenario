package Abstractclasses;

public class Abst4
{
	Abst4(int a)
	{
		System.out.println("abstract class constructor");
	}
}
class Tested extends Abst4
{
	Tested()
	{
		super(10);
		System.out.println("normal class constructor");
	}
	public static void main(String[] args) 
	{
		Tested t = new Tested();
		
		
	}
}
