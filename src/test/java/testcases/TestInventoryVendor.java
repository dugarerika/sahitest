package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom.Inventory;
import pom.LoginVendor;
import utils.Utilities;

public class TestInventoryVendor {

    TestLogInVendor objLogin = new TestLogInVendor();
    String strUrl = "https://master.bookr-dev.com";

    Inventory objInventory = new Inventory();

    @BeforeMethod
    public void beforeMethod(){
        Utilities.openUrl("https://vendor.bookr-dev.com");
    }
    @Test
    public void testClickOnInventory() {
        objLogin.testLogInSucessfully();
        objInventory.btnInventory();
        objInventory.btnAddBrand();
    }

    @Test
    public void testClickOnInventory2() {
        objLogin.testLogInSucessfully();
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
