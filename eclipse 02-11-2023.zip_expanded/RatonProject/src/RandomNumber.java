
  public class RandomNumber {
	//Generate two random numbers and print the large number.
	  
  public static void main(String[]args) {
	 
	  int max = 80;
	  int min = 5;
	  
	  int randomNumber = (int) (Math.random()*(max-min+1)+min); 
	  
	  System.out.println(randomNumber);
	  
	  
	  
  }
  }
