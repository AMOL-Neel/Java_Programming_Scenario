package javaTrickyScenario;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharFromString {
	
	/*how to print duplicate characters from string?*/
	
	public static void main(String[] args) {
		printDuplicateCharacters("A");
		printDuplicateCharacters("");
		printDuplicateCharacters(null);
		printDuplicateCharacters("sagar");
		printDuplicateCharacters("aurangabad");
		printDuplicateCharacters("babasaheb");
		printDuplicateCharacters("AMOL BABASAHEB NEEL");
		
	}
	
	public static void printDuplicateCharacters(String str){
		if(str == null){
			System.out.println("NULL String");
			return;
		}
		
		if(str.isEmpty()){
			System.out.println("Empty String");
			return;
		}
		
		if(str.length() ==1){
			System.out.println("Single char String");
			return;
		}
		
		char words[]  = str.toCharArray();
		
		Map<Character, Integer> charMap = new HashMap<Character,Integer>();
		
		for(Character ch : words){
			if(charMap.containsKey(ch)){
				charMap.put(ch, charMap.get(ch)+1);
			}else{
				charMap.put(ch, 1);
			}
		}
		
		// print the map 
		Set<Map.Entry<Character,Integer>> entrySet =charMap.entrySet();
		
		for(Map.Entry<Character, Integer> entry : entrySet){
			if(entry.getValue()>1){
				System.out.println(entry.getKey()+" : "+entry.getValue());
			}
		}
		
	}

}
