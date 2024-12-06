
public class HwExample {

	public static void main(String[] args) {
/*Write a function that takes an integer as an 
	input and return true if the number is odd and under 40,
	 else it returns false.*/
	int x;
		
		oddNumber(x = 41);
		
	
	}
	
	
	public void display() {
		
		System.out.println();
	}
	
	
	public static void oddNumber(int x) {
//		x = 38;
		
		if(x%2 == 1 && x <= 40 ) {
			System.out.println(true);
			
		}
		else 
			System.out.println(false);
			System.out.println(x);
	
	}	
	
	}


