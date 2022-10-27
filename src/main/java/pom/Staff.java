package pom;

import org.openqa.selenium.By;
import utils.Utilities;

public class Staff {

    private final By STAFF = By.xpath("//*[@id='__next']/div/div/div/ul/div[@aria-label='Staff']");
    private final By ADDBRAND = By.xpath("//button[text()='Add Brand']");
    private final By ADDPRODUCT = By.xpath("//button[text()='Add Product']");
    //private final By MESSAGEERROR = By.xpath("//p[@class='styles_error__1kXZV']");


//    public Inventory fillInventory(String strUserName, String strPassword){
//        Utilities.type(, strUserName);
//        Utilities.type(,strPassword);
//
//        return this;
//    }

    public Staff btnStaff(){
        Utilities.clickWait(STAFF);
        return this;
    }

    public Staff btnAddBrand(){
        Utilities.clickWait(ADDBRAND);
        return this;
    }

    public Staff btnAddProduct(){
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
