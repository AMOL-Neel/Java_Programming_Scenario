package javaTrickyScenario;

public class DivideByZero {
/*
*what will be the out put when you divide a number by zero?
*Number == Integer, Double, float
*
*/
	public static void main(String[] args) {
		System.out.println(9.0/0);//infinity
		System.out.println(12.33f /0);//infinity
		System.out.println(10/0.0);//infinity
		System.out.println(19.99999d/0);//infinity
		System.out.println(0.0/0);//NaN
		System.out.println(0.0/0.0);//NaN
		System.out.println(12.33/0.0);//infinity
	}

}
