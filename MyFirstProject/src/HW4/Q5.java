package HW4;

public class Q5
{

	public static void main(String[] args) 
	{
		//5. Write a program in Java which will accept 8 numbers in an array 
		//and calculate sum of first 4 numbers.
        int sum = 0;
        
		int num[]= {11,22,33,44,55,66,77,88};
		for(int i=0;i<4;i++)
		{
			sum = sum+num[i];
		//System.out.println(num[i]);	
		}
		System.out.println(sum);
		
		
	}

}
