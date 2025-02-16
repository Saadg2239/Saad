package Pages;

import Elements.SettingsElements;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class SettingsPage extends SettingsElements {
    // Constructor
    public SettingsPage(WebDriver driver) {
        super(driver);
    }


    @Step("Click on General Settings")
    public SettingsPage clickGeneralSettings() {
        click(btnGeneralSettings);
        return this;
    }

    @Step("Set Form Title")
    public SettingsPage setFormTitle(String title) {
        setText(txtFormTitle, title);
        return this;
    }

    @Step("Click on Classic Form Layout")
    public SettingsPage clickClassicFormLayout() {
        click(classicFormLayout);
        return this;
    }

    @Step("Click on Card Form Layout")
    public SettingsPage clickCardFormLayout() {
        click(CardFormLayout);
        return this;
    }

    @Step("Click on Conversation Form Layout")
    public SettingsPage clickConversationFormLayout() {
        click(conversationFormLayout);
        return this;
    }

    @Step("Click on Form Status Toggle")
    public SettingsPage clickFormStatusToggle() {
        click(formStatusToggle);
        return this;
    }

    @Step("Click on Page Validation Toggle")
    public SettingsPage clickPageValidationToggle() {
        click(pageValidationToggle);
        return this;
    }

    @Step("Click on Form Expiration Toggle")
    public SettingsPage clickFormExpirationToggle() {
        click(formExpirationToggle);
        return this;
    }

    @Step("Click on Score Calculation Toggle")
    public SettingsPage clickScoreCalculationToggle() {
        click(scoreCalculationToggle);
        return this;
    }

    @Step("Click on View Results Toggle")
    public SettingsPage clickViewResultsToggle() {
        click(viewResultsToggle);
        return this;
    }

    @Step("Click on Multiple Submissions Toggle")
    public SettingsPage clickMultipleSubmissionsToggle() {
        click(multipleSubmissionsToggle);
        return this;
    }

    @Step("Click on Anonymous Responses Toggle")
    public SettingsPage clickAnonymousResponsesToggle() {
        click(anonymousResponsesToggle);
        return this;
    }

    /////////////////////// Access Settings \\\\\\\\\\\\\\\\\\\\\\

    @Step("Click on Access Settings")
    public SettingsPage clickAccessSettings() {
        click(btnAccessSettings);
        return this;
    }

    @Step("Click on Submit Only")
    public SettingsPage clickSubmitOnly() {
        click(btnSubmitOnly);
        return this;
    }

    @Step("Click on Submit And View")
    public SettingsPage clickSubmitAndView() {
        click(btnSubmitAndView);
        return this;
    }

    @Step("Click on Submit And Edit")
    public SettingsPage clickSubmitAndEdit() {
        click(btnSubmitAndEdit);
        return this;
    }

    @Step("Click on Public Access")
    public SettingsPage clickPublicAccess() {
        click(btnPublicAccess);
        return this;
    }

    @Step("Click on Private Access")
    public SettingsPage clickPrivateAccess() {
        dbClick(btnPrivateAccess);
        return this;
    }

    /////////////////////// Translations \\\\\\\\\\\\\\\\\\\\\\
    @Step("Click on Translations")
    public SettingsPage clickTranslations() {
        click(btnTranslations);
        return this;
    }

    @Step("Click on Form Language Dropdown")
    public SettingsPage clickFormLanguageDropdown() {
        click(formLanguageDropdown);
        return this;
    }

    @Step("Select English as Form Language")
    public SettingsPage clickFormLanguageEnglish() {
        clickFormLanguageDropdown();
        click(formLanguageEnglish);
        return this;
    }

    @Step("Select Arabic as Form Language")
    public SettingsPage clickFormLanguageArabic() {
        clickFormLanguageDropdown();
        click(formLanguageArabic);
        return this;
    }

    @Step("Select Espanol as Form Language")
    public SettingsPage clickFormLanguageEspanol() {
        clickFormLanguageDropdown();
        click(formLanguageEspanol);
        return this;
    }

    @Step("Click on Edit Form Warnings")
    public SettingsPage clickEditFormWarnings() {
        click(btnEditFormWarnings);
        return this;
    }

    /////////////////////// Thank You Page \\\\\\\\\\\\\\\\\\\\\\
    @Step("Click on Thank You Page")
    public SettingsPage clickThankYouPage() {
        click(btnThankYouPage);
        return this;
    }

    @Step("Click on Submission Message")
    public SettingsPage clickSubmissionMsg() {
        click(btnSubmissionMsg);
        return this;
    }

    @Step("Click on Redirect Url")
    public SettingsPage clickRedirectUrl() {
        click(btnRedirectUrl);
        return this;
    }


    /////////////////////// Email \\\\\\\\\\\\\\\\\\\\\\
    @Step("Click on Email")
    public SettingsPage clickEmail() {
        click(btnEmail);
        return this;
    }

    @Step("Click on Add Email")
    public SettingsPage clickAddEmail() {
        click(btnAddEmail);
        return this;
    }

    @Step("Click on Notification Email")
    public SettingsPage clickNotificationEmail() {
        click(notificationEmail);
        return this;
    }

    @Step("Click on Auto Responder Email")
    public SettingsPage clickAutoResponderEmail() {
        click(autoResponderEmail);
        return this;
    }

    /////////////////////// Advanced Settings \\\\\\\\\\\\\\\\\\\\\\
    @Step("Click on Advanced Settings")
    public SettingsPage clickAdvancedSettings() {
        click(btnAdvancedSettings);
        return this;
    }

    @Step("Click on Password Protection")
    public SettingsPage clickPasswordProtection() {
        click(passwordProtectionToggle);
        return this;
    }

    @Step("Set Password")
    public SettingsPage setPassword(String password) {
        setText(txtPassword, password);
        return this;
    }

    @Step("Click on Captcha Protection")
    public SettingsPage clickCaptchaProtection() {
        click(captchaProtectionToggle);
        return this;
    }

}
