package HomeWork;

import java.util.Random;

public class RandomNumberDamo {

	public static void main(String[] args) {
		
		Random rand = new Random();
         int randomNumber = rand.nextInt(30)+1; 
         System.out.println("Random Number " + randomNumber);
		
		
	}

}
