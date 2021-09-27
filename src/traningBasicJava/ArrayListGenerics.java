package traningBasicJava;

import java.util.ArrayList;

public class ArrayListGenerics {

	public static void main(String[] args) {

		
		ArrayList<String> contry = new ArrayList<String>();
		
		contry.add("Aus");
		contry.add("India");
		contry.add("USA");
		contry.add("UK");
		
		for(String s : contry) {
			System.out.println(s);
		}
		
		System.out.println("***************************************");
		
		ArrayList<Integer> age = new ArrayList<Integer>();
		
		age.add(25);
		age.add(30);
		age.add(16);
		
		for(int i=0; i<age.size(); i++) {
			System.out.println(age.get(i));
		}
		System.out.println("***************************************");
		
		ArrayList<Double> height = new ArrayList<Double>();
		height.add(5.3);
		height.add(5.8);
		height.add(4.9);
		
		for(double d : height) {
			System.out.println(d);
		}
		System.out.println("***************************************");
		
		ArrayList<Object> player = new ArrayList<Object>();
		
		player.add("Virat");
		player.add(245);
		player.add(5.11);
		player.add('M');
		player.add(true);
		
		for(Object e : player) {
			System.out.println(e);
		}
			
	}

}
