package OOPSConceptsPart1;


public class FunctionsInJava {

	
	//main method --> starting point of execution
	public static void main(String[] args) {
		//one object will be created, f is the refering variable,  refering to this object
		//after creating object, copy of all the non static method is given to this object
		
		
		
		FunctionsInJava f = new FunctionsInJava();
		
		f.noRetuenMethod();
		
		int m = f.returnIntMethod();
		System.out.println(m);
		
		int mul = f.multiplication(10, 20);
		System.out.println(mul);
		
		
		
		//main method is void------> never returns a value
	}
	
	
	//Non- static methods 
	
	
	//void return type- does not return value
	public void noRetuenMethod() {
		System.out.println("This method not returning anything");
	}
	
	
	// returns int value
	public int returnIntMethod() {
		System.out.println("This method returning int value");
		int a = 10;
		int b = 20;
		int c = a+b;
		
		return c;
	}
	
	
	//returns string value
	public String returnStringMethod(){
		System.out.println("This methos returns string value");
		String s =  "This is my Stirng method";
				
		return s;
	}
	
	//return type---> int
	// x,y-----> input parameters/arguments
	public int multiplication(int x, int y) {
		System.out.println("This method has received value from parameter---> Multiplication");
		
		int p = x*y;
		
		return p;
		
	}
}
