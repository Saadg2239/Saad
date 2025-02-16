package Elements;

import Pages.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SurveyBuilderElements extends PageBase {
    // Constructor
    public SurveyBuilderElements(WebDriver driver) {
        super(driver);
    }
    public By btnAddNewElement = By.xpath("//dfb-button[@icon='dfb-icon-add-outline']//button");
    public By iconCloseElementsModal = By.id("dfb-side-bar-close-icon");
    public By iconThreeVerticalDots = By.xpath("//dfb-button[@icon='dfb-icon-dots']");
    public By distributionOption = By.xpath("(//div[contains(@class, 'actionCard')]/ancestor::dfb-menu-item[contains(concat(' ', normalize-space(@class), ' '), ' ng-star-inserted ') and not(contains(@class, 'dfb-d-flex-mobile'))])[1]");
    public By btnCancel = By.xpath("(//div[contains(@class, 'footer-buttons')]//button)[1]");
    public By btnPublish = By.xpath("(//div[contains(@class, 'footer-buttons')]//button)[2]");
    public By publishModal = By.xpath("//div[@role='dialog']");
    public By iconClosePublishModal = By.xpath("//button[contains(@class, 'p-dialog-header-icon')]");
    public By publishOption = By.xpath("(//div[contains(@class, 'actionCard')]/ancestor::dfb-menu-item[contains(concat(' ', normalize-space(@class), ' '), ' ng-star-inserted ') and not(contains(@class, 'dfb-d-flex-mobile'))])[2]");
    public By btnBuildTab = By.xpath("(//div[@class='tabs']//dfb-tab-button//p-button)[1]");
    public By btnRulesTab = By.xpath("(//div[@class='tabs']//dfb-tab-button//p-button)[2]");
    public By btnSettingsTab = By.xpath("(//div[@class='tabs']//dfb-tab-button//p-button)[3]");
    public By distributionLink = By.xpath("//div[@class='linkToShare']//span[contains(@class, 'link')]");


    /////////////////////// Modal Elements \\\\\\\\\\\\\\\\\\\\\\
    public By inputElement = By.xpath("(//div[@class='dfb-controls-panel']//button)[1]");
    public By textAreaElement = By.xpath("(//div[@class='dfb-controls-panel']//button)[2]");
    public By numberElement = By.xpath("(//div[@class='dfb-controls-panel']//button)[3]");
    public By dateAndTimeElement = By.xpath("(//div[@class='dfb-controls-panel']//button)[4]");
    public By paragraphElement = By.xpath("(//div[@class='dfb-controls-panel']//button)[5]");
    public By mapElement = By.xpath("(//div[@class='dfb-controls-panel']//button)[6]");
    public By singleChoiceElement = By.xpath("(//div[@class='dfb-controls-panel']//button)[7]");
    public By dropdownMenuElement = By.xpath("(//div[@class='dfb-controls-panel']//button)[8]");
    public By multipleChoicesElement = By.xpath("(//div[@class='dfb-controls-panel']//button)[9]");
    public By npsElement = By.xpath("(//div[@class='dfb-controls-panel']//button)[10]");
    public By ratingElement = By.xpath("(//div[@class='dfb-controls-panel']//button)[11]");
    public By faceRatingElement = By.xpath("(//div[@class='dfb-controls-panel']//button)[12]");
    public By sliderElement = By.xpath("(//div[@class='dfb-controls-panel']//button)[13]");
    public By firstElementContainer = By.xpath("(//div[contains(@class,'dfb-question-container')])[1]");

    /////////////////////// Input Element :: Item Settings \\\\\\\\\\\\\\\\\\\\\\
    public By txtInputName = By.xpath("//div[contains(@class, 'dfb-question-label')]//input[contains(@class, 'p-inputtext')]");
    public By txtInputPlaceholder = By.cssSelector("div.question input.p-inputtext");
    public By inputFieldOnPreview = By.xpath("//div[@class='dfb-input-text']//input");
    public By btnSubmitOnPreview = By.xpath("//div[contains(@class,'submit')]//button");
    public By settingsOption = By.xpath("//div[contains(@class, 'setting-section')]//dfb-link-button[@icon='dfb-icon-setting']");
    public By typeDropdown = By.xpath("//label[text()='Type']/parent::li/dfb-dropdown//span[contains(@class, 'p-inputtext')]");
    public By txtDefaultAnswer = By.xpath("//label[text()='Default Answer']/following-sibling::dfb-input-text//input");
    public By entryLimitSwitch = By.xpath("//label[text()='Entry Limit']/following-sibling::p-inputswitch//div[contains(@class, 'p-inputswitch')]");
    public By entryLimitTxtMinValue = By.xpath("//label[text()='Entry Limit']/ancestor::dfb-input-switch/following-sibling::div//label[text()='Minimum']/preceding-sibling::dfb-input-number//input");
    public By entryLimitTxtMaxValue = By.xpath("//label[text()='Entry Limit']/ancestor::dfb-input-switch/following-sibling::div//label[text()='Maximum']/preceding-sibling::dfb-input-number//input");
    public By entryLimitMinLabelPreview = By.xpath("//em[contains(@class, 'dfb-icon-instruction')]/following-sibling::span");
    public By limitTypeDropdown = By.xpath("//label[text()='Limit Type']/preceding-sibling::dfb-dropdown//span[contains(@class, 'p-inputtext')]");
    public By textAreaAlignmentPreview = By.xpath("//div[contains(@class, 'dfb-text-area')]");
    public By getTypeOption(String label) {
        return By.xpath("//li[@role='option' and @aria-label='" + label + "']");
    }

    /////////////////////// Input Element :: General Settings \\\\\\\\\\\\\\\\\\\\\\
    public By tooltip = By.xpath("//label[text()='Tooltip']/following-sibling::dfb-input-text//input");
    public By tooltipInstructionIcon = By.xpath("//em[contains(@class, 'dfb-icon-instruction')]");
    public By requiredSwitch = By.xpath("//label[text()='Required']/following-sibling::p-inputswitch//div[contains(@class, 'p-inputswitch')]");
    public By requiredAsteriskIcon = By.xpath("//em[contains(@class, 'required-view')]");
    public By attachmentSwitch = By.xpath("//label[text()='Attachment']/following-sibling::p-inputswitch//div[contains(@class, 'p-inputswitch')]");
    public By attachmentIcon = By.xpath("//em[contains(@class, 'dfb-icon-attachment-v2')]");
    public By attachmentImages = By.xpath("//div[@role='button' and @aria-label='Images']");
    public By attachmentFiles = By.xpath("//div[@role='button' and @aria-label='Files']");
    public By attachmentBoth = By.xpath("//div[@role='button' and @aria-label='Both']");
    public By attachmentsLimitSwitch = By.xpath("//label[text()='Attachments Limit']/following-sibling::p-inputswitch//div[contains(@class, 'p-inputswitch')]");
    public By txtAttachmentsLimit = By.xpath("//label[text()='Maximum number of attachments allowed.']/following-sibling::dfb-input-number//input");
    public By increaseAttachmentsLimitIcon = By.xpath("//label[text()='Maximum number of attachments allowed.']/following-sibling::dfb-input-number//button[contains(@class, 'p-inputnumber-button-up')]");
    public By decreaseAttachmentsLimitIcon = By.xpath("//label[text()='Maximum number of attachments allowed.']/following-sibling::dfb-input-number//button[contains(@class, 'p-inputnumber-button-down')]");
    public By noteSwitch = By.xpath("//label[text()='Note']/following-sibling::p-inputswitch//div[contains(@class, 'p-inputswitch')]");
    public By noteIcon = By.xpath("//em[contains(@class, 'dfb-icon-Note-v2')]");
    public By previewButton = By.xpath("//button[@type='button' and contains(.,'Preview')]");
    public By txtInput = By.xpath("//div[@class='dfb-input-text']/input");
    public By backArrowIcon = By.xpath("//dfb-button[@icon='dfb-icon-back']");
    public By inputAlignmentPreview = By.xpath("//div[contains(@class, 'view-preview')]");
    public By getLetterCaseOption(String label) {
        // Available values: TT, Tt, tt
        return By.xpath("//div[@role='button' and @aria-label='" + label + "']");
    }

    public By getLimitTypeOption(String label) {
        // Available values: Character, Word
        return By.xpath("//li[@role='option' and @aria-label='" + label + "']");
    }
    public By getAlignmentOption(String alignment) {
        // Available values: Top, Inline
        return By.xpath("//div[@role='button' and @aria-label='" + alignment + "']");
    }

    ///////////////////////// Text Area Element \\\\\\\\\\\\\\\\\\\\\\
    public By getEditorType(String type) {
        // Available values: Plain Text, Rich Text
        return By.xpath("//div[@role='button' and @aria-label='" + type + "']");
    }
    public By editorRichText = By.xpath("//div[@role='button' and @aria-label='Rich Text']");
    public By editorMarkdown = By.xpath("//div[contains(@class, 'ql-toolbar')]");
    public By fullScreenSwitch = By.xpath("//label[text()='Full Screen']/following-sibling::p-inputswitch//div[contains(@class, 'p-inputswitch')]");
    public By autoExpandSwitch = By.xpath("//label[text()='Auto Expand']/following-sibling::p-inputswitch//div[contains(@class, 'p-inputswitch')]");
    public By expandIconOnPreview = By.xpath("//div[contains(@class, 'area-icons')]//em[contains(@class, 'dfb-icon-text-area-box')]");
    public By fullScreenIconOnPreview = By.xpath("//div[contains(@class, 'area-icons')]//em[contains(@class, 'fullScreenIcon')]");
    public By txtRichEditorInput = By.xpath("//div[@class='ql-editor']/p");
    public By txtPlainEditorInput = By.xpath("//div[contains(@class, 'area-icons')]//textarea");
    ///////////////////////// Number Element \\\\\\\\\\\\\\\\\\\\\\
    public By numberAlignmentPreview = By.xpath("//div[contains(@class, 'dfb-question-control-wrapper')]");
    public By numberDefaultAnswer = By.xpath("//label[text()='Default Answer']/following-sibling::dfb-input-number//input");
    public By numberInput = By.xpath("//dfb-input-number//input[@inputmode='decimal']");
    public By increaseIconPreview = By.xpath("//button[contains(@class, 'p-inputnumber-button-up')]");
    public By decreaseIconPreview = By.xpath("//button[contains(@class, 'p-inputnumber-button-down')]");
    public By decimalPlaces = By.xpath("//label[text()='Decimal Places']/following-sibling::dfb-input-number//input");
    public By stepper = By.xpath("//label[text()='Stepper']/following-sibling::dfb-input-number//input");
    public By valueLimitSwitch = By.xpath("//label[text()='Value Limit']/following-sibling::p-inputswitch//div[contains(@class, 'p-inputswitch')]");
    public By valueLimitTxtMin = By.xpath("//label[text()='Value Limit']/ancestor::dfb-input-switch/following-sibling::div//label[text()='Minimum']/preceding-sibling::dfb-input-number//input");
    public By valueLimitTxtMax = By.xpath("//label[text()='Value Limit']/ancestor::dfb-input-switch/following-sibling::div//label[text()='Maximum']/preceding-sibling::dfb-input-number//input");

    ///////////////////////// Date & Time Element \\\\\\\\\\\\\\\\\\\\\\
    public By getDateAndTimeType(String type) {
        // Available values: Date, Time, Date & Time
        return By.xpath("//li[@role='option' and @aria-label='" + type + "']");
    }

    public By dateAndTimePresencePreview = By.cssSelector("span.p-calendar-w-btn");
    public By timePresencePreview = By.cssSelector("span.p-calendar-timeonly");
    public By getDateFormattingPreview(String placeholder) {
        // Available values: D/M/Y, M/D/Y, Y/M/D
        return By.xpath("//input[@type='text' and @placeholder='" + placeholder + "']");
    }
    public By getCurrentDatePreview() {
        click(dateAndTimePresencePreview);
        return By.xpath("//td[contains(@class, 'p-datepicker-today')]//span");
    }
    public By getSelectionMode(String mode) {
        // Available values: Single, Multiple, Range
        return By.xpath("//div[@role='button' and @aria-label='" + mode + "']");
    }

    public By getDateFormatting(String format) {
        // Available values: D/M/Y, M/D/Y, Y/M/D
        return By.xpath("//div[@role='button' and @aria-label='" + format + "']");
    }

    public By firstDayOfWeekDropdown = By.xpath("//label[text()='First Day Of Week']/parent::li/dfb-dropdown//span[contains(@class, 'p-inputtext')]");
    public By getDayOfWeek(String day){
        return By.xpath("//li[@role='option' and @aria-label='" + day + "']");
    }

    public By defaultDateSwitch = By.xpath("//label[text()='Default Date']/following-sibling::p-inputswitch//div[contains(@class, 'p-inputswitch')]");
    public By disableDaysSwitch = By.xpath("//label[text()='Disable Days']/following-sibling::p-inputswitch//div[contains(@class, 'p-inputswitch')]");
    public By disableDatesSwitch = By.xpath("//label[text()='Disable Dates']/following-sibling::p-inputswitch//div[contains(@class, 'p-inputswitch')]");
    public By dateValidationSwitch = By.xpath("//label[text()='Date Validation']/following-sibling::p-inputswitch//div[contains(@class, 'p-inputswitch')]");


    ///////////////////////// Map Element \\\\\\\\\\\\\\\\\\\\\\
    public By mapAlignmentPreview = By.xpath("//div[contains(@class, 'dfb-map-question')]");
    public By zipCodeSwitch = By.xpath("//label[text()='Zipcode']/following-sibling::p-inputswitch//div[contains(@class, 'p-inputswitch')]");
    public By zipCodeBuildMode = By.xpath("//div[@class='map-container']//label");
    public By Step = By.xpath("//label[text()='Step']/following-sibling::dfb-input-number//input");
    public By sliderMinDefaultAnswer = By.xpath("(//label[text()='Default Answer']/following-sibling::div//input[@inputmode='decimal'])[1]");
    public By sliderMaxDefaultAnswer = By.xpath("(//label[text()='Default Answer']/following-sibling::div//input[@inputmode='decimal'])[2]");
    public By sliderAlignmentPreview = By.xpath("//div[contains(@class, 'dfb-slider')]");

    ///////////////////////// Single Choice Element \\\\\\\\\\\\\\\\\\\\\\
    public By btnAddOption = By.xpath("//div[contains(@class, 'dfb-link-button')]//div[text()='Add Option']");
    public By getTxtOption(int optionIndex) {
        return By.xpath("(//textarea[@placeholder='Enter an option'])["+ ++optionIndex +"]");
    }
    public By predefinedOptionsDropdown = By.xpath("//span[text()='Predefined Options']");
    public By genderOption = By.xpath("//div[@role='button' and @aria-label='Gender']");
    public By daysOption = By.xpath("//div[@role='button' and @aria-label='Days']");
    public By monthsOption = By.xpath("//div[@role='button' and @aria-label='Months']");
    public By displayOtherOptionSwitch = By.xpath("//label[text()='Display Other Option']/following-sibling::p-inputswitch//div[contains(@class, 'p-inputswitch')]");
    public By displayNAOptionSwitch = By.xpath("//label[text()='Display N/A Option']/following-sibling::p-inputswitch//div[contains(@class, 'p-inputswitch')]");
    public By shuffleOptionsSwitch = By.xpath("//label[text()='Shuffle Options']/following-sibling::p-inputswitch//div[contains(@class, 'p-inputswitch')]");
    public By mcqAlignmentPreview = By.xpath("//div[contains(@class, 'dfb-mcq-question')]");
    public By radioBtnLabelPreview = By.xpath("//label[contains(@class, 'p-radiobutton-label')]");
    public By getRadioBtn(String value) {
        return By.xpath("//label[contains(@class, 'p-radiobutton-label') and text()='" + value + "']");
    }

    ///////////////////////// Dropdown Menu Element \\\\\\\\\\\\\\\\\\\\\\
    public By multipleSelectionOption = By.xpath("//label[text()='Multiple Selection']/following-sibling::p-inputswitch//div[contains(@class, 'p-inputswitch')]");

    public By selectDropdownMenuPreview = By.xpath("//span[contains(@class, 'p-dropdown-label')]");

    public By getMultiSelectItem(String value) {
        return By.xpath("//li[@aria-label='" + value + "']//span");
    }

    public By dropdownItemPreview = By.xpath("//li[contains(@class, 'p-dropdown-item')]");

    ///////////////////////// Multiple Choices Element \\\\\\\\\\\\\\\\\\\\\\
    public By checkboxLabelPreview = By.xpath("//label[contains(@class, 'p-checkbox-label')]");
    public By getCheckboxBtn(String value) {
        return By.xpath("//label[contains(@class, 'p-checkbox-label') and text()='" + value + "']");
    }

    ///////////////////////// NPS Element \\\\\\\\\\\\\\\\\\\\\\
    public By npsAlignmentPreview = By.xpath("//div[contains(@class, 'dfb-nps')]");

    ///////////////////////// Face Rating Element \\\\\\\\\\\\\\\\\\\\\\
    public By faceRatingDefaultAnswerDropdown = By.xpath("//span[text()='Select Value']");
    public By faceRatingIconPreview = By.xpath("//div[contains(@class, 'dfb-face-rate')]//em");
    public By faceRatingAlignmentPreview = By.xpath("//div[contains(@class, 'dfb-face-rate')]");
    public By getFaceRatingValue(String value) {
        // Available values: 1(Angry), 2(Sad), 3(Indifferent), 4(Happy), 5(Satisfied)
        return By.xpath("//li[@role='option' and @aria-label='" + value + "']");
    }


    ///////////////////////// Rating Element \\\\\\\\\\\\\\\\\\\\\\
    public By ratingDefaultAnswerDropdown = By.xpath("//label[text()='Default Answer']/following-sibling::dfb-input-number//input");
    public By ratingDefaultTypeDropdown = By.xpath("//label[text()='Type']/following-sibling::dfb-dropdown//span[contains(@class, 'p-inputtext')]");
    public By scaleValue = By.xpath("//label[text()='Scale']/following-sibling::dfb-input-number//input");
    public By filledRatingIconsPreview = By.xpath("//ul[@class='dfb-rating']//li[contains(@class, 'dfb-icon-star-filled')]");
    public By outlinedRatingIconsPreview = By.xpath("//ul[@class='dfb-rating']//li[contains(@class, 'dfb-icon-star-outlined')]");
    public By ratingAlignmentPreview = By.xpath("//div[contains(@class, 'dfb-rate')]");


    ///////////////////////// Slider Element \\\\\\\\\\\\\\\\\\\\\\
    public By getSliderSelectionType(String type) {
        // Available values: Single Select, Range Select
        return By.xpath("//div[@role='button' and @aria-label='" + type + "']");
    }
    public By getRatingValue(String type) {
        // Available values: Star, Heart, Thumb
        return By.xpath("//li[@role='option' and @aria-label='" + type + "']");
    }

    ///////////////////////// Submission Mode \\\\\\\\\\\\\\\\\\\\\\
    public By btnViewResults = By.xpath("//button//span[text()='View Results']");
    public By txtAnonymousIdentityTitle = By.xpath("//dfb-collapsible-dialog[@icon='dfb-icon-anonymous']//span[contains(@class, 'title')]");
    public By txtAnonymousIdentityDescription = By.xpath("//dfb-collapsible-dialog[@icon='dfb-icon-anonymous']//p[contains(@class, 'description')]");
    public By txtMultipleSubmissionsHeader = By.xpath("//h2[contains(@class, 'available-action-header')]");
    public By txtMultipleSubmissionsLabel = By.xpath("//div[contains(@class, 'chksurvey-available-action')]//p");
    public By btnSubmitAgain = By.xpath("//div[contains(@class, 'chksurvey-available-action')]//button//span[text()='Submit Again']");
    public By btnViewResponse = By.xpath("//div[contains(@class, 'chksurvey-available-action')]//button//span[text()='View Response']");
    public By btnEditResponse = By.xpath("//div[contains(@class, 'chksurvey-available-action')]//button//span[text()='Edit Response']");

    public By btnPasswordOnPreview = By.xpath("//input[contains(@class, 'p-password-input')]");
    public By btnContinueOnPreview = By.xpath("//button//span[text()='Continue']");
    public By txtInvalidPassword = By.xpath("//div//span[text()=' The password is invalid. ']");
    public By txtCaptchaFormTitle = By.xpath("//div[contains(@class, 'form-title')]");
    public By captchaModal = By.xpath("//chksurvey-captcha[@formcontrolname='captcha']");
    public By txtPrivateSurveyHeader = By.xpath("(//div[contains(@class, 'chksurvey-shared-card')]//p)[1]");
    public By txtPrivateSurveyLabel = By.xpath("(//div[contains(@class, 'chksurvey-shared-card')]//p)[2]");
    public By btnPrivateSurveySignIn = By.xpath("//div[contains(@class, 'chksurvey-shared-card')]//p-button");
}