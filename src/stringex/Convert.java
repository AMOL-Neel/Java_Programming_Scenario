package stringex;

public class Convert {
	public static void main(String[] args) {
		String str = "amol";
		System.out.println(str);
		System.out.println(str.toString());

		// conversion into string buffer
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb);
		System.out.println(sb.toString());

		// reverse sb
		StringBuffer sbr = sb.reverse();
		System.out.println(sbr);

		// again return in string 
		String strin =sbr.toString();
		System.out.println(strin);
	}

}
