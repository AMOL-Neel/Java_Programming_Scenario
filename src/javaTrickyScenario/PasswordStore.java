package javaTrickyScenario;

import java.util.Arrays;

/*Why password should be stored in char array char[] instead of string?
 */

public class PasswordStore {
	public static void main(String[] args) {
		String pwd = "Amol@123";
		System.out.println("the password is ::"+pwd);
		
		char ch[] = new char[]{'A','m','o','l','@','1','2','3'};
		System.out.println("the password is ::"+ch);
		
		Arrays.fill(ch, '*');
		
		for(int i =0;i<ch.length;i++){
			System.out.print(ch[i]);
		}
	}

}
