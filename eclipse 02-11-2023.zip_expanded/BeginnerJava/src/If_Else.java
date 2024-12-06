import java.util.Scanner;

public class If_Else {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.print("Enter the number" );
		num = input.nextInt();
		
		if(num<5) {
			System.out.println("positive");	
		}
		else if(num>5) {
			System.out.println("Negative");
		}
		else {
			System.out.println("Equel to zero ");
		}
		}

	}


