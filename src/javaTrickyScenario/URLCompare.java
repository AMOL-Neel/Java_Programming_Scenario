package javaTrickyScenario;

import java.net.MalformedURLException;
import java.net.URL;

/*what will be the output when you compare site URL with its ip address?*/

public class URLCompare {

	public static void main(String[] args) {
		try {
			System.out.println("for app.hubspot.com::"+ new URL("https://app.hubspot.com").equals(new URL("https://104.19.154.83")));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			System.out.println("for flipkart.com :: "+new URL("https://www.flipkart.com/").equals("https://163.53.78.87"));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
