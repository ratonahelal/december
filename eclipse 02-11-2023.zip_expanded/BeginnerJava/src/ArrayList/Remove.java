package ArrayList;

import java.util.ArrayList;

public class Remove {

	public static void main(String[] args) {
		ArrayList<Integer>number = new ArrayList<Integer>();
		
		number.add(10);
		number.add(20);
		number.add(30);
		number.add(3,40);
		
		System.out.println(number.size());
		System.out.println(number);
		
		boolean contain = number.contains(30);
		System.out.println("20 is the list:"+contain);
		
		//Replace 
		number.set(2,55);
		System.out.println("Number replace:"+number);
		
		int x= number.get(0);
		System.out.println("Get the number:"+x);
		
		number.remove(2);
		System.out.println(number);
		
		number.removeAll(number);
		System.out.println("After romove all:"+number);
		
		number.clear();
		System.out.println("Clear"+number);
		
		
	}

}
