package brand;

import product.ProductInputs;

import java.util.List;
import java.util.TreeSet;
//method of list in alphabetical order using treeset
public class Manage {
	private TreeSet<Brand> brands;
    public Manage(){
        brands = new TreeSet<>();
       
    }
//add product according to id and name
    public Brand addBrand(String brandName){
        int id = brands.size();
        
        Brand resultBrand = new Brand(brandName, id);
        brands.add(resultBrand);
        return resultBrand;
    }
//checks if it is equal to the brands in the list
    public Brand getBrand(String brandName){
        for (Brand brand : brands){
            if (brand.getBrandName().equals(brandName)){
                return brand;
            }
        }
        
     
        Brand resultBrand = addBrand(brandName);
        return resultBrand;
    }
    
    public TreeSet<Brand> getAllBrands(){
        return this.brands;
    }

//adds the brand to be added in alphabetical order
    public TreeSet<ProductInputs> getAllProducts(){
        TreeSet<ProductInputs> products = new TreeSet<>();
        for (Brand brand : brands){
            products.addAll(brand.getProducts());
        }
        return products;
    }
       

}
