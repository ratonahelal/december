package ArrayList;

import java.util.ArrayList;

public class Array1 {

	public static void main(String[] args) {
		
		ArrayList<Integer>number = new ArrayList<Integer>();
		System.out.println("Size = "+ number.size());

		number.add(70);
		number.add(10);
		number.add(20);
		number.add(30);
		number.add(2,0);
		
		//System.out.println(number);
		for(int x : number) {
			System.out.println(" Arraylist contains  " + x);
		}
		System.out.println();
		System.out.println("Size = "+ number.size());
	}
	

}
