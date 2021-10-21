package javaTrickyScenario;

/*what will the output when you print this?
 * (byte)+(char)-(int)+(long)-1?
 * 
 * */
public class TestCode {
	public static void main(String[] args) {
		int i =(byte)+(char)-(int)+(long)-1;
		System.out.println(i);
		
		int j = (int)+(long)-1;
		System.out.println(j);
		
		int m = (char)1;
		System.out.println(1);
		
		int n = (byte)1;
		System.out.println(n);
		
		int k = (byte)1;
		System.out.println(k);
		
		int l = (char)1;
		System.out.println(l);
	}
	

}
