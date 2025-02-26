package Elements;

import Pages.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddItemToCartAndProcessed extends PageBase {
    public AddItemToCartAndProcessed(WebDriver driver) {
        super(driver);
    }
    /*public By usersBtn = By.xpath("//a[@href='/Check/Portal/Users/Index']");
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
    public By succsesMsg = By.xpath("//div[text()='The user has been added successfully']");*/
    public By addCartBtn = By.xpath("(//a[@data-product-id='11'])[1]");
    public By viewCartBtn =By.xpath("//u[text()='View Cart']");
    public By proceedToCheckBtn = By.xpath("//a[text()='Proceed To Checkout']");
    public By placeOrderBtn = By.xpath("//a[text()='Place Order']");
    public By nameOnCardField = By.xpath("//input[@name='name_on_card']");
    public By cardNumberFiled = By.xpath("//input[@name='card_number']");
    public By cvcField = By.xpath("//input[@name='cvc']");
    public By expirationFiled = By.xpath("//input[@name='expiry_month']");
    public By expirationYearFiled = By.xpath("//input[@name='expiry_year']");
    public By confirmOrder = By.xpath("//button[text()='Pay and Confirm Order']");
    public By congrtulationMesg = By.xpath("//p[text()='Congratulations! Your order has been confirmed!']");


}
