package javaTrickyScenario;

public class CompareTwoIntNum {
	/*Compare two int numbers (integer caching)*/
	
	
	public static void main(String[] args) {
		Integer num1 = 100;
		Integer num2 = 100;
		
		if(num1==num2){
			System.out.println("both are equal");
		}else{
			System.out.println("both are not equal");
		}
		
		/*
		 * what do you mean by Integer caching?
		 * In the integer caching num1 and num2 they both are autobox so it will take the actual value of num1 and num2
		 * hence the == will return true over here, but it will return true only and only when you are giving a number 
		 * integer caching range is  -128 to 127.
		 * if you r giving the number within this particular range then only integer caching will happen. 
		 */
		
		Integer num3 = 190;
		Integer num4 = 190;
		
		if(num3==num4){
			System.out.println("both are equal");
		}else{
			System.out.println("both are not equal");
		}
		
		Integer num5 = 127;
		Integer num6 = 127;
		
		if(num5==num6){
			System.out.println("both are equal");
		}else{
			System.out.println("both are not equal");
		}
		
		
	}

}
