package stringex;

public class Test7 {
	public static void main(String[] args) {
		String str = "amol";
		String str1 = "neel";
		String str2 = "amol";
		System.out.println(str.equals(str1));
		System.out.println(str.equals(str2));
		System.out.println(str1.equals(str2));
		System.out.println(str.equals("AMOL"));
		System.out.println(str.equalsIgnoreCase("AMOL"));
		System.out.println();

		// compateTo()
		String s = "amol";
		String s1 = "neel";
		String s2 = "amol";

		System.out.println(s.compareTo(s1));
		System.out.println(s.compareTo(s2));
		System.out.println(s1.compareTo(s2));
		System.out.println();
		System.out.println(s.compareTo("AMOL"));
		System.out.println(s.compareToIgnoreCase("AMOL"));
		System.out.println();
	}

}
