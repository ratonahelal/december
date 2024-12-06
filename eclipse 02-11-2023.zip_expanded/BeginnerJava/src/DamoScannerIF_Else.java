import java.util.Scanner;

public class DamoScannerIF_Else {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char ch;
		
		System.out.println("Enter the latter= ");
		ch = input.next().charAt(0);
		
		if(ch=='a'){
		System.out.println("Vowel");
		}
		else if(ch=='b'){
			System.out.println("Not Vowel");
		}
	}

}
