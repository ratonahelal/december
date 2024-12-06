import java.util.Scanner;

public class DamoScanner {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        int x,y,result;
         x = 3;
        y = 4;
        
        System.out.print("Enter number  ");
        x = input.nextInt();
        
        System.out.print("Enter 2nd number");
        x = input.nextInt();
        
       result = x+y;
       System.out.println("Sum=" +result);
       
       result = x-y;
       System.out.println("Sub=" +result);
       
        
	}

}
