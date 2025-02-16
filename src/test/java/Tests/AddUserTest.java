package Tests;

import Pages.AddUserPage;
import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AddUserTest extends TestBase{
    String loginTestData = "TestData/Data/login.json";
    SoftAssert softAssert = new SoftAssert();
    LoginPage loginPage = new LoginPage(driver);
    AddUserPage addUserPage = new AddUserPage(driver);

    @Test(priority = 1,enabled = true)
    public void AddNewUser(){
        loginTests.LoginWithValiedCredentiales();
        addUserPage.getToUserPage()
                .setFullName()
                .setUserName()
                .setCode()
                .setEmail()
                .setMobile()
                .setJob("Supervisor")
                .clickOnSave()
                .assertOnSuccses("The user has been added successfully");
        softAssert.assertAll();
    }

}
