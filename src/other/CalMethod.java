package other;

import java.util.Scanner;

public class CalMethod 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int a,b,c,selection;
		System.out.println("please enter any two digits:");
		a =s.nextInt();
		b=s.nextInt();
		System.out.println("make your selection");
		
		System.out.println("1.addition");

		System.out.println("2.substraction");

		System.out.println("3.division");
		
		System.out.println("4.multiplication");
		
		// picking use selections
		selection = s.nextInt();
		
		while(selection>4)
		{
			System.out.println("please enter the correct selection:");
			selection = s.nextInt();
		}
		Calculat cal = new Calculat();
		if(selection==1)
		{	
			c=cal.add(a, b);
			System.out.println("the result is ="+c);
			
		}else if(selection==2)
		{		
			c=cal.minus(a, b);
			System.out.println("the result is ="+c);

		}else if(selection==3)
		{
			c=cal.multi(a, b);
			System.out.println("the result is ="+c);

		}
		else if(selection==4)
		{
			c=cal.division(a, b);
			System.out.println("the result is ="+c);

		}
	}
}

class Calculat
{
	int add (int x, int y)
	{
		int z;
		z=x+y;
		return z;
	}
	
	int multi (int x, int y)
	{
		int z;
		z=x*y;
		return z;
	}
	
	int minus(int x, int y)
	{
		int z;
		z=x-y;
		return z;
	}
	
	int division(int x, int y)
	{
		int z;
		z=x/y;
		return z;
	}
}