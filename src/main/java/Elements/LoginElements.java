package Elements;

import Pages.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginElements extends PageBase {
    // Constructor
    public LoginElements(WebDriver driver) {
        super(driver);
    }

    public By userNameFiled = By.id("login-email");
    public By passwordFiled = By.id("login-password");
    public By loginBtn = By.id("trigger-spinner");
    public By usernameAssert = By.xpath("//div[text()='Check77']");
    public By invaliedMSG = By.xpath("//span[text()='Invalid username or password']");

}
