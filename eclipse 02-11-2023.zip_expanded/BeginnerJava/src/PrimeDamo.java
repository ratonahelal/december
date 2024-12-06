import java.util.Scanner;

public class PrimeDamo {
   public static void main(String[]args) {
	   
	   Scanner input = new Scanner(System.in);
	   System.out.print("Enter any possitive number: ");
	   int num = input.nextInt();
	   int count = 0;
	   
	   for(int i = 7; i< num; i++) {
		   
		   if(num%i==0) {
			  count ++; 
			   break;
		   }
	   }
	   if (count==0) {
		   System.out.println("The prime number");
	   }else {
		   System.out.println("Not prime number");
	   }
   }
}





