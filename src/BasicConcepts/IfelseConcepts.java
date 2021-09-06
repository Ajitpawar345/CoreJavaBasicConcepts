package BasicConcepts;

public class IfelseConcepts {

	public static void main(String[] args) {
		
		int a = 50;
		int b = 20;
		
		if(a>b) {
			System.out.println("a is greater than b");
		}
		else {
			System.out.println("b is greater than a");
		}
		
		//comparison operators
		// <  >  >=  <=  == !=
		
		int c = 100;
		int d = 10;
		
		
		if(c==d) {
			System.out.println("c and d are equal");
		}
		else {
			System.out.println("c and d are not equal");
		}
		
		
		//Write a logic to find out highest number
		
		int a1 = 100;
		int b1 = 200;
		int c1 = 300;
		
		//nested if else
		if(a1>b1 & a1>c1) {//true & true = true
			System.out.println("a1 is greater");
		}
		else if(b1>c1) {
			System.out.println("b1 is greater");
		}
		else {
			System.out.println("c1 is greater");
		}
	}

}
