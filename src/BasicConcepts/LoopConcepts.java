package BasicConcepts;

public class LoopConcepts {

	public static void main(String[] args) {
		
		//1. While loop
		//disadvantage of while loop: it will generate infinite loop if you don't give incremental/decremental part 
		
		
		int i = 1;  //initialization
		
		while(i<=10) {//conditional
			System.out.println(i);
			i = i+1;  //incremental/decremental
		}
		
		System.out.println("*********************************************");
		
		//print 0 to 10
		//j++ = j = j+1
		
		for(int j=0;j<=10;j++) {// Initialization, conditional, Incremental
			System.out.println(j);
		}
		
		System.out.println("*********************************************");
		
		for(int k=10;k>=10;k--) {//Initialization, conditional, Decremental
			System.out.println(k);
		}
		System.out.println("*********************************************");
		
		
		for(int p=1; p<=50;p++) {
			
			if(p%2==1) {
				System.out.println(p);
			}
		}
		
		System.out.println("*********************************************");
	
	
	}

}
