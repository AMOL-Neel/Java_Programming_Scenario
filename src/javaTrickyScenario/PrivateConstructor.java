package javaTrickyScenario;

/*how can we create objects if we make the constructor private?*/

public class PrivateConstructor {
	
	int age; 
	
	//static block
	static{
		PrivateConstructor obj1 = new PrivateConstructor();
	}
	
	//static method
	public static int creatObject(){
		PrivateConstructor obj = new PrivateConstructor();
		obj.age = 49;
		return obj.age;
	}
	
	//private constructor
    private PrivateConstructor(){
		age =30;
	}
    
    public static void main(String[] args) {
		PrivateConstructor obj = new PrivateConstructor();
		System.out.println(obj.age);
	}

}

class TestPriConstructor{
	public static void main(String[] args) {
//		PrivateConstructor obj = new PrivateConstructor();
//		System.out.println(obj.age);
		
		int i =PrivateConstructor.creatObject();
		System.out.println(i);
	
		
		
		
	
		
	}
}
