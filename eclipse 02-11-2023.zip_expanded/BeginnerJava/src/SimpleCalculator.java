import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int  number1,number2,result;
		
		System.out.print("Enter the frist number: ");
		number1 = input.nextInt();
		
		System.out.print("Enter the secound number: ");
		number2 = input.nextInt();
		
	    result =number1+number2;
	    System.out.println("Sum="+result);
	    
	    result =number1-number2;
	    System.out.println("Sub="+result);
	    
	    result =number1*number2;
	    System.out.println("multiple="+result);
	}

}
