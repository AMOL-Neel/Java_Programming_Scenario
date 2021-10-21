package javaTrickyScenario;

public class PrintHelloWorldWithoutUsingSemicolan {
	public static void main(String[] args) {
		/*print hello world without using Semi colon (;)*/
		//System.out.println("hello world");
		
		// first way
		if(System.out.printf("hello World"+"\n")==null){
		}
		
		// second way
		if(System.out.append("hello World"+"\n")==null){
		}
		
		//third way
		if(System.out.append("hello World"+"\n").equals(null)){
		}
		
		//fourth way
		for(int i =0;i<1;System.out.println("hello World")){
			i++;
		}
	}

}
