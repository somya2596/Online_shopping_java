package OnlineshoppingCart;

public class ProductList {
	
	private String ProductName;
	private Double Price;
	private String Description;
	private int Quantity;
	
	public ProductList(){
	}
	
	public ProductList(String ProductName,Double Price,String Description,int Quantity)	{
		this.ProductName=ProductName;
		this.Price=Price;
		this.Description=Description;
		this.Quantity=Quantity;
		
	}
	
	public String getProductName() {
		return ProductName;
	}
	
	public double getPrice(){
		return Price;	
	}
	
	public String getDescription() {
		return Description;	
	}
	
	public int getQuantity(){
		return Quantity;
	}
	
	public void setProductName() {
		this.ProductName=ProductName;
	}
	
	public void setPrice() {
		this.Price=Price;
	}
	
	public void setDescription() {
		this.Description=Description;
	}
	
	public void setQuantity() {
		this.Quantity=Quantity;
	}
	
	public String Display(){
		String display = ProductName + " -  Rs." + Price + " x " +Description+"-"+ Quantity;
	    return display;
	}
}
