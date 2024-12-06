import java.util.Scanner;

public class PatternDecrement {

	public static void main(String[] args) {
		  
		Scanner input = new Scanner(System.in);
        System.out.println("Enter the line number ");
         int  n  = input.nextInt();
         
         for(int row=n; row>=1; row--) {
        	 for(int col=1; col<=row; col++) {
        		 System.out.print(" "+col);
        	 }
        	 System.out.println();
         }
	}

}
