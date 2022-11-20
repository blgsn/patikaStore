import product.ProductType;

import product.readyType.Phone;
import product.readyType.Notebook;

import java.util.Scanner;
public class UserManagement {
	private Scanner input;
    private PatikaStore shop;
    private Boolean exit = false;
    public UserManagement(PatikaStore shop){
        input = new Scanner(System.in);
        this.shop = shop;
        while(!exit){
            getMenu();
            performSelection(getSelection());
        }

    }

    public void getMenu(){
        System.out.println("PatikaStore Ürün Yönetim Paneli !\n" +
                "1 - Notebook İşlemleri\n" +
                "2 - Cep Telefonu İşlemleri\n" +
                "3 - Marka Listele\n" +
                "0 - Çıkış Yap" +
                "\n\n\n");
    }
    public String getSelection(){
        String result;
        System.out.print("Tercihiniz : ");
        result = input.nextLine();
        return result;
    }

    public void performSelection(String selection){
        clear();
        switch(selection){
            case "0":
                this.exit = true;
                break;
            case "1":
                while(!menuNotebook());
                break;
            case "2":
                while(!menuCellPhone());
                break;
            case "3":
                shop.listBrands();
                enterToContinue();
                break;
        }
        clear();

    }

    public Boolean menuNotebook(){
        Boolean result = false;
        System.out.println("Notebook Yönetim Paneli !\n" +
                "1 - Notebook ekle\n" +
                "2 - Notebook Listele\n" +
                "0 - Ana Menü" +
                "\n\n\n");
        String selection = getSelection();
        switch (selection) {
            case "0":
                result = true;
                break;
            case "1":
                addNotebookProduct();
                result = false;
                break;
            case "2":
                clear();
                shop.listProducts(ProductType.Notebook);
                enterToContinue();
                result = false;
                break;
        }
        clear();
        return result;
    }

    public Boolean menuCellPhone(){
        Boolean result = false;
        System.out.println("Cep Telefonu Yönetim Paneli !\n" +
                "1 - Cep Telefonu ekle\n" +
                "2 - Cep Telefonu Listele\n" +
                "0 - Ana Menü" +
                "\n\n\n");
        String selection = getSelection();
        switch (selection) {
            case "0":
                result = true;
                break;
            case "1":
                result = false;
                addCellPhoneProduct();
                break;
            case "2":
                clear();
                shop.listProducts(ProductType.Phone);
                enterToContinue();
                result = false;
                break;
        }
        clear();
        return result;
    }

    public void addCellPhoneProduct(){
        System.out.println("Ürünün markasını, modelini ve fiyatını aralarına ',' koyarak yazınız");
        System.out.println("Örnek: X Marka, red mi note 10 pro");
        System.out.print("Giriş: ");
        String[] productData = input.nextLine().split(",");
        shop.addProduct(productData[0].trim(), new Phone(productData[1].trim(), Integer.parseInt(productData[2].trim())));
    }

    public void addNotebookProduct(){
        System.out.println("Ürünün markasını, modelini ve fiyatını aralarına ',' koyarak yazınız");
        System.out.println("Örnek: X Marka, Lenovo V16");
        System.out.print("Giriş: ");
        String[] productData = input.nextLine().split(",");
        shop.addProduct(productData[0].trim(), new Notebook(productData[1].trim(), Integer.parseInt(productData[2].trim())));
    }

    public void clear(){
        for (int i = 0; i < 20; i++){
            System.out.println("");
        }
    }
    public void enterToContinue(){
        System.out.print("Geri dönmek için Enter'a basın.");
        input.nextLine();
    }

}
