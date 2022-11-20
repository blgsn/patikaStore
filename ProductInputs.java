package product;

public interface ProductInputs extends Comparable<ProductInputs> {
	public String toString();

    public int getPrice();
    public void setPrice(int price);
    public String getProductName();
    public ProductType getProductType();
    public void setProductName(String productName);
    public void setID(int id);
    public int getID();

}