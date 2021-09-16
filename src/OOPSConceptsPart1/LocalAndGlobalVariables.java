package OOPSConceptsPart1;

public class LocalAndGlobalVariables {

	String name = "Tom"; //Global variable -- class variable -- scope is in whole class
	int age = 25;
	
	public static void main(String[] args) {

		int i = 200;  // local variable for main method
		System.out.println("main methos local var:"+i);
		LocalAndGlobalVariables obj = new LocalAndGlobalVariables();
		System.out.println(obj.name);
		System.out.println(obj.age);
		
	}

	public void sum() {
		int i = 10; // local variable for sum method
		int j = 20;
	}
	
		
}
