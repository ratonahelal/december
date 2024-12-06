import java.util.Scanner;

public class LoopEvenNumber {

	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		int sum  = 0;
		int m,n  ;
		
		System.out.print("the inatail number: " );
		m = input.nextInt();
		
		System.out.print("the finial number: " );
		n = input.nextInt();
		
		for (int i = m; i <= n; i++) {
			
			if (i%2==0) {
			
			sum = sum + i;	
			System.out.print("  "+ i);
		}
		
	}
		System.out.println();
		System.out.println("The sum is: " + sum);
}
}
