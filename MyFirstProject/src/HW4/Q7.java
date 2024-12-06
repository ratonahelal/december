package HW4;

public class Q7 {

	public static void main(String[] args) {
	/*	Write a program in Java which will accept 8 numbers 
		in an array and find a given number is found in the array.*/
		
		int[]number = {11,22,33,44,55,66,77,88};
		int givennumber = 44;
		
		for(int x= 0; x<8; x++)
		{
			if(number[x]== givennumber)
			{
				System.out.println("found");
			}	
		}
	}
}
