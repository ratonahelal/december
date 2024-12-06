package homeWork6;

public class startup
{
	/* 7. if user id ='talentech' and all other parameters have values then return success value ,
	 *  otherwise return fail value
      8. take a startup class with main() method
	 9. call method Login(), if passed then call updateprofile() and display appropriate messages.*/


public static void main(String[] args) // String userid,String firstname, String lastname,String email, String phone
  {
		users objname = new users ();

		boolean abc=objname.Login("talentech", "tel123!");
   
    	System.out.println(abc);
   
       if(abc)
      {
    	  String apple = objname.updateprofile2("talentech", null, null, null, null) ;
    	  System.out.println(apple);
       }
   }
}
