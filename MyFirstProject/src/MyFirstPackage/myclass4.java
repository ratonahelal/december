package MyFirstPackage;

import java.util.Scanner;

public class myclass4 {

	public static void main(String[] args) {
		//Create a Java program that prompts the user input to enter their name
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("please enter your name");
		
		
		String TalenTech = sc.nextLine();
		System.out.println("Hello " + TalenTech +"! Welcome to Core Java programming." );

	}

}



/*12. Write a simple program:
● Create a Java program that prompts the user input to enter their name
● Once the user enters their name, the program should display a personalized
greeting.
● Use appropriate variable names and data types.
● Ensure the program is well-commented to explain each step 
Enter your name: TalenTech
Hello TalenTech! Welcome to Core Java programming.*/