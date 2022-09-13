package pom;
import org.openqa.selenium.By;
import utils.Utilities;

public class LoginVendor{
    private final By USERNAME = By.xpath("//input[@name='username']");
    private final By PASSWORD = By.xpath("//input[@name='password']");
    private final By LOGIN = By.xpath("//button[text()='Sign in']");
    private final By MESSAGEUSERNAME = By.id("mui-1-helper-text");
    private final By MESSAGEPWD = By.id("mui-2-helper-text");
    private final By MESSAGEERROR = By.xpath("//p[@class='styles_error__1kXZV']");


    public LoginVendor fillLogin(String strUserName, String strPassword){
        Utilities.type(USERNAME, strUserName);
        Utilities.type(PASSWORD,strPassword);
        return this;
    }

    public LoginVendor btnlogInVendor(){
        Utilities.click(LOGIN);
        return this;
    }

    public LoginVendor chckMessageVendor(String message1, String message2 ) {
        Utilities.compareText(MESSAGEUSERNAME, message1);
        Utilities.compareText(MESSAGEPWD, message2);
        return this;
    }

    public LoginVendor chckMessageError(String message3) {
        Utilities.compareText(MESSAGEERROR, message3);
        return this;
    }
}
