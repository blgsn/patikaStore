package product.specifications;
//specifications of screen
public enum ScreenSpecifications {
	inch14("14.0"),
    inch15("15.6");

    private final String screen;
    ScreenSpecifications(String screen){
        this.screen = screen;
    }

    @Override
    public String toString(){
        return this.screen;
    }

}
