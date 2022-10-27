package pom;

import org.openqa.selenium.By;
import utils.Utilities;

public class Inventory {

    private final By INVENTORY = By.xpath("//*[@id='__next']/div/div/div/ul/div[@aria-label='Inventory']");
    private final By ADDBRAND = By.xpath("//button[text()='Add Brand']");
    private final By MNGBRANDEDIT = By.xpath("//*/button/i[@class='fal fa-edit fa-xs']");
    private final By MNGBRANDDELETE = By.xpath("/html/body/div[5]/div[3]/div/div[2]/div/div[2]/div/button[2]/i");
    private final By BRANDDELETE = By.xpath("//*/button[text()='Delete']");
    private final By MNGBRANDCLOSE = By.xpath("//div[3]/div/button/i[@class='fal fa-times']");

    private final By ADDPRODUCT = By.xpath("//button[text()='Add Product']");
    //private final By MESSAGEERROR = By.xpath("//p[@class='styles_error__1kXZV']");


//    public Inventory fillInventory(String strUserName, String strPassword){
//        Utilities.type(, strUserName);
//        Utilities.type(,strPassword);
//
//        return this;
//    }

    public Inventory btnInventory(){
        Utilities.clickWait(INVENTORY);
        return this;
    }

    public Inventory btnAddBrand(){
        Utilities.clickWait(ADDBRAND);
        Utilities.clickWait(MNGBRANDCLOSE);
        return this;
    }

    public Inventory btnAddBrand2(){
        Utilities.clickWait(ADDBRAND);
        Utilities.clickWait(MNGBRANDDELETE);
        Utilities.clickWait(BRANDDELETE);
        return this;
    }
    public Inventory btnAddProduct(){
        Utilities.clickWait(ADDPRODUCT);
        return this;
    }

//    public Inventory chckMessageVendor(String message1, String message2 ) {
//        Utilities.compareText(MESSAGEUSERNAME, message1);
//        Utilities.compareText(MESSAGEPWD, message2);
//        return this;
//    }

//    public Inventory chckMessageError(String message3) {
//        Utilities.compareText(MESSAGEERROR, message3);
//        return this;
//    }
}
