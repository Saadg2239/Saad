package Tests;

import Pages.AddUserPage;
import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import com.github.javafaker.Faker;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static Pages.PageBase.generateRNumber;


public class AddUserTest extends TestBase{
  //  private final Faker faker = new Faker();
    String loginTestData = "TestData/Data/login.json";
    SoftAssert softAssert = new SoftAssert();
    LoginPage loginPage = new LoginPage(driver);
    AddUserPage addUserPage = new AddUserPage(driver);

    // In AddUserTest class

    @Test(priority = 1, enabled = true)
    public void AddNewUser() {
        loginTests.LoginWithValiedCredentiales();
        Faker faker = new Faker();
        String fullName = faker.name().fullName();
        String userName = faker.name().username().replace(".", "") + faker.number().numberBetween(1000, 9999);
        String code = String.valueOf(faker.number().randomNumber(6, true));
        String email = faker.internet().emailAddress();
        String mobile = faker.phoneNumber().cellPhone().replaceAll("[^0-9]", "");

        addUserPage.getToUserPage()
                .setFullName(fullName)
                .setUserName(userName)
                .setCode(code)
                .setEmail(email)
                .setMobile(mobile)
                .setJob("Supervisor")
                .clickOnSave()
                .assertOnSuccses("The user has been added successfully");
        softAssert.assertAll();
    }
       /* addUserPage.getToUserPage()
                .setFullName()
                .setUserName()
                .setCode()
                .setEmail()
                .setMobile()
                .setJob("Supervisor")
                .clickOnSave()
                .assertOnSuccses("The user has been added successfully");
        softAssert.assertAll();*/
    }

