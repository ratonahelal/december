package class2;

public class Q6 {

	public static void main(String[] args) {
		/* Must live in NY
	     - Income must be less than 33,000
	     - Must be a female or a child under 6 */

		String state = "NY";
		int income = 30000;
		String gender = "female";
		int age = 6;
		
	if(state.compareTo("NY")==0 && income<33000 && (gender.compareTo("female")==0 ||age <=6)) 
	{
	
		System.out.println(" eligible");
	}
	
	else 
	{
		System.out.println("not eligible");
	}

	}

}
