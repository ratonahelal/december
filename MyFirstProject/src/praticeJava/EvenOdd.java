package praticeJava;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {

		// You are designing a simple Java program to determine whether a given number
		// is even or odd. Write an if-else statement that takes an integer input and
		// prints "Even" if the number is even and "Odd" if it's odd.

		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number: ");
	     int number = sc.nextInt();
	     System.out.println("raton : "+number);
	     // even
		if(number%2 == 0) {
			
			System.out.println("even number ");
			
		}
		// odd
		else {
			System.out.println("odd number ");
		}
	}

}
