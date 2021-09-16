package OOPSConceptsPart1;

public class StaticAndNonStaticConcept {

	String name = "Tom";
	static int age = 20;
	public static void main(String[] args) {

		//How to cal static methods and variables
		//1. Direct call
		
		sum();
		//2. Calling by class name
		StaticAndNonStaticConcept.sum();
		
		System.out.println(age);
		System.out.println(StaticAndNonStaticConcept.age);
		
		//How to call non static variables and methods
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		obj.sendMail();
		System.out.println(obj.name);
		
		//Can I access static methods by using object reference ? ----> YES
		obj.sum(); // warning will be given
		System.out.println(obj.age);//warning will be given
		System.out.println(obj.name);
		
	}

	public void sendMail() {// non static method
		System.out.println("Send mail method");
	}
	public static void sum() {//static method
		System.out.println("sum method");
	}
}
