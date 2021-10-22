package stringex;

public class Test {
	public static void main(String[] args) {
		String s = "amol";
		System.out.println(s);

		String s1 = new String("amol");
		System.out.println(s1);

		char[] ch = { 'a', 'm', 'o', 'l' };
		String s2 = new String(ch);
		System.out.println(s2);

		String s4 = new String(ch, 1, 3);
		System.out.println(s4);

		byte[] b = { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89,
				90 };
		String s3 = new String(b);
		System.out.println(s3);

		String s5 = new String(b, 1, 25);
		System.out.println(s5);

		byte[] b1 = { 65, 77, 79, 76 };
		String s6 = new String(b1);
		System.out.println(s6);

		byte[] b2 = { 83, 65, 77, 69, 69, 82 };
		String s7 = new String(b2);
		System.out.println(s7);

		byte[] b3 = { 83, 85, 89, 79, 71 };
		String s8 = new String(b3);
		System.out.println(s8);

		byte[] b4 = { 77, 79, 78, 73, 75, 65 };
		String s9 = new String(b4);
		System.out.println(s9);

		byte[] b5 = { 90, 49, 61, 22, 97 };
		String str = new String(b5);
		System.out.println(str);

		byte[] b6 = { 99, 23, 29, 63, 18 };
		String str1 = new String(b6);
		System.out.println(str1);
 
		byte[] b7 = { 85, 54, 84, 55, 46 };
		String str2 = new String(b7);
		System.out.println(str2);

		byte[] b8 = { 97, 67, 42, 51, 86 };
		String str3 = new String(b8);
		System.out.println(str3);

		byte[] b9 = {83,79,78,65,76};
		String str4 = new String(b9);
		System.out.println(str4);

	}

}
