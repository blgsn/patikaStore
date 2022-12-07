package product.baseType;
import product.specifications.ScreenSpecifications;
import product.specifications.Ram;
import product.Products;
import product.ProductType;

public abstract class Hardware extends Products {
	private String ram;
    private String screen;
    private String storage;
    private String camera;
    private String cell;
    private String color;
    

    public Hardware(ProductType productType, String productName, int price) {
        super(productType, productName, price);
        ram = "";
        screen = "";
        storage = "";
        camera = "";
    }

    public void setRam(Ram ram){
        this.ram = ram.toString();
    }
    public void setRam(String ram){
        this.ram = ram;
    }
    
    public void setScreenSpecifications(ScreenSpecifications screen) {
        this.screen = screen.toString();
    }
    public void setScreenSpecifications(String screen) {
        this.screen = screen;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getCamera() {
		return camera;
	}

	public void setCamera(String camera) {
		this.camera = camera;
	}

	public String getCell() {
		return cell;
	}

	public void setCell(String cell) {
		this.cell = cell;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getRam() {
        return ram;
    }

    public String getScreenSpecifications() {
        return screen;
    }

    public String getStorage() {
        return storage;
    }
    
    

    @Override
    public String toString() {
      //listing phones and computers on the screen
        if(getProductType()==ProductType.Phone) {

        return getProductName() + "    |"  + getStorage() + "      |" + getScreenSpecifications() + "   |"  + getCamera() + "     |" + getCell() + "    |" + getRam() + "      |" + getColor();
      
    }
        else {
        	return getProductName() + "    |"  + getStorage() + "      |" + getScreenSpecifications() + "   |"  + getRam();
        			
        }}}




