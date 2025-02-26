package Pages;

import Elements.AddItemToCartAndProcessed;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class AddItemToCartAndProcessedPage extends AddItemToCartAndProcessed {
    public AddItemToCartAndProcessedPage(WebDriver driver) {
        super(driver);
    }


   /* @Step("Get User Page")
    public AddItemToCartAndProcessedPage getToUserPage(){
        click(usersBtn);
        click(addUserIcon);
        return this;
    }
    @Step("set Full name ")
    public AddItemToCartAndProcessedPage setFullName(String name) {

        setText(newUserName, name);

        return this;

    }
    @Step("set user name ")
    public AddItemToCartAndProcessedPage setUserName(String userName) {
        setText(newUserUserName,userName);
        return this;
    }
    @Step("set code")
    public AddItemToCartAndProcessedPage setCode(String code) {
        setText(newUserCode,code);
        return this;
    }
    @Step("set Email ")
    public AddItemToCartAndProcessedPage setEmail(String email) {
        setText(newUserEmail,email);
        return this;
    }
    @Step("set Mobile ")
    public AddItemToCartAndProcessedPage setMobile(String phone) {
        setText(newUserMobile,phone);
        return this;
    }
    @Step("set Job ")
    public AddItemToCartAndProcessedPage setJob(String job) {
        click(jobArrow);
        selectJobChoice = By.xpath("//li[text()='"+job+"']");
        click(selectJobChoice);
      //  setText(,"12345678910");
        return this;
    }
    @Step("click on save Btn")
    public AddItemToCartAndProcessedPage clickOnSave(){
        click(saveBtn);
        return  this;
    }
    @Step("assert on success Msg")
    public AddItemToCartAndProcessedPage assertOnSuccses(String Msg){
        softAssertionEqual(succsesMsg,Msg);
        return this ;
    }*/
    @Step("Scroll to item")
    public AddItemToCartAndProcessedPage scrollToItem(){
        scrollElement(addCartBtn);
        click(addCartBtn);
        return this;
    }
    @Step("View Cart")
    public AddItemToCartAndProcessedPage viewCart(){
        click(viewCartBtn);
        return this;
    }
    @Step("Proceed To Checkout")
    public AddItemToCartAndProcessedPage proceedToCheckout(){
        click(proceedToCheckBtn);
        return this;
    }
    @Step("Scroll To Place ORDER")
    public AddItemToCartAndProcessedPage scrollToPlaceOrder(){
        scrollElement(placeOrderBtn);
        click(placeOrderBtn);
        return this ;
    }
    @Step("payment info")
    public AddItemToCartAndProcessedPage addPayment(){
        setText(nameOnCardField,"saad");
        setText(cardNumberFiled,"123456789101112");
        setText(cvcField,"321");
        setText(expirationFiled,"09");
        setText(expirationYearFiled,"2027");
        click(confirmOrder);
        return this;
    }
    @Step("assert on congratulation mssg")
    public AddItemToCartAndProcessedPage assertOnCongMsg(String msg){
        softAssertionEqual(congrtulationMesg,msg);
        return this;
    }




}
