import java.util.Scanner;

public class DamoInput {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String name ;
		 System.out.println("Enter Name");
		name = input.nextLine();
        System.out.println("Welcome"+ name);
	}

}
