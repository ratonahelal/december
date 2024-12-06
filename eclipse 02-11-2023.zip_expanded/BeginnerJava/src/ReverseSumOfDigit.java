import java.util.Scanner;

public class ReverseSumOfDigit {

			public static void main(String[] args) {
				
				int sum=0,num,r,tem;
				Scanner input =new Scanner(System.in);
				System.out.println("Enter the number");
			    num = input.nextInt();
				
			    tem = num;
			    while(tem!=0) {
			    	r = tem % 10 ;
			    	sum = sum *10+r;
			    	tem = tem /10;
			    }
		     System.out.println("Sum of digit "+ sum);
			}

		}


	
