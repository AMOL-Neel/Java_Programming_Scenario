package javaTrickyScenario;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*count total chars, words and lines in a given file
 * 
 */

public class FileContentCount {
	
	static String path = "C:\\Users\\hp\\OneDrive\\Desktop\\MaxWordCount.txt";
	public static void main(String[] args) {
		int charCount = 0;
		int wordCount = 0;
		int lineCount = 0;
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(path));
			
			String currentLine =reader.readLine();
			
			while(currentLine != null){
				lineCount++;
				// words:
				String words[] =currentLine.split(" ");
				wordCount = wordCount+ words.length;
				
				// line :
				for(String word : words){
					charCount = charCount +word.length();
				}
				currentLine = reader.readLine();
			}
			
			System.out.println("total lines ::"+ lineCount);
			System.out.println("total words ::"+ wordCount);
			System.out.println("total chars ::"+charCount);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	

}
