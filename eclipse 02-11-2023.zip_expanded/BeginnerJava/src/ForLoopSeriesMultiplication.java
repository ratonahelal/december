import java.util.Scanner;

public class ForLoopSeriesMultiplication {
public static void main(String args[]) {
	
	Scanner input = new Scanner(System.in);
 
		int m,n;
	    
	    System.out.print("Enter the 1st number:"  );
	     m = input.nextInt();
		
	     System.out.print("Enter the 2nd number:"  );
	     n = input.nextInt();
	     
	     for(int i = m; i<= n; i= i+1) {

	    	 for(int j=1;j<=10;j=j+1) {
	    		 
	    	 
         
		System.out.println(i+"x"+j+"="+i*j);
	    	
	    	 } 
	    	 System.out.println("\n\n");
	     }     
	     
	     
	}
	
}

