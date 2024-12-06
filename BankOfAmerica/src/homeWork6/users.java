package homeWork6;

/*1. create a class 'Users'
2. create a method 'Login'
3. take user id and password as parameters to the Login method
4. verify if user id = 'talentech' and password is 'tel123!' and return values*/

	public class users

{
	public boolean Login(String userid, String password) // Login method with parameters
    {
		if (userid.compareTo("talentech") == 0 && password.compareTo("tel123!") == 0)
		{
			return true;

		}
		else
		{
			return false;
		}

     }

 /*5. create another method 'updateprofile'
    6. take user id, first name, last name, email and phone as parameters
    7. if user id ='talentech' and all other parameters have values then return success value , otherwise return fail value
    8. take a startup class with main() method
    9. call method Login(), if passed then call updateprofile() and display appropriate messages.*/

   
   
   
	public String updateprofile2(String userid,String firstname, String lastname,String email, String phone)
	{

		if (userid.compareTo("talentech")==0)
		{  
			return "success";
 
		}
		else
		{
			return "fail";
		}
     
	}
   
}
