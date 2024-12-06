package HW4;

public class Q2
{

	public static void main(String[] args)
	{
		//2. Write a program in Java which will accept 8 numbers in an array 
		//and print them in opposite directions.

int[] num = {11,22,33,44,55,66,77,88};
		
		for(int a = num.length-1;a>=0;a--)
		{
			System.out.println(num[a]);
		}
		
		
	}

}
