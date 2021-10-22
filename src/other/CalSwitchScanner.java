package other;

import java.util.Scanner;

public class CalSwitchScanner 
{
	public static void main(String[] args)
	{
		String yn;
		do
		{
			Scanner s = new Scanner(System.in);

			System.out.println("Enter first number:");
			int num1 = s.nextInt();
			System.out.println("Enter second number:");
			int num2 = s.nextInt();
			System.out.println("select symbol[+/-/*/%]");
			String symbol = s.next();
			int result;

			switch(symbol)
			{
			case "+": result= num1+num2;
			System.out.println("Addition is ="+result);
			break;

			case "-": result = num1-num2;
			System.out.println("substraction is ="+result);
			break;

			case "*": result = num1*num2;
			System.out.println("the multiplication is ="+result);
			break;

			case "%": result = num1%num2;
			System.out.println("the result is ="+result);
			break;

			default: System.out.println("invalid symbol");
			break;

			}
			System.out.println("do you want to continue (press Y for yes and n for N");
			yn=s.next();


		}while(yn.equals("y")||yn.equals("Y"));

	}


}
