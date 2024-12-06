package praticeJava;

public class Nestedif_else {

	public static void main(String[] args) {
		// if someone lives in nyc & age is 18 or up then they are eligible for city
		// jobs.(use nested if_else)
		//covid19 take in USA or abroad.
		
		
		String  address = "nyc";
	     int	age = 25;
	     String country = "abroad";
	     
	     if(address.compareTo("nyc")== 0) {
	    	System.out.println("you live in nyc"); 
	    	
	    	if(age>=18) {
	    		
	    		System.out.println("you are eligible.your age is 18+");
	    		
	    		if(country.compareTo("USA")==0 ||country.compareTo("abroad")==0) {
	    			System.out.println("You are vaccinted.You are fully qualifield");
	    		}
	    		else {
	    			System.out.println("You don't have covid19 vaccine. You are disqualifield. ");
	    		}
	    		
	    		
	    	}
	    	
	    	else {
	    		System.out.println("you are not eligible.your age is blew 18");
	    	}
	    	
	     }
	     else {
	    	System.out.println("You are not eligible because out of nyc"); 
	     }

	}

}
