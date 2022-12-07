package product;
//product type takes two items phone and notebook
public enum ProductType {
	Phone("Cep Telefonu"),
    Notebook("Notebook");

    private final String typeName;
    ProductType(String typeName){
        this.typeName = typeName;
    }
    @Override
    public String toString(){
        return this.typeName;
    }

}
