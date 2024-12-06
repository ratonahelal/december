package HW4;

public class Q4 
{

	public static void main(String[] args) 
	{
//4. Write a program in Java which will accept 8 numbers in an array
	//	and calculate sum of them 

		int sum =0;
		int num[]= {11,22,33,44,55,66,77,88};
		for(int x= 0;x<8;x++)
		{
		sum = sum + num[x];
		}
		
		System.out.println("calculate sum "+sum);
	}

}
