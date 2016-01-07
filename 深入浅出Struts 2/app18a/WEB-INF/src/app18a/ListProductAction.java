package app18a;
import interceptor.DataSourceAware;
import java.util.List;
import javax.sql.DataSource;
import com.opensymphony.xwork2.ActionSupport;

public class ListProductAction extends ActionSupport implements DataSourceAware {
    private DataSource dataSource;
    private List<Product> products;
    
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    public List<Product> getProducts() {
        return products;
    }
    public void setProducts(List<Product> products) {
        this.products = products;
    }
    
    public String execute() {
        ProductDAO productDAO = new ProductDAO();
        productDAO.setDataSource(dataSource);
        products = productDAO.getAllProducts();
        return SUCCESS;
    }
}
