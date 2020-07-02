package pom;


import org.openqa.selenium.By;
import utils.Utilities;

public class LoginSahiTest {
    private final By USERNAME = By.name("user");
    private final By PASSWORD = By.name("password");
    private final By LOGIN = By.xpath("//input[@value='Login']");
    private final By MESSAGE = By.id("errorMessage");

    public LoginSahiTest fillData(String strUserName, String strPassword){
        Utilities.type(USERNAME, strUserName);
        Utilities.type(PASSWORD,strPassword);
        return this;
    }

    public LoginSahiTest btnlogIn(){
        Utilities.click(LOGIN);
        return this;
    }

    public LoginSahiTest chckMessage(String message) {
        Utilities.compareText(MESSAGE, message);
        return this;
    }
}
