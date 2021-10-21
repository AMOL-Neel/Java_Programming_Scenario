package javaTrickyScenario;

public class LongNumbers {
	/*
	 * what will be the output when you use a long number with L and without L
	 * Suffix?
	 */

	public static void main(String[] args) {
		long longNumberWithoutL = 1000 * 60 * 60 * 24 * 365;
		System.out.println(longNumberWithoutL);// this is a java calculatiion
		// 1471228928
		// 1010111101100010010110000000000 -- this is 32 bit
		// 1471228928
		// the max limit of 32 bit Integer: 2147483647

		// now with L
		long longNumberWithL = 1000 * 60 * 60 * 24 * 365l;
		System.out.println(longNumberWithL);// this is a jaa calculation with L suffix. 31536000000
		// do the normal calculations of 1000*60*60*24*365; = 31536000000
		// 11101010111101100010010110000000000 -- this is 36 bit
		
		/*through the calculator we were getting :31536000000
		 * without L we were getting : 1471228928(1010111101100010010110000000000)
		 * with L suffix we were getting :31536000000(11101010111101100010010110000000000)
		 * the max limit of 32 bit Integer: 2147483647
		 * Reason : 
		 * without l : 1471228928 and with L 31536000000 
		 * when we do with the java we getting without l result. because java will remove the first most significant bit. 
		 * because we are going out of the range. 
		 * the maximum limit of the 32 bit integer  java will remove 36-32 =4 digits from 36 bit binary numthen we are getting without l result.
		 * if you want to get exact number you have to put L suffix.  
		 *  */
		
		

	}

}
