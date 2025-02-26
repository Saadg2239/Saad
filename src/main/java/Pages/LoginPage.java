package Pages;

import Elements.LoginElements;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;


public class LoginPage extends LoginElements {
    // Constructor
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Step("get to Login")
    public LoginPage clicOnSignUpLoginBtn(){
        click(signUpLoginBtn);
        return this;
    }
    @Step("LOGIN STEP")
    public LoginPage login(){
        setText(emailFiled,"saad@gamal.com");
        setText(passwordFiled,"123456");
        click(loginBtn);
        return this;
    }

    @Step("set user name ")
    public LoginPage setUserName() {
        setText(userNameFiled,"check7");
        return this;
    }
    @Step("set Password ")
    public LoginPage serPassword() {
        setText(passwordFiled2,"P@ssw0rd");
        return this;
    }
    @Step("click on login BTN")
    public LoginPage clickonLogin(){
        click(loginBtn2);
        return this;
    }
    @Step("Assert on Login ")
    public LoginPage assertOnLogin() {
        isDisplayed(usernameAssert);
        return this;
    }
    @Step("set invalied  user name ")
    public LoginPage setInvaliedUserName() {
        setText(userNameFiled,"Saad");
        return this;
    }
    @Step("set Invalied Password ")
    public LoginPage serInvaliedPassword() {
        setText(passwordFiled2,"P@");
        return this;
    }
    @Step("assert On Invalied MSH")
    public LoginPage assertOnInvaliedMsg(String Msg){
        softAssertionEqual(invaliedMSG,Msg);
        return this;
    }
}
