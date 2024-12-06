package HW3;

public class qe5
{

	public static void main(String[] args) 
	{
		// write a program in java that will sum number from 250 to 500,
		 // do not print number 370 and also do not print number from 480 to 490
		
		int sum =0;
		for(int x=250;x<=500;x++)
	 {
			sum = sum+x;
		
		if(x == 370)
		{
			
		}
		else if(x>=480 && x<=490)
		{
			
		}
		else
		{
			System.out.println(x);
		}
	 }
		System.out.println("sum " + sum);
   }
}