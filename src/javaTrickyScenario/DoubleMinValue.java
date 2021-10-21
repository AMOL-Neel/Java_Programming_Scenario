package javaTrickyScenario;

/*what is the value of double MIN_Value?
 *which one is bigger --> double MIN_Value or 0.0d?
 *which one is bigger --> double MIN_Value or NEGATIVE_Infinity?
 */

public class DoubleMinValue {
	public static void main(String[] args) {

		System.out.println(Double.MIN_VALUE); // 4.9E-324 is a +ve Number.
		System.out.println(Long.MIN_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Float.MIN_VALUE);

		System.out.println(Math.min(Double.MIN_VALUE, 0.0d));
		System.out.println(Math.max(Double.MIN_VALUE, 0.0d));

		System.out.println(Math.max(Float.MIN_VALUE, 0.0f));

		System.out.println(Math.min(Double.MIN_VALUE, Double.NEGATIVE_INFINITY));
		
		System.out.println(Math.multiplyExact(10, 10));
		System.out.println(Math.decrementExact(10));
		System.out.println(Math.sqrt(225d));

	}

}
