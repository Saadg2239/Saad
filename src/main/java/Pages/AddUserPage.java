package Pages;

import Elements.AddUserElements;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddUserPage extends AddUserElements {
    public AddUserPage(WebDriver driver) {
        super(driver);
    }


    @Step("Get User Page")
    public AddUserPage getToUserPage(){
        click(usersBtn);
        click(addUserIcon);
        return this;
    }
    @Step("set Full name ")
    public AddUserPage setFullName() {
        setText(newUserName,"Saad Gamal");
        return this;
    }
    @Step("set user name ")
    public AddUserPage setUserName() {
        setText(newUserUserName,"Saad22398");
        return this;
    }
    @Step("set code")
    public AddUserPage setCode() {
        setText(newUserCode,"22398");
        return this;
    }
    @Step("set Email ")
    public AddUserPage setEmail() {
        setText(newUserEmail,"sgamal@youxel.com");
        return this;
    }
    @Step("set Mobile ")
    public AddUserPage setMobile() {
        setText(newUserMobile,"12345678910");
        return this;
    }
    @Step("set Job ")
    public AddUserPage setJob(String job) {
        click(jobArrow);
        selectJobChoice = By.xpath("//li[text()='"+job+"']");
        click(selectJobChoice);
      //  setText(,"12345678910");
        return this;
    }
    @Step("click on save Btn")
    public AddUserPage clickOnSave(){
        click(saveBtn);
        return  this;
    }
    @Step("assert on success Msg")
    public AddUserPage assertOnSuccses(String Msg){
        softAssertionEqual(succsesMsg,Msg);
        return this ;
    }




}
