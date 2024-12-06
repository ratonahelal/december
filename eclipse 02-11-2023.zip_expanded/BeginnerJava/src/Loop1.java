import java.util.Scanner;

public class Loop1 {

	public static void main(String[]args) {
		
	Scanner input = new Scanner(System.in);
	
		int sum = 0;
		int m,n ;
		
		System.out.print("Enter initail number: ");
		m = input.nextInt();
		
		System.out.print("Enter final number: ");
		n = input.nextInt();
		
		for(int i= m; i <= n; i++) {
		
		sum = sum + i;
		}
		
		System.out.println("The sum is: " + sum);
		
	}
}
