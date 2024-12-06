import java.util.Scanner;

public class PrimeNumber {
	
public static void main (String[]args) {
	// This code have problem so fix it plz.
	int m,n,count = 0,TotalPrime=0;
	
	Scanner input = new Scanner(System.in); 
	System.out.print("Enter 1st number: " );
	m = input.nextInt();
	
	 
	System.out.print("Enter 2nd number: ");
	n = input.nextInt();
	
	
	for(int i= m; i<=n; i++)
	{
		for(int j =2; j<=i-1; j++) {
			if(i%j==0)
		{
		count++;
		break;
		}
		
	}
	if (count == 0);
    System.out.println(i);
     TotalPrime++;
	}
	//count = 0;
    }

    // System.out.println("Total prime number");
     
    }
    
    
    