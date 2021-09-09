package BasicConcepts;

public class TwoDimArray {

	public static void main(String[] args) {
	
		
		String x[][] = new String[3][4];
		
		System.out.println(x.length);
		System.out.println(x[0].length);

		//row 1
		x[0][0] = "A";
		x[0][1] = "B";
		x[0][2] = "C";
		x[0][3] = "D";
		
		//row 2
		x[1][0] = "A1";
		x[1][1] = "B1";
		x[1][2] = "C1";
		x[1][3] = "D1";
		
		//row 3
		x[2][0] = "A2";
		x[2][1] = "B2";
		x[2][2] = "C2";
		x[2][3] = "D2";
		
		System.out.println(x[0][2]);
		System.out.println(x[2][2]);
		
		//print all the values of 2D array : for loop
		//row=0, col= 0 to 4
		//row=1  col= 0 to 4
		//row=2  col= 0 to 4
		
		for(int row=0; row<x.length; row++) {
			for(int col=0; col<x[0].length; col++) {
				System.out.print(x[row][col]+" ");
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
