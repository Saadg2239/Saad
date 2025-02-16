package Elements;

import Pages.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SurveysElements extends PageBase {
    // Constructor
    public SurveysElements(WebDriver driver) {
        super(driver);
    }
    /////////////////////// New Survey Modal \\\\\\\\\\\\\\\\\\\\\\
    public By btnNewSurvey = By.
            xpath("//chksurvey-button[@icon='chksurvey-icon-add-outline' and @class='btn-new-desktop']");
    public By btnNewSurveyOnMobile = By.
            xpath("//chksurvey-button[@icon='chksurvey-icon-add-outline' and @class='btn-new-mobile']");
    public By txtSurveyTitle = By.
            xpath("//div[@role='dialog']//div[@class='chksurvey-input-text']//input");
    public By btnCancel = By.
            xpath("(//div[@class='footer-buttons']//button)[1]");
    public By btnCreate = By.
            xpath("(//div[@class='footer-buttons']//button)[2]");
    public By searchBar = By.
            xpath("//em[contains(@class,'chksurvey-icon-search')]/preceding-sibling::input");
    public By searchCloseIcon = By.xpath("(//em[contains(@class, 'close-icon chksurvey-icon-close-line')])[1]");
    public By getFirstSearchResult(String data) {
        return By.xpath("(//span[text()='" + " " + data + " " + "']/parent::chksurvey-default-cell)[2]");
    }
    public By getFirstSearchResultStatus(String surveyName) {
        return By.xpath("(//span[text()='" + " " + surveyName + " " + "']/parent::chksurvey-default-cell)[2]/ancestor::td/following-sibling::td//span[contains(@class, 'status')]");
    }
    public By getSurveyThreeVerticalDots(String surveyName) {
        return By.xpath("((//span[text()='" + " " + surveyName + " " + "']/parent::chksurvey-default-cell)[2]/ancestor::td/following-sibling::td)[last()]//em[@class='chksurvey-icon-dots']");
    }
    public By editOption = By.xpath("//a[@role='menuitem']//span[text()='Edit']");
    public By previewOption = By.xpath("//a[@role='menuitem']//span[text()='Preview']");
    public By settingsOption = By.xpath("//a[@role='menuitem']//span[text()='Settings']");
    public By duplicateOption = By.xpath("//a[@role='menuitem']//span[text()='Duplicate']");
    public By archiveOption = By.xpath("//a[@role='menuitem']//span[text()='Archive']");
    public By deleteOption = By.xpath("//a[@role='menuitem']//span[text()='Delete']");
    public By distributionOption = By.xpath("//a[@role='menuitem']//span[text()='Distribution']");

    /////////////////////// Side Menu \\\\\\\\\\\\\\\\\\\\\\
    public By allSurveysTab = By.xpath("//span[contains(@class,'chksurvey-icon-all-forms')]/parent::div");
    public By btnNewFolder = By.xpath("//span[contains(@class,'chksurvey-icon-add-outline')]/parent::div");
    public By archiveTab = By.xpath("//span[contains(@class,'chksurvey-icon-archive')]/parent::div");
    public By trashTab = By.xpath("//span[contains(@class,'chksurvey-icon-delete')]/parent::div");
    public By surveyBuilderTabs = By.xpath("//div[contains(@class, 'tabs')]");

    /////////////////////// Filter \\\\\\\\\\\\\\\\\\\\\\
    public By iconFilter = By.xpath("//chksurvey-button[@icon='chksurvey-icon-filter1']//p-button");
    public By txtFilterBySurveyTitle = By.xpath("//div[@class='chksurvey-input-text']//input[@placeholder='Enter Survey Title']");
    public By statusDropdown = By.xpath("//label[text()='Status']/parent::li/chksurvey-multi-select");
    public By questionsDropdown = By.xpath("//label[text()='Questions']/parent::chksurvey-filter-number");
    public By responsesDropdown = By.xpath("//label[text()='Responses']/parent::chksurvey-filter-number");
    public By updatedDropdown = By.xpath("//label[text()='Updated']/parent::chksurvey-filter-datepicker");
    public By publishedDropdown = By.xpath("//label[text()='Published']/parent::chksurvey-filter-datepicker");
    public By dropdownSelectAll = By.xpath("//p-dropdown[@inputid='dropdownInputId']");
    public By inputNumberField = By.xpath("//input[contains(@class, 'p-inputnumber-input')]");
    public By btnDatePicker = By.xpath("//button[contains(@class, 'p-datepicker-trigger')]");
    public By todayDate = By.xpath("//td[contains(@class, 'p-datepicker-today')]");
    public By btnClearAll = By.xpath("//div[@class='buttons']//chksurvey-button-link");
    public By btnApply = By.xpath("//div[@class='buttons']//chksurvey-button");

    /////////////////////// Pagination Controls \\\\\\\\\\\\\\\\\\\\\\
    public By nextPageIcon = By.xpath("//button[contains(@class, 'p-paginator-next')]");
    public By previousPageIcon = By.xpath("//button[contains(@class, 'p-paginator-prev')]");
    public By firstPageIcon = By.xpath("//button[contains(@class, 'p-paginator-first')]");
    public By lastPageIcon = By.xpath("//button[contains(@class, 'p-paginator-last')]");
    public By txtCurrentIndicator = By.xpath("//span[contains(@class, 'p-paginator-current')]"); // Showing n to n of n Surveys
}
