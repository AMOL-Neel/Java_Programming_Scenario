package other;

public class Calculatorswitch
{
	public static void main(String[] args)
	{
		int num1= 10, num2=20, result;
		String symbol = "%";
		
		switch(symbol)
		{
		case "+" : result = num1=num2;
		System.out.println(result);
		break;
		
		case "-" : result = num2-num1;
		System.out.println(result);
		break;
		
		case "*" : result = num1*num2;
		System.out.println(result);
		break;
		
		case "%" : result = num2/num1;
		System.out.println(result);
		break;
		
		default : System.out.println("invalid symbol");
		break;
		
		
		}
		
	}

}
