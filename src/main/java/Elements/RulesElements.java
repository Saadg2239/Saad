package Elements;

import Pages.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RulesElements extends PageBase {
    // Constructor
    public RulesElements(WebDriver driver) {
        super(driver);
    }

    public By btnAddNewRules = By.xpath("//dfb-button[@icon='dfb-icon-add-outline']//button");
    public By showOrHideField = By.xpath("(//div[contains(@class, 'dfb-rules-actions-list')]//ul//li)[1]");
    public By enableOrRequireField = By.xpath("(//div[contains(@class, 'dfb-rules-actions-list')]//ul//li)[2]");
    public By fieldDropdown = By.xpath("//dfb-dropdown[@formcontrolname='field']");
    public By stateDropdown = By.xpath("//dfb-dropdown[@formcontrolname='state']");
    public By btnAddCondition = By.xpath("//div[@formarrayname='conditions']//dfb-link-button");
    public By actionTypeDropdown = By.xpath("//dfb-dropdown[@formcontrolname='actionType']");
    public By actionTargetDropdown = By.xpath("//dfb-dropdown[@formcontrolname='actionTarget']");
    public By btnAddAction = By.xpath("//div[@formarrayname='actions']//dfb-link-button");
    public By btnCancel = By.xpath("(//div[@class='footer']//p-button[contains(@class,  'dfb-button')])[1]");
    public By btnSave = By.xpath("(//div[@class='footer']//p-button[contains(@class,  'dfb-button')])[2]");
}
