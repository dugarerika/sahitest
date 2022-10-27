package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.LoginVendor;
import utils.Utilities;

public class TestLogInVendor {

    LoginVendor objLogin = new LoginVendor();

    String[] rightdata = new String[]{
            "testsalon",
            "testsalon1o"};

    String[] wrongdata = new String[]{
            "testx",
            "secretx"};

    @BeforeMethod
    public void beforeMethod(){
        Utilities.openUrl("https://vendor.bookr-dev.com"); }

    @Test
    public void testLogInSucessfully() {
        objLogin.fillLogin(rightdata[0], rightdata[1]);
        objLogin.btnlogInVendor();
    }

    @Test
    public void testLogInUnsucessfully1() {
        objLogin.fillLogin(wrongdata[0], wrongdata[1]);
        objLogin.btnlogInVendor( );
        Utilities.wt( 1000);
        objLogin.chckMessageError("['The email and password combination is incorrect']");

    }

    @Test
    public void testLogInunSucessfully2() {
        objLogin.btnlogInVendor();
        Utilities.wt( 1000);
        objLogin.chckMessageVendor("username address is required","is required");
    }

    @AfterMethod
    public void afterMethod() {
        Utilities.closeExplorer(); Utilities.closeProcess();
    }


}
