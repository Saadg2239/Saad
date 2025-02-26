package Elements;

import Pages.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginElements extends PageBase {
    // Constructor
    public LoginElements(WebDriver driver) {
        super(driver);
    }

    public By signUpLoginBtn = By.xpath("//a[text()=' Signup / Login']");
    public By emailFiled = By.xpath("(//input[@placeholder='Email Address'])[1]");
    public By passwordFiled = By.xpath("(//input[@placeholder='Password'])[1]");
    public By loginBtn = By.xpath("//button[text()='Login']");
    public By userNameFiled = By.id("login-email");
    public By passwordFiled2 = By.id("login-password");
    public By loginBtn2 = By.id("trigger-spinner");
    public By usernameAssert = By.xpath("//div[text()='Check7']");
    public By invaliedMSG = By.xpath("//span[text()='Invalid username or password']");

}
