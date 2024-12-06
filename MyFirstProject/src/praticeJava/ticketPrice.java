package praticeJava;

public class ticketPrice {

	public static void main(String[] args) {
		// You are building a ticket pricing system for a movie theater. Write a Java program that takes the age of a
		// moviegoer as input and uses an if-else statement to determine the ticket
		// price. If the age is 12 or younger, the ticket is $8; if the age is between
		// 13 and 17, the ticket is $12; otherwise, the ticket is $15.
		
		
		int age = 5;
		if(age<=12 ) {
			System.out.println("Ticket price is $8");
			
		}
		
		else if (age>=13 && age <= 17) {
			System.out.println("Ticket price is $12");
		}
		
		else {
			System.out.println("Ticket price is $15");
		}
	}

}
