package javaTrickyScenario;

import java.io.IOException;

// how to launch external application by using java (notepad, Browser, Vlc Media Player)

public class LaunchExtApp {
	public static void main(String[] args) throws IOException, InterruptedException {
		Runtime runTime = Runtime.getRuntime();
		
		// this will launch notepad only.
		//Process pr = runTime.exec("notepad.exe");
		
		// if specific .txt file we want to open then use below code
		Process pr = runTime.exec("notepad.exe C:\\Users\\hp\\OneDrive\\Desktop\\To_do.txt");
		Thread.sleep(4000);
		pr.destroy();
		Thread.sleep(4000);
		
		// google chrome launching
		String s[] = new String[]{"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe","https://amazon.com"};
		runTime.exec(s);
		
		// mp3 player launching
		String st[] = new String[]{"C:\\Program Files (x86)\\Windows Media Player\\wmplayer.exe","E:\\songs\\Audio Songs\\Melanie_Martinez_-_Play_Date_(Official_Audio)(256k).mp3"};
		Process pr1 = runTime.exec(st);
		Thread.sleep(30000);
		pr1.destroy();
	}
	

}
