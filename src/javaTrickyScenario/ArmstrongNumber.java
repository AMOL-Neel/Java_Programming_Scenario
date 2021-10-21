package javaTrickyScenario;

/*check given number is an armstrong number
 * narcissistic number
 * pluperfect digital invariant : (PPDI) Number
 * plus perfect number
 * 
 * Defination ::power of have to calculate should be on the basis of the digits and 
 * then you have to get the power of each and every digit calculated 
 * and then if the number is same of the given number then it's a given number. 
 * */

public class ArmstrongNumber {

	public static boolean isArmStrongNumber(int num) {

		if (num < 0) {
			return false;
		}
		if (num >= 0 && num <= 9) {
			return true;
		}

		int power = power(num);
		int copyNum = num;
		int sum = 0;
		while (copyNum != 0) {
			int lastDigit = copyNum % 10;
			 int factor = 1;
			 for (int i = 0; i < power; i++) {
			 factor = factor * lastDigit;
			 }
			 sum = sum + factor;

			/* by using Math.power function inBuilt function 
			sum = (int) (sum + Math.pow(lastDigit, power));*/
			
			
			copyNum = copyNum / 10;
		}
		if (sum == num) {
			return true;
		}
		return false;
	}

	// find power number
	private static int power(int num) {
		int n = 0;
		while (num != 0) {
			n++;
			num = num / 10;
		}
		return n;
	}

	public static void main(String[] args) {
		System.out.println(isArmStrongNumber(153));
		System.out.println(isArmStrongNumber(15313213));
		System.out.println(isArmStrongNumber(1));
		System.out.println(isArmStrongNumber(2));
		System.out.println(isArmStrongNumber(0));
		System.out.println(isArmStrongNumber(-153));
		System.out.println(isArmStrongNumber(9474));
		System.out.println(isArmStrongNumber(54748));
	}

}
