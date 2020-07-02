package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.RegisterSahiTest;
import utils.Utilities;

public class TestRegister {
        RegisterSahiTest objRegister = new RegisterSahiTest();

        String[] infoForm = new String[]{
                "test",
                "secret",
                "31723 Summit Springs, Spring, TX, 77386",
                "31723 Summit Springs, Spring, TX, 77386",
                "Kerala"};

        @BeforeMethod
        public void beforeMethod(){
            Utilities.openUrl("http://sahitest.com/demo/training/login.htm"); }

        @Test
        public void testRegisterCancelled() {
            objRegister.fillForm(infoForm[0], infoForm[1], infoForm[2], infoForm[3], infoForm[4]);
            objRegister.btnCancel();
            Utilities.isAlertPresent();
            Utilities.closeAlert();
        }

        @Test
        public void testRegisterSucessfully() {
            objRegister.fillForm(infoForm[0], infoForm[1], infoForm[2], infoForm[3], infoForm[4]);
            objRegister.btnRegister();
            Utilities.isAlertPresent();
            Utilities.closeAlert();
        }

        @Test
        public void testBack2Login() {
            objRegister.fillForm(infoForm[0], infoForm[1], infoForm[2], infoForm[3], infoForm[4]);
            objRegister.lnkbckToLogin();
        }

        @AfterMethod
        public void afterMethod() {
            Utilities.closeExplorer(); Utilities.closeProcess();
        }
}
