package in.co.rays.oop;

public class TestProduct {
	
	public static void main(String[] args) {
		
		Product p=new Product();
		p.Name="Prakhar Solanki";
		p.Address="12/2 Nanda nagar indore madhya pradesh";
		p.ProductType="Electronics";
		p.ProductName="Lenovo idea Pad Yoga Series";
		p.ProductPrice=75000;
		p.Discount=10;
		p.Rating=4;
		
		System.out.println("Name= "+p.Name);
		System.out.println("Address= "+p.Address);
		System.out.println("ProductType= "+p.ProductType);
		System.out.println("ProductName= "+p.ProductName);
		System.out.println("ProductPrice= "+p.ProductPrice);
		System.out.println("Discount= "+p.Discount);
		System.out.println("Rating= "+p.Rating);
		
		
		
	}

}
