package app14b;
import java.util.ArrayList;
import java.util.List;
import com.opensymphony.xwork2.ActionSupport;

public class DisplayProductsAction extends ActionSupport {

    public List<Product> getProducts() {
        List<Product> products = new ArrayList<Product>();
        products.add(new Product(1, "Television"));
        products.add(new Product(2, "Computer"));
        products.add(new Product(3, "VCR"));
        products.add(new Product(4, "Game Console"));
        return products;
    }
}
