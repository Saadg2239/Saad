package Pages;

import Elements.RulesElements;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RulesPage extends RulesElements {
    // Constructor
    public RulesPage(WebDriver driver) {
        super(driver);
    }

    @Step("Click on Add New Rule")
    public RulesElements clickAddNewRule() {
        click(btnAddNewRules);
        return this;
    }

    @Step("Click on Show or Hide Field")
    public RulesElements clickShowOrHideField() {
        click(showOrHideField);
        return this;
    }

    @Step("Click on Enable or Require Field")
    public RulesElements clickEnableOrRequireField() {
        click(enableOrRequireField);
        return this;
    }

    @Step("Click on Field Dropdown")
    public RulesElements clickFieldDropdown() {
        click(fieldDropdown);
        return this;
    }

    @Step("Select Field Dropdown Value")
    public RulesElements selectFieldDropdownValue(String value) {
        click(fieldDropdown);
        click(By.xpath("//li[@aria-label='" + value + "']"));
        return this;
    }

    @Step("Click on State Dropdown")
    public RulesElements clickStateDropdown() {
        click(stateDropdown);
        return this;
    }

    @Step("Select State Dropdown Value")
    public RulesElements selectStateDropdownValue(String value) {
        click(stateDropdown);
        click(By.xpath("//li[@aria-label='" + value + "']"));
        return this;
    }

    @Step("Click on Add Condition")
    public RulesElements clickAddCondition() {
        click(btnAddCondition);
        return this;
    }

    @Step("Click on Action Type Dropdown")
    public RulesElements clickActionTypeDropdown() {
        click(actionTypeDropdown);
        return this;
    }

    @Step("Select Action Type Dropdown Value")
    public RulesElements selectActionTypeDropdownValue(String value) {
        click(actionTypeDropdown);
        click(By.xpath("//li[@aria-label='" + value + "']"));
        return this;
    }

    @Step("Click on Action Target Dropdown")
    public RulesElements clickActionTargetDropdown() {
        click(actionTargetDropdown);
        return this;
    }

    @Step("Select Action Target Dropdown Value")
    public RulesElements selectActionTargetDropdownValue(String value) {
        click(actionTargetDropdown);
        click(By.xpath("//li[@aria-label='" + value + "']"));
        return this;
    }

    @Step("Click on Add Action")
    public RulesElements clickAddAction() {
        click(btnAddAction);
        return this;
    }

    @Step("Click on Cancel")
    public RulesElements clickCancel() {
        click(btnCancel);
        return this;
    }

    @Step("Click on Save")
    public RulesElements clickSave() {
        click(btnSave);
        return this;
    }


}
