package javaTrickyScenario;

import java.util.Arrays;
import java.util.OptionalDouble;

import com.google.common.math.DoubleMath;

/*Calculate average of array using :
 * simple loop 
 * java 8 and 
 * google Guava library*/

public class AverageArray {
	public static void main(String[] args) {
		int num[] = {1,2,3,4,5,6,7,8,9,10};
		
		// simple java
		double total = 0;
		for(int  e : num){
			total = total +e;
		}
		System.out.println("total : "+total);
		System.out.println("the average is :: "+(total/num.length));
		
		// java 8 : streams:
		OptionalDouble avg = Arrays.stream(num).average();
		System.out.println(avg.getAsDouble());
		
		// Google Guava : 
		double avg1 = DoubleMath.mean(num);
		System.out.println(avg1);
	}

}
