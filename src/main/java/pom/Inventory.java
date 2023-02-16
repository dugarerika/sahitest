package pom;

import org.openqa.selenium.By;
import utils.Utilities;

import java.util.Objects;

public class Inventory {

    private final By INVENTORY = By.xpath("//div[@aria-label='Inventory']");
    private final By HEADER = By.xpath("//header/div/div/div[@class]");
    private final By ADDBRAND = By.xpath("//button[text()='Add Brand']");
    private final By MNGBRANDEDIT = By.xpath("//span[text()='LOL']//following-sibling::div/button[@aria-label='Edit']/i");
    private final By MNGBRANDDELETE = By.xpath("//span[text()='LOL']//following-sibling::div/button[@aria-label='Delete']/i");
    private final By BRANDDELETE = By.xpath("//*/button[text()='Delete']");
//    private final By BRANDACEPTE = By.xpath("//*/button[text()='Delete']");
    private final By MNGBRANDCLOSE = By.xpath("//div[3]/div/button/i[@class='fal fa-times']");
    private final By ADDPRODUCT = By.xpath("//button[text()='Add Product']");

    // Add product form
    private final By PRODUCTNAME = By.xpath("//div/label[text()='Product Name']//following-sibling::div/input");
    private final By PRODUCTBRAND = By.xpath("//div[text()='Select the brand of the product']//following-sibling::div");
    private final By PRODUCTCATEGORY = By.xpath("//div[text()='Select the category of the product']//following-sibling::div");
    private final By PRODUCTQUANTITY = By.xpath("//div/label[text()='Product Quantity']//following-sibling::div/input");
    private final By PRODUCTSKU = By.xpath("//div/label[text()='Product SKU']//following-sibling::div/input");
    private final By PRODUCTPRICE = By.xpath("//div/label[text()='Price']//following-sibling::div/input");
    private final By EXPECTEDMSG = By.xpath("//div[@role='alert']//child::div//following-sibling::div");
    private final By SUBMIT = By.xpath("//button[text()='Submit']");
    private final By CLOSEPRODUCT = By.xpath("//div[@role='dialog']/button/i[@class='fal fa-times']");

    private final By ADDPRODSUBMIT = By.xpath("//button[text() = 'Submit']");
    private final By MESSAGEERROR = By.xpath("//p[@class='styles_error__1kXZV']");


//    public Inventory fillInventory(String strUserName, String strPassword){
//        Utilities.type(, strUserName);
//        Utilities.type(,strPassword);
//
//        return this;
//    }

    public Inventory btnCloseAddForm(){
        Utilities.wt( 10);
        Utilities.clickWait(CLOSEPRODUCT);
        return this;
    }

    public Inventory btnInventory(){
        Utilities.wt( 10);
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

    public Inventory btnAddProductSubmit(){
        Utilities.clickWait(SUBMIT);
        Utilities.wt( 1000);
        return this;
    }

    public Inventory chckExpectedMsg(String ExpectedMessage) {
        Utilities.isElementPresent(EXPECTEDMSG);
        Utilities.compareText(EXPECTEDMSG, ExpectedMessage);
        return this;
    }

    public Inventory fillForm(String ProductName, String ProductBrand, String ProductCategory, String ProductQuantity, String ProductSKU, String Price){
        Utilities.type(PRODUCTNAME, ProductName);
        Utilities.type(PRODUCTSKU, ProductSKU);
        Utilities.type(PRODUCTQUANTITY, ProductQuantity);
        Utilities.type(PRODUCTPRICE, Price);
        System.out.println(ProductBrand);
        System.out.println(ProductCategory);
        if (!Objects.equals(ProductBrand, "")) Utilities.clickEnter(PRODUCTBRAND);
        if (!Objects.equals(ProductCategory, "")) Utilities.clickEnter(PRODUCTCATEGORY);
        return this;
    }

    public Inventory chckMessage(String message1) {
        Utilities.isElementPresent(HEADER);
        Utilities.wt( 2000);
        Utilities.compareText(HEADER, message1);
        return this;
    }

//    public Inventory chckMessageError(String message3) {
//        Utilities.compareText(MESSAGEERROR, message3);
//        return this;
//    }
}
