package MyFirstPackage;

public class myclass3 {

	public static void main(String[] args) {
		
		
		double unitePrice = 30.99;
		int items = 2;
		double taxRate = 8.75;
		double totalPrice = unitePrice*items;
		System.out.println(totalPrice);
       double TotalTax = totalPrice*(taxRate/100);
       System.out.println(TotalTax);
     double  netprice = totalPrice + TotalTax ;
     System.out.println(netprice);
       
       
       
       
	}

}

/*9. Create a class 'myclass3' with a main method in it
10. Write a program which will take unit price, number of items in 2 variables,
calculate tax @8.75% on total sales price and print net price by adding total price with
net price.
11. Print the result*/