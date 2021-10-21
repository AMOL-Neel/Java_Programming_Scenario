package javaTrickyScenario;

/*WAP to convert String to integer without using  Integer.parseInt(). mthod
 */

public class StringToInteger {
	public static int stringToInteger(String str) {
		int num = 0;
		int len = str.length();

		for (int i = 0; i < len; i++) {
			// formula :
			/* System.out.println((int)str.charAt(i)); */
			num = num * 10 + ((int) str.charAt(i) - 48);
		}
		return num;
	}
	
	public static int convertToInt(String str){
		if(str.length() ==1){
			return (int)str.charAt(0)-48;
		}
		char ch[] = str.toCharArray();
		int sum =0;
		int zeroAsc = (int)'0';
		for(int i =0;i<ch.length;i++){
			int asc = (int)ch[i];
			sum = sum*10+(asc-zeroAsc);
		}
		return sum;
	}

	public static void main(String[] args) {
		String str = "4";
		// 1.
		System.out.println(stringToInteger(str) + 10);
		// 2.
		System.out.println(convertToInt(str)+100);
		
	}

}
