package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.LoginMaster;
import pom.Create;
import utils.Utilities;

public class TestHomeAdmin {
    LoginMaster objLogin = new LoginMaster();
    Create objCreate = new Create();

    String strUrl = "https://master.bookr.co/";


    String[] rightdata = new String[]{
            "zaina",
            "bookr.co1o"};

    String[] wrongdata = new String[]{
            "testx",
            "secretx"};

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
        objLogin.fillLogin(rightdata[0], rightdata[1]);
        objLogin.btnlogIn();
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
        objLogin.fillLogin(rightdata[0], rightdata[1]);
        objLogin.btnlogIn();
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
        objLogin.fillLogin(rightdata[0], rightdata[1]);
        objLogin.btnlogIn();
        Utilities.wt( 3000);
        objCreate.btncreate();
        Utilities.wt( 1000);

    }

    @AfterMethod
    public void afterMethod() {
        Utilities.closeExplorer(); Utilities.closeProcess();
    }
}
