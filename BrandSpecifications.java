import product.specifications.ScreenSpecifications;

import product.specifications.Ram;
import product.readyType.Phone;
import product.readyType.Notebook;


public class BrandSpecifications {
	 PatikaStore shop;
	    public BrandSpecifications(PatikaStore shop){
	    	
	    	
	        
	        shop.addBrand("Casper");
	        shop.addBrand("HP");
	        shop.addBrand("Monster");

	        
	        Phone cellPhone = new Phone("SAMSUNG Galaxy A51     ", 3199);
	        cellPhone.setStorage(" 128 ");
	        shop.addProduct("Samsung", cellPhone);
	        cellPhone.setScreenSpecifications(" 6.5  ");
	        cellPhone.setCamera(" 32 ");
	        cellPhone.setCell(" 4000.0 ");
	        cellPhone.setRam(" 6  ");
	        cellPhone.setColor(" Siyah ");
	        
	        Notebook notebook = new Notebook("HUAWEİ Matebook 14     ", 7000);
	        notebook.setScreenSpecifications(" " + ScreenSpecifications.inch14 + " ");
	        notebook.setRam(" " + Ram.GB16);
	        notebook.setStorage(" 512 ");
	        shop.addProduct("Huawei ", notebook);


	        cellPhone = new Phone("Iphone 11              ", 7379);
	        cellPhone.setStorage(" 64  ");
	        shop.addProduct("Apple  ", cellPhone);
	        cellPhone.setScreenSpecifications(" 6.1  ");
	        cellPhone.setCamera(" 5  ");
	        cellPhone.setCell(" 3046.0 ");
	        cellPhone.setRam(" 6  ");
	        cellPhone.setColor(" Mavi  ");
	        
	        notebook = new Notebook("LENOVO V14 IGL         ", 3699);
	        notebook.setScreenSpecifications(" " + ScreenSpecifications.inch14 + " ");
	        notebook.setRam(" " + Ram.GB8 + " ");
	        notebook.setStorage(" 1024");
	        shop.addProduct("Lenovo ", notebook);
	        
	        notebook = new Notebook("ASUS Tuf Gaming        ", 8199);
	        notebook.setScreenSpecifications(" " + ScreenSpecifications.inch15 + " ");
	        notebook.setRam(" " + Ram.GB32);
	        notebook.setStorage(" 2048");
	        shop.addProduct("Asus   ", notebook);
	        
	        

	        cellPhone = new Phone("Red Mi Note 10 Pro     ", 4012);
	        cellPhone.setStorage(" 128 ");
	        shop.addProduct("Xiaomi ", cellPhone);
	        cellPhone.setScreenSpecifications(" 6.5  ");
	        cellPhone.setCamera(" 35 ");
	        cellPhone.setCell(" 4000.0 ");
	        cellPhone.setRam(" 12 ");
	        cellPhone.setColor(" Beyaz ");

	    }

}
