package OOPSConceptsPart1;

public class MethodOverloading {

	public static void main(String[] args) {

		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(10, 20);
	}

	public static void main(int p) {
		
	}
	public static void main(int p, int q) {
		
	}
	
	
	//IMP points
	
	//We can overload main method also
	
	//You can not create method inside the method
	//duplicate method: i.e Same method name with same no of parameters/ same type of parameters are not allowed
	
	
	//Method Overloading: --> when the method name is same with diff parameter/ arguments within same class
	public void sum() {// o input para
		System.out.println("Zero parameters-------------");
	}
	
	public void sum(double d) {
		System.out.println("method with same no of parameters but diff data type-----");
	}
	
	public void sum(int i) {// 1 input para
		System.out.println("1 parameter---------------");
		System.out.println(i);
	}
	public void sum(int i, int j) {//2 input para
		System.out.println("2 parameters-----------");
		System.out.println(i+j);
	}
}
