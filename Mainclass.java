package OnlineshoppingCart;

import java.util.Scanner;

public class Mainclass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Adding_Remove myList = new Adding_Remove();
		int useroutput = 0;
		while (useroutput != 4) {
			
			System.out.println("-----Shopping Cart-----");
		
			System.out.println("(1) Add a product to the list. ");
			System.out.println("(2) Remove a product from the list. ");
			System.out.println("(3) Buy a product from the list. ");
			System.out.println("(4) Display list and total number of products. ");
			System.out.println("(5) Exit. ");
			useroutput = input.nextInt();
		
			
			if (useroutput == 1)
			{
				myList.addProduct();

			}
			
			if (useroutput == 2) 
			{
				myList.removeProduct();
			}
			
			if(useroutput == 3)
			{
				myList.BuyProduct();
			}
			
			if (useroutput == 4)
			{
				myList.display();
			}

		}
		
		if (useroutput == 5) 
		{
			System.out.println("Thanks for shopping");
		}
	}
}
