package traningBasicJava;

import java.util.ArrayList;

public class ArrayListConcepts {

	public static void main(String[] args) {

		
		ArrayList al = new ArrayList();
		
		al.add(100);
		al.add(500);
		al.add(100);
		al.add(50);
		al.add(320);
		al.add(800);
		System.out.println(al.size());
		
		//al.get(-1);//IndexOutOfBoundsException
		//al.get(6);//IndexOutOfBoundsException
		
		al.remove(0);
		System.out.println(al.size());
		al.add(200);
		//al.clear();
		boolean b = al.contains(100); // returns boolean value if element is present or not in AL
		System.out.println(b);
		//Print all the AL values
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
		System.out.println("*********************************");
		for(Object i : al) {
			System.out.println(i);
		}
		
		
	}

}
