package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.Create;
import utils.Utilities;

public class TestHomeAdmin {
    TestLogInMaster objLogin = new TestLogInMaster();
    Create objCreate = new Create();

    String strUrl = " https://vendor.bookr.co/";

    String[] rightsalon = new String[]{
            "test2",
            "testx",
            "38717484",
            "tests123@gmail.com",
            "1234567890",
            "testx",
            "0",
            "1",
            "123",
            "1"};

    @BeforeMethod
    public void beforeMethod(){
        Utilities.openUrl(strUrl); }

    @Test
    public void testLogCreateButton() {
        objLogin.testLogInSucessfully();
        Utilities.wt( 3000);
        objCreate.btncreate();
        Utilities.wt( 1000);
        objCreate.fillCreate(rightsalon[0], rightsalon[1],rightsalon[2], rightsalon[3],rightsalon[4], rightsalon[5], rightsalon[6],rightsalon[7], rightsalon[8],rightsalon[9],rightsalon[2]);
        Utilities.wt( 1000);
        objCreate.btnSubmit();
        Utilities.wt( 1000);
        objCreate.chckMessage("x");
    }

    @Test
    public void testLogCreateButtonnotgender() {
        objLogin.testLogInSucessfully();
        Utilities.wt( 3000);
        objCreate.btncreate();
        Utilities.wt( 1000);
        objCreate.fillCreateNotGender(rightsalon[0], rightsalon[1],rightsalon[2], rightsalon[3],rightsalon[4], rightsalon[5], rightsalon[6],rightsalon[7], rightsalon[8],rightsalon[9],rightsalon[2]);
        Utilities.wt( 1000);
        objCreate.btnSubmit();
        Utilities.wt( 1000);
        objCreate.chckMessage("x");
    }

    @Test
    public void testLogCreateForm() {
        objLogin.testLogInSucessfully();
        Utilities.wt( 3000);
        objCreate.btncreate();
        Utilities.wt( 1000);
    }

    @AfterMethod
    public void afterMethod() {
        Utilities.closeExplorer(); Utilities.closeProcess();
    }
}
