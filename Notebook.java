package product.readyType;
import product.baseType.Hardware;
import product.ProductType;

public class Notebook extends Hardware {
    public Notebook(String productName, int price) {
        super(ProductType.Notebook, productName, price);
    }
}