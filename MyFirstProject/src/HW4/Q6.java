package HW4;

public class Q6
{

	public static void main(String[] args)
	{
		// 6. Write a program in Java which will accept 8 numbers in an array and print
		// them. Do not print numbers more than 100.
		
		int num[]= {11,22,33,110,150,66,77,88};
		for(int x=0;x<num.length;x++)
		{
			if(num[x]<=100)
			{
				System.out.println(num[x]);
			}
		}
		
		

	}

}
