package product.readyType;
import product.baseType.Hardware;

import product.ProductType;

public class Phone extends Hardware {

    public Phone(String productName, int price) {
        super(ProductType.Phone, productName, price);
    }
}