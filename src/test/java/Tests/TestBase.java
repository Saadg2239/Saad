package Tests;

import Pages.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

import java.util.ArrayList;


@Listeners({Utils.ListenerTest.class})
public class TestBase {
    public WebDriver driver;
    public LoginPage loginPage;
    //public DashboardPage dashboardPage;
    public LoginTests loginTests;
    public AddUserTest addUserTest;
    public SurveysPage surveysPage;
    public SurveyBuilder surveyBuilder;
   // public SurveysTests surveysTests;
    public RulesPage rulesPage;
    public SettingsPage settingsPage;


    @BeforeTest
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
               // .addArguments("--incognito");
        // .addArguments("--headless");
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        String url = "http://youxeldev.eastus.cloudapp.azure.com/Check/Portal/Account/Login";
        driver.navigate().to(url);

        loginPage = new LoginPage(driver);
        loginTests = new LoginTests();
        addUserTest = new AddUserTest();
        //dashboardPage = new DashboardPage(driver);
        //surveysTests = new SurveysTests();
        surveysPage = new SurveysPage(driver);
        surveyBuilder = new SurveyBuilder(driver);
        rulesPage = new RulesPage(driver);
        settingsPage = new SettingsPage(driver);
    }

   @AfterTest
    public void tearDown() {
        driver.quit();
    }

    public void switchTab() {
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    }

    public void refresh() {
        driver.navigate().refresh();

    }

}