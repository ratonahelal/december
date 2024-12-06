import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args) {
// create array list for 5 cars. print 1st 3 of them.
		
		ArrayList<String>Cars = new ArrayList<String>();
		Cars.add("BMW");
		Cars.add("Tesla");
		Cars.add("Audi");
		Cars.add("Hundi");
		Cars.add("toyata");
		String findcars = "BMW";
		
		
		for(int x =0; x<Cars.size(); x++ ) {
			//System.out.println(Cars.get(x));
			if((Cars.get(x)).compareTo(findcars)== 0) {
				System.out.println("cars found");
			}
			else {
				System.out.println("cars not found");
			}
			
		}
		

	}

}
