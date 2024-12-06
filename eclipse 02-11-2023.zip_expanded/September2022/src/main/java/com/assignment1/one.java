package com.assignment1;

//1)1)	A triangle  has three arms are: 5, 7 and 11 inches.
//Write a method to display the perimeter of triangle in console output.

public class one {
	

	public static void main(String[] args) {
		
		int x = 5;
		int y = 7;
		int z = 11;
		int p = x*y*z;
		System.out.println("perimeter of triangle:"+ p);
		
		// running my method calPerimeter()
		calPerimeter();
		
		//calPerimeter2nd();
		
		System.out.println(" "+calPerimeter2nd());
		
		
		int  j = calPerimeter2nd();
		
		System.out.println("value of j:"+j);
		
		
		// calling 3rd method
	
		calAutoPerimeter3rd(5,8,9);
		
		
	}
	
	public static  void calPerimeter() {
		int a = 5;
		int b = 7;
		int c = 11;
		int p = a*b*c;
		
		System.out.println("Perimeter of triangle in my method: "+p);
		
		
	}
	
	 static  int calPerimeter2nd() {
		int a = 5;
		int b = 7;
		int c = 11;
		int p = a*b*c;
		//System.out.println("Perimeter of Traingle this 2nd method: "+p);
		return p;
	}
	
	public static void calAutoPerimeter3rd(int a, int b, int c) {
		
		int perimeter = a*b*c;
		
		System.out.println("Perimeter of Traingle this 3rd method: "+perimeter);
		
	}

}
