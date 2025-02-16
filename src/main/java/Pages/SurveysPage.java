package Pages;

import Elements.SurveysElements;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SurveysPage extends SurveysElements {
    // Constructor
    public SurveysPage(WebDriver driver) {
        super(driver);
    }

    /////////////////////// New Survey Modal Actions & Assertions\\\\\\\\\\\\\\\\\\\\\\
    @Step("Click on New Survey")
    public SurveysPage clickNewSurvey() {
        click(btnNewSurvey);
        return this;
    }

    @Step("Click on New Survey on Mobile View")
    public SurveysPage clickNewSurveyOnMobile() {
        click(btnNewSurveyOnMobile);
        return this;
    }

    @Step("Set Survey Title")
    public SurveysPage setSurveyTitle(String title) {
        setText(txtSurveyTitle, title);
        return this;
    }

    @Step("Click Create Survey")
    public SurveysPage clickCreateSurvey() {
        click(btnCreate);
        return this;
    }

    @Step("Click Cancel Survey")
    public SurveysPage clickCancelSurvey() {
        click(btnCancel);
        return this;
    }

    @Step("Search for a Survey")
    public SurveysPage searchForASurvey(String surveyTitle) {
        setText(searchBar, surveyTitle);
        return this;
    }
    @Step("Click on the close icon")
    public SurveysPage clickCloseIcon() {
        click(searchCloseIcon);
        return this;
    }
    @Step("Assert Survey Title")
    public SurveysPage assertSurveyTitle(String title) {
        softAssertionEqual(getFirstSearchResult(title), title);
        return this;
    }
    @Step("Click on first survey title")
    public SurveysPage clickOnFirstSurveyTitle(String title) {
        click(getFirstSearchResult(title));
        return this;
    }

    @Step("Assert Survey Builder Tabs are Displayed")
    public SurveysPage assertSurveyBuilderTabsArePresent() {
        isDisplayed(surveyBuilderTabs);
        return this;
    }

    @Step("Assert the status of the survey")
    public SurveysPage assertSurveyStatus(String surveyName, String status) {
        softAssertionContain(getFirstSearchResultStatus(surveyName), status);
        return this;
    }

    @Step("Click on Survey Three Vertical Dots")
    public SurveysPage clickSurveyThreeVerticalDots(String surveyName) {
        clickElementWithStaleElementHandling(getSurveyThreeVerticalDots(surveyName));
        return this;
    }

    @Step("Click Edit Option")
    public SurveysPage clickEditOption() {
        click(editOption);
        return this;
    }

    @Step("Click Preview Option")
    public SurveysPage clickPreviewOption() {
        click(previewOption);
        return this;
    }

    @Step("Click Settings Option")
    public SurveysPage clickSettingsOption() {
        click(settingsOption);
        return this;
    }

    @Step("Click Duplicate Option")
    public SurveysPage clickDuplicateOption() {
        click(duplicateOption);
        return this;
    }

    @Step("Click Archive Option")
    public SurveysPage clickArchiveOption() {
        click(archiveOption);
        return this;
    }

    @Step("Click Delete Option")
    public SurveysPage clickDeleteOption() {
        click(deleteOption);
        return this;
    }

    @Step("Click Distribution Option")
    public SurveysPage clickDistributionOption() {
        click(distributionOption);
        return this;
    }

    /////////////////////// Side Menu Actions \\\\\\\\\\\\\\\\\\\\\\
    @Step("Click All Surveys Tab")
    public SurveysPage clickAllSurveysTab() {
        click(allSurveysTab);
        return this;
    }

    @Step("Click New Folder")
    public SurveysPage clickNewFolder() {
        click(btnNewFolder);
        return this;
    }

    @Step("Click Archive Tab")
    public SurveysPage clickArchiveTab() {
        click(archiveTab);
        return this;
    }

    @Step("Click Trash Tab")
    public SurveysPage clickTrashTab() {
        click(trashTab);
        return this;
    }

    /////////////////////// Filter Actions \\\\\\\\\\\\\\\\\\\\\\
    @Step("Click Filter Icon")
    public SurveysPage clickFilterIcon() {
        click(iconFilter);
        return this;
    }

    @Step("Set Filter by Survey Title")
    public SurveysPage setFilterBySurveyTitle(String title) {
        setText(txtFilterBySurveyTitle, title);
        return this;
    }

    @Step("Set Filter by Status")
    public SurveysPage setFilterByStatus(String status) { // Active, Inactive, Expired
        click(statusDropdown);
        click(By.xpath("li[@aria-label='" + status + "']"));
        click(btnApply);
        return this;
    }

    @Step("Set Filter by Questions")
    public SurveysPage setFilterByQuestions(String operator, int number) { // Equal to, Greater than, Less than
        click(questionsDropdown);
        click(dropdownSelectAll);
        click(By.xpath("li[@aria-label='" + operator + "']"));
        setText(inputNumberField, String.valueOf(number));
        click(btnApply);
        return this;
    }

    @Step("Set Filter by Responses")
    public SurveysPage setFilterByResponses(String operator, int number) { // Equal to, Greater than, Less than
        click(responsesDropdown);
        click(dropdownSelectAll);
        click(By.xpath("li[@aria-label='" + operator + "']"));
        setText(inputNumberField, String.valueOf(number));
        click(btnApply);
        return this;
    }

    @Step("Set Filter by Updated")
    public SurveysPage setFilterByUpdated(String operator) { // On, Before, After , String date
        click(updatedDropdown);
        click(dropdownSelectAll);
        click(By.xpath("//li[@aria-label='" + operator + "']"));
        click(btnDatePicker);
        click(todayDate);
        // selectDate(LocalDate.parse(date));
        click(btnApply);
        return this;
    }

    @Step("Set Filter by Published")
    public SurveysPage setFilterByPublished(String operator, String date) { // On, Before, After
        click(publishedDropdown);
        click(dropdownSelectAll);
        click(By.xpath("li[@aria-label='" + operator + "']"));
        click(btnDatePicker);
        click(todayDate);
        click(btnApply);
        return this;
    }

    @Step("Click Clear All")
    public SurveysPage clickClearAll() {
        click(btnClearAll);
        return this;
    }

    @Step("Click Apply")
    public SurveysPage clickApply() {
        click(btnApply);
        return this;
    }

    /////////////////////// Pagination Controls Actions \\\\\\\\\\\\\\\\\\\\\\
    @Step("Click Next Page")
    public SurveysPage clickNextPage() {
        click(nextPageIcon);
        return this;
    }

    @Step("Click Previous Page")
    public SurveysPage clickPreviousPage() {
        click(previousPageIcon);
        return this;
    }


    @Step("Click First Page")
    public SurveysPage clickFirstPage() {
        click(firstPageIcon);
        return this;
    }

    @Step("Click Last Page")
    public SurveysPage clickLastPage() {
        click(lastPageIcon);
        return this;
    }

    @Step("Get Current Page Number")
    public String getCurrentPageNumber() {
        return find(txtCurrentIndicator).getText();
    }


}
