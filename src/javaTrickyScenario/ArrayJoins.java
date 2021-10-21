package javaTrickyScenario;

import java.util.Arrays;
import java.util.stream.Stream;

import com.google.common.collect.ObjectArrays;
import com.google.common.primitives.Ints;

/*join two arrays using java 8 and google guava library*/

public class ArrayJoins {
	public static void main(String[] args) {
		String[] names = { "amol", "suyog", "vinod", "ganesh", "dipak", "vishal", "vijay" };
		String[] city = { "pune", "aurangabad", "usmanabad", "hasta", "AURANGABAD", "pishor", "kannad" };
		
		// java streams technique
		
		Stream<String> sNames = Arrays.stream(names);
		Stream<String> sCity = Arrays.stream(city);
		
		String fullInfo[]  = Stream.concat(sNames, sCity).toArray(size -> new String[size]);
		
		for(String s : fullInfo){
			System.out.println(s);
		}
		
		System.out.println("__________________");
		// google Guava :
		String allInfo[] = ObjectArrays.concat(names, city, String.class);
		
		for(String s : allInfo){
			System.out.println(s);
		}
		
		System.out.println("__________________");
		// for primitives and arrays :
		
		int p1[]  = {1,2,3,4,5,6,7,8,9,10};
		int p2[]  = {11,12,13,14,15,16,17,18,19,20};
		
		int p3[] =Ints.concat(p1,p2);
		
		for(int i : p3){
			System.out.println(i);
		}
	}
}
