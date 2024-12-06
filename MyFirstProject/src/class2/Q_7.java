package class2;

public class Q_7 {

	public static void main(String[] args) {
		/* Score: 0-1 F grade
	     Score: 2-3 B grade
	     Score: >3 A grade
	     Score can not be negative and greater than 4 */

		double score1 = 1.00;
		double score2 =  2.25;
		double score3 = 3.80;
		
		
		if(score1 >=0 && score1 <=1 || score2 >=2 && score2 <=3 || score3 >3 && score3 <=4)
		{
			System.out.println("F grade");
		}
		
		// if(score2 >=2 && score2 <=3)
		else
		 {
			 System.out.println("B grade"); 
		 }
		// if(score3 >3 && score3 <=4)
		
		 {
			 System.out.println("A grade");
		 } 
		 
		 {
			 System.out.println("please enter the score");
		 }
		
		 
	}

}
	
