package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.LoginSahiTest;
import utils.Utilities;

public class TestLogIn {
    LoginSahiTest objLogin = new LoginSahiTest();

    String[] rightdata = new String[]{
            "test",
            "secret"};

    String[] wrongdata = new String[]{
            "testx",
            "secretx"};

    @BeforeMethod
    public void beforeMethod(){
        Utilities.openUrl("http://sahitest.com/demo/training/login.htm"); }

    @Test
    public void testLogInSucessfully() {
        objLogin.fillData(rightdata[0], rightdata[1]);
        objLogin.btnlogIn();
    }

    @Test
    public void testLogInUnsucessfully() {
        objLogin.fillData(wrongdata[0], wrongdata[1]);
        objLogin.btnlogIn( );
        objLogin.chckMessage("Invalid username or password");
        Utilities.wt( 1000);
    }
    @AfterMethod
    public void afterMethod() {
        Utilities.closeExplorer(); Utilities.closeProcess();
    }
}
