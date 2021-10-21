package javaTrickyScenario;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/*
 * Generate Random Number in Java
 * 1. Random class
 * 2. Math.random();
 * 3. ThreadLocalRandom
 * 
 * Use Cases : Random Number in Email : 
 * phone number ect.
*/


public class GenerateRandomNumber {
	
	public static void main(String[] args) {
		
		// Math.random() method
		// it will give you only double data type result
 		for(int i =1; i<=3; i++){
			System.out.println(Math.random());
		}
 		System.out.println("-----------");
 		
 		// Random class 
 		Random random = new Random();
 		for(int i =1; i<3 ;i++){
 			System.out.println(random.nextInt());
 			System.out.println(random.nextBoolean());
 			System.out.println(random.nextDouble());
 			System.out.println(random.nextFloat());
 			System.out.println(random.nextLong());
 		}
 		
 		System.out.println("-----------");
 		
 		// ThreadLocalRandom class 
 		
 		for(int i =1;i<4;i++){
 			System.out.println(ThreadLocalRandom.current().nextInt());
 		}
 		
 		
 		System.out.println("-----in between specific range-----");
 		// Generat number in between specific range
 		
 		for(int i =1;i<4;i++){
 			// by using Random class Reference
 			System.out.println(random.nextInt(20));
 			
 			// by using Math.random() method
 			System.out.println((int)(Math.random()*10));
 			
 			// by using Thread local random method
 			System.out.println(ThreadLocalRandom.current().nextInt(0, 45));
 		}
 		
 		
 		

	}
}
