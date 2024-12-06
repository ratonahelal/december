package HW4;

public class Q10 {

	public static void main(String[] args) {
		/* Write a program in Java which will accept 8 scores in an array
		and check if every score is between 0-4.*/
		
		double[]score = {1.2,2.2,3.3,4.4,5.5,6,7,80};
		for(int a=0; a<8; a++)
		{
		  if(score[a]>0 && score[a]<=4)
		{
			System.out.println(score[a]+" every score is between 0-4");
		}
		   else {
			   System.out.println(score[a]+" out of score 0-4");
		   }
		}
	}
}
