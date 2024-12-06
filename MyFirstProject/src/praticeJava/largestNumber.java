package praticeJava;

public class largestNumber {

	public static void main(String[] args) {
		// Develop a Java program to determine the largest of three given numbers. Write
		// an if-else statement that compares the three numbers and prints the largest
		// one.
		
		
		int a = 1000;
		int b = 200;
		int c = 30;
		
		if(c>a && c>b) {
			System.out.println("c is the biggest number");
			
		}
		
		else if(b>a && b>c) {
			System.out.println("b is biggest number");
			
			
		}
		else {
			System.out.println("a is the biggest number");
		}
	}

}
