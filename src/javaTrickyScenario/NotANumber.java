package javaTrickyScenario;

public class NotANumber {
	/*what is NaN-Not a Number?
	 * it is undefined number.
	 * whenever you are performing any floating operations like % the square root of the negative number or divide by 0.0
	 * in this case  you will always get NaN.
	 */
	
	public static void main(String[] args) {
		System.out.println(2/0.0);
		System.out.println(0.0/0.0);
		System.out.println(Math.sqrt(-1));
		
		System.out.println(Float.NaN ==Float.NaN);//false
		System.out.println(Float.NaN != Float.NaN);//true
		
		double nan = 2.1%0;
		System.out.println((2.1 % 0) == nan);//false
		System.out.println(nan == nan);//false
	}

}
