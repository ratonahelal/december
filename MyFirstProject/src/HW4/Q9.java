package HW4;

public class Q9
{

	public static void main(String[] args)
{
		/*9. Write a program in Java which will accept 8 phone numbers in an array 
		and check if every number is exactly 10 characters long */
		
		String[]phNu = {"1234456","3555666","8762113153","4654654","89620231","12 258930","235989","2359894"};
		
		for(int r=0; r<8; r++)	
		{
			if(phNu[r].length()==10)
			{
				System.out.println(phNu[r]+" is good number");
			}
			else
			{
				System.out.println(phNu[r]+" is bad number");
			}
		}
	}
}
