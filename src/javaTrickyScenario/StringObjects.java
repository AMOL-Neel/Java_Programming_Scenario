package javaTrickyScenario;

public class StringObjects {
	public static void main(String[] args) {
		/*how many String objects will be created?
		 */
		
		String s1 = "hello world";
		String s2 = "hello world";
		String s3 = s1;
		
		String n1 = new String("hello world");
		String n2 = new String("hello world");
		
		System.out.println(s1 == s2);
		System.out.println(s2 == s3);
		System.out.println(s1 == s3);
		
		System.out.println(n1 == n2);
		System.out.println(s1 == n2);
		
		
		// in this program there will 3 object will created.
		
	}

}
