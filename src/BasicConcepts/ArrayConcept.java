package BasicConcepts;

public class ArrayConcept {

	public static void main(String[] args) {
		
		//Array: to store simillar data type values in a array variable
		
		//Dis-adv of array
		//1. size is fixed: static array--- to overcome this prob---- we use collections-- ArrayList, HashTable---- Use dynamic array
		//2. Store only simillar data types elements--- to overcome this prob---- we use Object array.
		
		// 1. Integer Array : 
		//lowest bound/index: 0
		//upper bound/index: n-1/(n is size if array)
		//One dimentional array

		int a[] = new int[4];
		
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		
		//System.out.println(a[4]);  //ArrayIndexOutOfBoundException
			
		
		//to print all the values of array use for loop
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println("********************************");
		
		//2. double array:
		
		double d[] = new double[3];
		d[0] = 10.25;
		d[1] = 30.26;
		d[2] = 60.15;
		
		System.out.println(d.length);  //size/length of array
		System.out.println(d[2]);
		
		System.out.println("********************************");
		
		//3. Char array:
		
		char c[] = new char[3];
		c[0] = 'd';
		c[1] = 'E';
		c[2] = '#';
		
		System.out.println(c[2]);
		
		System.out.println("********************************");
		
		//4. boolean array
		boolean b[] = new boolean[2];
		b[0] = true;
		b[1] = false;
		
		System.out.println("********************************");
		
		//5. String array: 
		
		String s[] = new String[3];
		s[0] = "Array";
		s[1] = "Program";
		s[2] = "master";
		
		System.out.println(s.length);
		System.out.println(s[1]);
		
		System.out.println("********************************");
		
		//6. Object array
		Object ob[] = new Object[4];
		ob[0] = "Ajit";
		ob[1] = 25;
		ob[2] = "10/4/1995";
		ob[3] = 25.36;
		
		System.out.println(ob[2]);
		System.out.println(ob.length);

		for(int j=0;j<ob.length;j++) {
			System.out.println(ob[j]);
		}
		
	}

}
