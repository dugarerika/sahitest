package pom;

import org.openqa.selenium.By;
import utils.Utilities;

public class Inventory {

    private final By INVENTORY = By.xpath("//div[@aria-label='Inventory']");
    private final By ADDBRAND = By.xpath("//button[text()='Add Brand']");
    private final By ADDBRANICON = By.xpath("//div/div/div[@role]/div/button");
    //private final By MESSAGEERROR = By.xpath("//p[@class='styles_error__1kXZV']");


    public Inventory fillInventory(String strUserName, String strPassword){
        Utilities.type(, strUserName);
        Utilities.type(,strPassword);

        return this;
    }

    public Inventory btnInventory(){
        Utilities.click(INVENTORY);
        return this;
    }

    public Inventory btnAddBrand(){
        Utilities.click(ADDBRAND);
        return this;
    }

    public Inventory btnAddBrandIcon(){
        Utilities.click(ADDBRANICON);
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
