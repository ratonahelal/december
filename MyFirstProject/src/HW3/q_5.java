package HW3;

public class q_5 {

	public static void main(String[] args) {
		/* write a program in java that will sum number from 250 to 500,
		  do not print number 370 and also do not print number from 480 to 490 */
		
		int sum = 0;
        for (int i = 250; i <= 500; i++) {
            if (i != 370 && (i >= 480 && i <= 490)) {
               
            }
            sum += i;
        }
        System.out.println("The sum of numbers from 250 to 500, excluding 370 and numbers from 480 to 490 is " + sum);
    }

	}


