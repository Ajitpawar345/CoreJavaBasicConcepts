package BasicConcepts;

public class StringConcatenation {

	public static void main(String[] args) {
		// + is concatenation operator
		// println - is used to print on new line
		//print-  just used to print on console
		int a = 100;
		int b = 200;
		
		double c = 12.33;
		double d = 10.33;
		
		String x="Hello";
		String y = "World";
		
		System.out.println(a+b);
		System.out.println(x+y);
		
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		
		System.out.println(x+y+(a+b));
		System.out.println(a+b+x+y+a+x+b+y);
		
		System.out.println(a+b+x+y+a+b);
		System.out.println(x+y+c+d);
		
		System.out.println("hello");
		System.out.println("The value of A is:"+a);
		
		System.out.println("The value of B is:"+x);
		System.out.println("The addition of a and b Is:"+(a+b));
		
		System.out.print("Hello");
		System.out.println("World");
		
	}
	

}
