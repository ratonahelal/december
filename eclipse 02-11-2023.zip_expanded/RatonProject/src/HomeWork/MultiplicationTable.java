package HomeWork;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		//Using loops print out the multiplications table(1-20) for 5
		int num;
		Scanner input =new Scanner(System.in);
		System.out.println("Enter any multication number: " );
		num = input.nextInt();
		
		for(int i=1;i<=20; i++) {
		System.out.println(num+" X "+i+ "=" +num*i);	
		}
      System.out.println("\n\n");
	}

}
