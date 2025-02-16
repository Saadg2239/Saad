package Elements;

import Pages.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SettingsElements extends PageBase {
    // Constructor
    public SettingsElements(WebDriver driver) {
        super(driver);
    }

    /////////////////////// General Settings \\\\\\\\\\\\\\\\\\\\\\
    public By btnGeneralSettings = By.xpath("(//li[@role='presentation'])[1]");
    public By txtFormTitle = By.xpath("//div[@class='title']/following-sibling::dfb-input-text//input");
    public By classicFormLayout = By.xpath("(//div[@class='question-item']//ul//li)[1]");
    public By CardFormLayout = By.xpath("(//div[@class='question-item']//ul//li)[2]");
    public By conversationFormLayout = By.xpath("(//div[@class='question-item']//ul//li)[3]");
    public By formStatusToggle = By.xpath("//label[text()='Form Status']/following-sibling::p-inputswitch");
    public By pageValidationToggle = By.xpath("//label[text()='Page Validation']/following-sibling::p-inputswitch");
    public By formExpirationToggle = By.xpath("//label[text()='Form Expiration']/following-sibling::p-inputswitch");
    public By scoreCalculationToggle = By.xpath("//label[text()='Score Calculation']/following-sibling::p-inputswitch");
    public By viewResultsToggle = By.xpath("//label[text()='View Results']/following-sibling::p-inputswitch");
    public By multipleSubmissionsToggle = By.xpath("//label[text()='Multiple Submissions']/following-sibling::p-inputswitch");
    public By anonymousResponsesToggle = By.xpath("//label[text()='Anonymous Responses']/following-sibling::p-inputswitch");

    /////////////////////// Access Settings \\\\\\\\\\\\\\\\\\\\\\
    public By btnAccessSettings = By.xpath("(//li[@role='presentation'])[2]");
    public By btnSubmitOnly = By.xpath("//label[text()='Submit Only']/ancestor::p-radiobutton");
    public By btnSubmitAndView = By.xpath("//label[text()='Submit and View Later']/ancestor::p-radiobutton");
    public By btnSubmitAndEdit = By.xpath("//label[text()='Submit and Edit Later']/ancestor::p-radiobutton");
    public By btnPublicAccess = By.xpath("//label[text()='Public Form']/ancestor::p-radiobutton");
    public By btnPrivateAccess = By.xpath("//label[text()='Private Form']/ancestor::p-radiobutton");

    /////////////////////// Translations \\\\\\\\\\\\\\\\\\\\\\
    public By btnTranslations = By.xpath("(//li[@role='presentation'])[3]");
    public By formLanguageDropdown = By.xpath("//dfb-dropdown[@optionlabel='name']");
    public By formLanguageEnglish = By.xpath("//li[@aria-label='English']");
    public By formLanguageArabic = By.xpath("//li[@aria-label='العربية']");
    public By formLanguageEspanol = By.xpath("//li[@aria-label='Español']");
    public By btnEditFormWarnings = By.xpath("//p[text()='Form Warnings']/parent::div/following-sibling::dfb-link-button");

    /////////////////////// Thank You Page \\\\\\\\\\\\\\\\\\\\\\
    public By btnThankYouPage = By.xpath("(//li[@role='presentation'])[4]");
    public By btnSubmissionMsg = By.xpath("//input[@value='SubmissionMessage']");
    public By btnRedirectUrl = By.xpath("//input[@value='RedirectUrl']");
    /////////////////////// Email \\\\\\\\\\\\\\\\\\\\\\
    public By btnEmail = By.xpath("(//li[@role='presentation'])[5]");
    public By btnAddEmail = By.xpath("//dfb-button[@icon='dfb-icon-add-outline']//button");
    public By notificationEmail = By.xpath("//div[contains(@class, 'dfb-notification-email')]");
    public By autoResponderEmail = By.xpath("//div[contains(@class, 'dfb-auto-responder-email')]");
    /////////////////////// Advanced Settings \\\\\\\\\\\\\\\\\\\\\\
    public By btnAdvancedSettings = By.xpath("(//li[@role='presentation'])[6]");
    public By passwordProtectionToggle = By.xpath("//label[text()='Password Protection']/parent::div//p-inputswitch");
    public By txtPassword = By.xpath("//input[@type='password']");
    public By captchaProtectionToggle = By.xpath("//label[text()='Captcha Protection']/parent::div//p-inputswitch");

}
