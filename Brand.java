package brand;

import product.ProductInputs;
import java.util.ArrayList;

public class Brand implements Comparable<Brand>{
	private String brandName;
    private int id;
    private ArrayList<ProductInputs> products;

    public Brand(String brandName, int id){
        this.brandName = brandName;
        this.id = id;
        this.products = new ArrayList<>();

    }

    @Override
    public String toString(){
        return this.brandName + " (" + products.size() + " ürün)";
    }

    @Override
    public int compareTo(Brand compareTo) {
        return brandName.compareTo(compareTo.getBrandName());
    }


    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<ProductInputs> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<ProductInputs> products) {
        this.products = products;
    }

    public void addProduct(ProductInputs product){
        products.add(product);
    }
    
}
