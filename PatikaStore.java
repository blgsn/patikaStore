
import brand.Brand;
import brand.Manage;
import product.ProductInputs;
import product.ProductType;

import java.util.*;

public class PatikaStore {
	private String shopName;
    private Manage manage;

    public PatikaStore(String shopName){
        this.shopName = shopName;
        this.manage = new Manage();
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public Manage getBrandsManager() {
        return manage;
    }

    public void setBrandsManager(Manage manage) {
        this.manage = manage;
    }

    public void addBrand(String brandName){
    	manage.addBrand(brandName);
    }


    private int lastID = 0;
    public void addProduct(String brandName, ProductInputs product){
        Brand brand = manage.getBrand(brandName);
        
        if (brand.getId() == -1){
            return;
        }
        product.setID(lastID++);
        brand.addProduct(product);
    }
    
    
	public void listProducts(){
        TreeMap<ProductType, TreeSet<String>> pairs = new TreeMap<>();
        for (ProductType types : ProductType.values()){
            pairs.put(types, new TreeSet<>());
        }

        TreeSet<Brand> brands = manage.getAllBrands();

        for (Brand brand : brands){
            for (ProductInputs product : brand.getProducts()){
                TreeSet<String> values = pairs.get(product.getProductType());
                values.add(brand.getBrandName() + " " + product);
            }
        }

        System.out.println("** Beginning to print products **");

        for (ProductType types : pairs.keySet()){
            TreeSet<String> values = pairs.get(types);
            System.out.println("\n" + types + "s:");
            for (String s : values){
                System.out.println(s);
            }
            System.out.println("");
        }

        System.out.println("** End of products **");

    }

    public void listProducts(ProductType type){
        TreeSet<String> products = new TreeSet<>();

        TreeSet<Brand> brands = manage.getAllBrands();
        for (Brand brand : brands){
            for (ProductInputs product : brand.getProducts()){
                if (product.getProductType() == type){
                    products.add("| " + product.getID() + "  | " + brand.getBrandName() +  "  | " + product.getPrice() + "TL" + "  | " + product + "  | ");
                }
            }
        }
        if(type==type.Notebook) {
        System.out.println("\n\n\n" + type.Notebook + " Listesi\n");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("| ID | Marka    | Fiyat   | Ürün adı                   | Depolama  | Ekran   | RAM   |");
        for (String s : products){
            System.out.println(s);
        }
        System.out.println("--------------------------------------------------------------------------------------\n\n");
    }
    else {
        
        System.out.println("\n\n\n" + type.Phone + " Listesi\n");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Marka    | Fiyat   | Ürün adı                   | Depolama  | Ekran   | Kamera  | Pil        | RAM      | Renk    |");
        for (String s : products){
            System.out.println(s);
        }
        System.out.println("--------------------------------------------------------------------------------------------------------------------------\n\n");

    }}

    public void listBrands() {
        TreeSet<Brand> brands = manage.getAllBrands();
        System.out.println("\nMarkalarımız");
        System.out.println("--------------");
        for (Brand brand : brands) {
            System.out.println("- " + brand);
        }
        System.out.println("\n\n");
    }

	
}
