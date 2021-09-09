package OOPSConceptsPart1;

public class Car {

	int model;
	int wheel;

	
	public static void main(String[] args) {
		
		//new Car();-  this is the object of Car class
		//new keywor is used to create object class
		//a,b,c--- are object reference variables
		
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		
		c1.model = 2014;
		c1.wheel = 4;
		
		c2.model = 2019;
		c2.wheel = 4;
		
		c3.model = 2020;
		c3.wheel = 4;
		
		System.out.println(c1.model);
		System.out.println(c1.wheel);
		
		System.out.println(c2.model);
		System.out.println(c2.wheel);
		
		System.out.println(c3.model);
		System.out.println(c3.wheel);
		
		

	}

}
