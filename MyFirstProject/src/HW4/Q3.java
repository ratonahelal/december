package HW4;

import java.util.ArrayList;

public class Q3
{

	public static void main(String[] args)
	{
//3. Write a program in Java which will accept 8 numbers in an arrayList and print them.
		
		ArrayList<Integer>Numbers= new ArrayList<Integer>();
		Numbers.add(1);
		Numbers.add(2);
		Numbers.add(3);
		Numbers.add(4);
		Numbers.add(5);
		Numbers.add(6);
		Numbers.add(7);
		Numbers.add(8);
		
		for(int r= 0;r <8;r++)
		{
			System.out.println(Numbers.get(r));
		}

	}

}
