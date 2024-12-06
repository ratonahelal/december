package HW4;

public class Q8 {

	public static void main(String[] args) {
		//Write a program in Java which will accept 8 email addresses in an array 
		//and check if every email address is at least 10 characters long 

		String[]email = {"ab@y.com","bhggfy@gmail.com",".com",
				"lklj123@gmail","bmb56@yahoo.com","78ryvnyahoo.com",
				"bate@gamil.com","ola@gmail.com"};
		
		for(int x=0; x<8; x++)
		{
			if(email[x].length()<=10)
			{
				System.out.println(email[x] + " = only 10 characters email is show");
			}	
		}	
	}
}
