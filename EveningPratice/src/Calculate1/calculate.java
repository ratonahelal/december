package Calculate1;

public class calculate {

	public static void main(String[] args) {
		/* Question 1: Basic Void Method
		
			Create a class named Calculator with a void method addNumbers 
			that takes two parameters, num1 and num2, and prints their sum.
			 Make sure the method is accessible from any class in the same package.*/

		addNumbers(10,20);
		addNumbers(30,30);
		addNumbers(40,50);
		addNumbers(60,70);
		addNumbers(80,90);
		printer.printMessage("Bangladesh");

		
		int finalsum = addNumbers(100,120);
		System.out.println("Final sum "+ finalsum );
		
		int finalsum1 = addNumbers(60,70);
		System.out.println("Final sum "+ finalsum1 );

	}

	public static int addNumbers(int a,int b)
    {
		int sum = a+b;
		//System.out.println("addition of " + a+ " and "+b+" is "+sum);
		return sum;
    }
}
