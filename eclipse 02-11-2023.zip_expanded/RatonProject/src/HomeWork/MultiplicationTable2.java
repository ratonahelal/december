package HomeWork;

import java.util.Scanner;

public class MultiplicationTable2 {

	public static void main(String[] args) {
//  loops print out the multiplications table(1-20) for 1 through 10

	
		Scanner input = new Scanner(System.in);
		int m,n;
		
		System.out.print("Enter the initail number");
		m = input.nextInt();
			
		System.out.print("Enter the final number");
		n = input.nextInt();
		
		for(int i=m; i<=n; i++) {
		 for(int j=1; j<=10; j++) {
			
			 System.out.println(i+"x"+j+"=" +i*j);
		 }
		 System.out.println("-----");
		 System.out.println("\n\n");
		}
		
	}

}
