package Tests;

import Pages.LoginPage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static Utils.JsonReader.TestJson.getJson;


/**
 * This class contains tests for the login functionality.
 */
public class LoginTests extends TestBase {
    String loginTestData = "TestData/Data/login.json";
    SoftAssert softAssert = new SoftAssert();
    LoginPage loginPage = new LoginPage(driver);

    /**
     * This test verifies the login functionality with valid credentials using Azure.
     * It performs the login process and asserts that the user is redirected to the dashboard page.
     */
@Test(priority = 1,enabled = true)
    public void LoginWithValiedCredentiales(){
    loginPage.setUserName()
            .serPassword()
            .clickonLogin()
            .assertOnLogin();
    softAssert.assertAll();
}
@Test(priority =2,enabled = true)
    public  void LoginWithInvaliedCredeintials(){
    loginPage.setInvaliedUserName()
            .serInvaliedPassword()
            .clickonLogin()
            .assertOnInvaliedMsg("Invalid username or password");
    softAssert.assertAll();
}
}