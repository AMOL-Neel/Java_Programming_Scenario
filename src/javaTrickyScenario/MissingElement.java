package javaTrickyScenario;

/*Find out the missing element in an integer array?
 * 
 */

public class MissingElement {
	
	public static int findMissingNumber(int num[], int totalCount){
		int expSum = totalCount * (totalCount+1)/2;
		int actualSum = 0;
		
		for(int i : num){
			actualSum +=i;
		}
		
		return expSum-actualSum;
		
	}
	
	public static void main(String[] args) {
		
		int num[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,25,26,27,28,29,30};
		int n1 = findMissingNumber(num,30);
		System.out.println(n1);
		
	}

}
