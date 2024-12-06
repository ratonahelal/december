import java.util.Scanner;

public class ArrayDouble {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double[] number = new double [5]; 
		double sum = 0;
		
		System.out.print("Plese Enter 5 numbers: ");
		
		for(int i=0; i< number.length; i++) {
		number [i] = input.nextDouble();	
		}
		
		for(int i=0;i< number.length; i++) {
			sum = sum + number[i];
		}
        
        double avg = sum/number.length; 
        
        System.out.println("The Sum is: "+sum);
        System.out.println("The average is: "+avg);
	}

}
