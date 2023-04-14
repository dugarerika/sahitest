package testcases;

import Steps.StepsLogInVendor;
import org.testng.annotations.Test;
import pom.Inventory;

public class TestInventoryVendor {

    StepsLogInVendor objLogin = new StepsLogInVendor();
    String strUrl = "https://vendor.bookr.co/";

    Inventory objInventory = new Inventory();

//    @BeforeMethod
//    public void beforeMethod(){
//        Utilities.openUrl("https://vendor.bookr-dev.com");
//    }
    @Test
    public void testClickOnInventory() {

        objInventory.btnInventory();
        objInventory.btnAddBrand();
    }

    @Test
    public void testClickOnInventory2() {

        objInventory.btnInventory();
        objInventory.btnAddBrand2();
    }

//    @Test
//    public void testClickOnInventory2() {
//        objLogin.testLogInSucessfully();
//        objInventory.btnInventory();
//        objInventory.btnAddProduct();
//    }


//    @AfterMethod
//    public void afterMethod() {
//        Utilities.closeExplorer(); Utilities.closeProcess();
//    }


}
