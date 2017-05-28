import java.util.ArrayList;
import java.util.List;


public class ShoppingCart {
	private List<Product> products = new ArrayList<Product>();
	
	public void add(Product p) {
		products.add(p);		
	}
}
