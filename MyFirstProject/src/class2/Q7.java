package class2;

public class Q7 {

	public static void main(String[] args) {
		/* Score: 0-1 F grade
	     Score: 2-3 B grade
	     Score: >3 A grade
	     Score can not be negative and greater than 4 */

		double score =  .25;
		
		if(score>=0 && score<=1)
		{
			System.out.println("F grade");
		}
		
		else if(score>=2 && score<=3)
		 {
			 System.out.println("B grade"); 
		 }
		else if(score>3 && score<=4)
		 {
			 System.out.println("A grade");
		 }
		 else
		 {
			 System.out.println("please enter the score");
		 }
		 
		 
	}

}
