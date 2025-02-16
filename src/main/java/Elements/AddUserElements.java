package Elements;

import Pages.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddUserElements extends PageBase {
    public AddUserElements(WebDriver driver) {
        super(driver);
    }
    public By usersBtn = By.xpath("//a[@href='/Check/Portal/Users/Index']");
    public By addUserIcon = By.xpath("//span[@class='icon icon-add']");
    public By newUserName =By.xpath("//input[@class='form-control'and@id='FullName']");
    public By newUserUserName = By.xpath("//input[@class='form-control'and@id='Username']");
    public By newUserCode = By.xpath("//input[@class='form-control'and@id='UserCode']");
    public By newUserEmail = By.xpath("//input[@class='form-control'and@id='Email']");
    public By newUserMobile = By.xpath("//input[@class='form-control'and@id='Mobile']");
    public By jobArrow = By.xpath("(//b[@role='presentation'])[1]");
    public By selectJobChoice;
    public By saveBtn = By.xpath("//label[@id='create-activity']");
    public By cancelBtn = By.xpath("//a[text()='Cancel']");
    public By succsesMsg = By.xpath("//div[text()='The user has been added successfully']");



}
