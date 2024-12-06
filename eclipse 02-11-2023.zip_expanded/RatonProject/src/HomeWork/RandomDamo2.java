package HomeWork;

import java.util.Random;

public class RandomDamo2 {

	public static void main(String[] args) {
		Random rand = new Random();
        int randomNumber = rand.nextInt(30)+1; 
       // int randomNumber = (int) (Math.random()*(max-min+1)+min); 
  	  
        if(randomNumber % 7==0) {
        System.out.println("The number is dividable");
        }else {
        	 System.out.println("The number is not dividable");
        }
	}

}
