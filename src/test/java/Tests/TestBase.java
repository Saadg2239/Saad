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
    public AddItemToCartAndProcessedTests addItemToCartAndProcessedTests;
    public SurveysPage surveysPage;
   // public SurveysTests surveysTests;


    @BeforeTest
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
               // .addArguments("--incognito");
        // .addArguments("--headless");
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        String url = "https://automationexercise.com/";
        driver.navigate().to(url);

        loginPage = new LoginPage(driver);
        loginTests = new LoginTests();
        addItemToCartAndProcessedTests = new AddItemToCartAndProcessedTests();
        //dashboardPage = new DashboardPage(driver);
        //surveysTests = new SurveysTests();
        surveysPage = new SurveysPage(driver);
    }

   @AfterTest
   public void tearDown() {
       try {
           Thread.sleep(10000); // Wait for 10 seconds before quitting
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
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