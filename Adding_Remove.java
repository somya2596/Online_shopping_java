
package OnlineshoppingCart;
import java.util.ArrayList;
import java.util.Scanner;

public class Adding_Remove {
	

	ArrayList<ProductList> list = new ArrayList<>(); // storing in linked list
	ProductList productlist=new ProductList();
	
	// adding new product and details
	
	public void addProduct() {
		
		//in parenthesis ProductList product 
		//product available in the list
		//if yes than increase quantity
		//no than add product
		//list.add(product)
		
		
		System.out.println();

		System.out.println("Enter the name of the product");
		Scanner name = new Scanner(System.in);
		String ProductName = name.next();

		System.out.println("Enter Price of the product");
		Scanner price = new Scanner(System.in);
		Double Price = price.nextDouble();

		System.out.println("Enter Description of the product");
		Scanner description = new Scanner(System.in);
		String Description = description.next();

		System.out.println("Enter quantity of the product");
		int qty = (new Scanner(System.in)).nextInt();
		ProductList product = new ProductList(ProductName, Price, Description, qty);
		list.add(product);
		System.out.println("Products added");

	}

	// removing the product

	public void removeProduct() {
		Scanner name = new Scanner(System.in);
		System.out.println("Enter the name of the product you want to remove");
		String ProductName = name.next();

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getProductName().equals(ProductName)) {

				list.remove(i);
				System.out.println("Product removed");
			} else {
				System.out.println("PRODUCT NOT FOUND IN THE CART");
			}
		}
	}

	// Buying the product
	
	public void BuyProduct() 
	{
				
		Scanner name = new Scanner(System.in);
		System.out.println("Enter the name of the product you want to buy:");
		String ProductName=name.next();

		for (int item = 0; item < list.size(); item++) {
			if (ProductName == null) {
				System.out.println("Item not found");
				return;
			}
			
			else if(ProductName!=null)
			{
				Scanner qty = new Scanner(System.in);
				System.out.println("Quantity of product to buy:");
				int Quantity=qty.nextInt();
				if (Quantity <= productlist.getQuantity())
				{
					System.out.println("Buyed");
					return;
				}
				else {
			
				System.out.println("Not in stock");
			
			}
			}
			}
			}
			
	// displaying

	public void display() {

		System.out.println("Total no. of products: " + list.size());
		for (ProductList products : list) {
			System.out.println(products.Display());
		}
	}

}
