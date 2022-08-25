package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.LoginMaster;
import utils.Utilities;

public class TestLogInMaster {
    LoginMaster objLogin = new LoginMaster();

    String[] rightdata = new String[]{
            "zaina",
            "bookr.co1o"};

    String[] wrongdata = new String[]{
            "testx",
            "secretx"};

    @BeforeMethod
    public void beforeMethod(){
        Utilities.openUrl("https://master.bookr.co"); }

    @Test
    public void testLogInSucessfully() {
        objLogin.fillLogin(rightdata[0], rightdata[1]);
        objLogin.btnlogIn();
        Utilities.wt( 1000);
    }

    @Test
    public void testLogInUnsucessfully() {
        objLogin.fillLogin(wrongdata[0], wrongdata[1]);
        objLogin.btnlogIn( );
        Utilities.wt( 1000);
        objLogin.chckMessage("x");

    }
    @AfterMethod
    public void afterMethod() {
        Utilities.closeExplorer(); Utilities.closeProcess();
    }
}
