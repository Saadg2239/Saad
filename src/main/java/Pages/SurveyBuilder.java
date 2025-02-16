package Pages;

import Elements.SurveyBuilderElements;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import io.qameta.allure.Step;
import org.testng.Assert;

public class SurveyBuilder extends SurveyBuilderElements {
    // Constructor
    public SurveyBuilder(WebDriver driver) {
        super(driver);
    }

    @Step("Click on the 'Add New Element' button")
    public SurveyBuilder clickAddNewElement() {
        click(btnAddNewElement);
        return this;
    }
    @Step("Open the settings modal")
    public SurveyBuilder openSettingsModal() {
        click(settingsOption);
        return this;
    }
    @Step("Close the settings modal")
    public SurveyBuilder closeSettingsModal() {
        click(iconCloseElementsModal);
        return this;
    }
    @Step("Navigate to the 'Preview' tab")
    public SurveyBuilder navigateToPreviewTab() {
        click(previewButton);
        return this;
    }
    @Step("Get back to the 'Build' tab")
    public SurveyBuilder getBackToBuildMode() {
        click(backArrowIcon);
        return this;
    }
    @Step("Enter into the focus mode by clicking on the first element")
    public SurveyBuilder activateFocusMode() {
        hover(firstElementContainer);
        dbClick(firstElementContainer);
        return this;
    }

    @Step("Click on the 3 vertical dots")
    public SurveyBuilder clickThreeVerticalDots() {
        click(iconThreeVerticalDots);
        return this;
    }
    @Step("Click on the distribution option")
    public SurveyBuilder clickDistributionOption() {
        click(distributionOption);
        return this;
    }
    @Step("Assert the display of the publish modal")
    public SurveyBuilder assertPublishModal() {
        isDisplayed(publishModal);
        return this;
    }
    @Step("Click on the cancel button")
    public SurveyBuilder clickCancel() {
        click(btnCancel);
        return this;
    }
    @Step("Click on the publish button")
    public SurveyBuilder clickPublish() {
        click(btnPublish);
        return this;
    }

    @Step("Click on the publish close icon")
    public SurveyBuilder clickPublishModalCloseIcon() {
        click(iconClosePublishModal);
        return this;
    }

    @Step("Click on the publish option")
    public SurveyBuilder clickPublishOption() {
        click(publishOption);
        return this;
    }

    @Step("Click on the 'build' tab")
    public SurveyBuilder clickBuildTab() {
        click(btnBuildTab);
        return this;
    }

    @Step("Click on the 'rules' tab")
    public SurveyBuilder clickRulesTab() {
        click(btnRulesTab);
        return this;
    }

    @Step("Click on the 'settings' tab")
    public SettingsPage clickSettingsTab() {
        click(btnSettingsTab);
        return new SettingsPage(driver);
    }


    /////////////////////// Modal Elements \\\\\\\\\\\\\\\\\\\\\\

    @Step("Click on the 'Input' element")
    public SurveyBuilder clickInputElement() {
        click(inputElement);
        return this;
    }

    @Step("Click on the 'Text Area' element")
    public SurveyBuilder clickTextAreaElement() {
        click(textAreaElement);
        return this;
    }

    @Step("Click on the 'Number' element")
    public SurveyBuilder clickNumberElement() {
        click(numberElement);
        return this;
    }

    @Step("Click on the 'Date And Time' element")
    public SurveyBuilder clickDateAndTimeElement() {
        click(dateAndTimeElement);
        return this;
    }

    @Step("Click on the 'Dropdown Menu' element")
    public SurveyBuilder clickDropdownMenuElement() {
        click(dropdownMenuElement);
        return this;
    }

    @Step("Click on the 'Single Choice' element")
    public SurveyBuilder clickSingleChoiceElement() {
        click(singleChoiceElement);
        return this;
    }

    @Step("Click on the 'Multiple Choices' element")
    public SurveyBuilder clickMultipleChoicesElement() {
        click(multipleChoicesElement);
        return this;
    }

    @Step("Click on the 'NPS' element")
    public SurveyBuilder clickNPSElement() {
        click(npsElement);
        return this;
    }

    @Step("Click on the 'Map' element")
    public SurveyBuilder clickMapElement() {
        click(mapElement);
        return this;
    }

    @Step("Click on the 'Face Rating' element")
    public SurveyBuilder clickFaceRatingElement() {
        click(faceRatingElement);
        return this;
    }
    @Step("Click on the 'Paragraph' element")
    public SurveyBuilder clickParagraphElement() {
        click(paragraphElement);
        return this;
    }
    @Step("Click on the 'Slider' element")
    public SurveyBuilder clickSliderElement() {
        click(sliderElement);
        return this;
    }

    @Step("Click on the 'Rating' element")
    public SurveyBuilder clickRatingElement() {
        click(ratingElement);
        return this;
    }

    /////////////////////// Input Element :: Item Settings \\\\\\\\\\\\\\\\\\\\\\
    @Step("Set the question name")
    public SurveyBuilder setQuestionName(String name) {
        setText(txtInputName, name);
        return this;
    }

    @Step("Set the question description")
    public SurveyBuilder setInputQuestionPlaceholder(String placeholder) {
        setText(txtInputPlaceholder, placeholder);
        return this;
    }
    @Step("Change the type of the question")
    public SurveyBuilder changeType(String type) {
        click(typeDropdown);
        // Available values: Email, Url, Numeric, Alphabetic, Alphanumeric
        switch (type) {
            case "Free Text" -> click(getTypeOption("Free Text"));

            case "Email" -> click(getTypeOption("Email"));

            case "Url" -> click(getTypeOption("Url"));

            case "Numeric" -> click(getTypeOption("Numeric"));

            case "Alphabetic" -> click(getTypeOption("Alphabetic"));

            case "Alphanumeric" -> click(getTypeOption("Alphanumeric"));

        }
        return this;
    }

    @Step("Set the input field on the preview mode")
    public SurveyBuilder setInputFieldOnPreview(String data) {
        setText(inputFieldOnPreview, data);
        return this;
    }
    @Step("Click the submit button on the preview mode")
    public SurveyBuilder clickSubmitButtonOnPreview() {
        click(btnSubmitOnPreview);
        return this;
    }

    @Step("Set the default answer")
    public SurveyBuilder setDefaultAnswer(String answer) {
        setText(txtDefaultAnswer, answer);
        return this;
    }
    @Step("Set the letter case of the input")
    public SurveyBuilder setLetterCase(String letterCase) {
        // Available values: TT, Tt, tt
        click(getLetterCaseOption(letterCase));
        return this;
    }
    @Step("Set the input entry limit")
    public SurveyBuilder setEntryLimit(boolean entryLimit) {
        if (entryLimit) {
            click(entryLimitSwitch);
        }
        return this;
    }
    @Step("Set the entry limit minimum value")
    public SurveyBuilder setEntryLimitMin(int minimum) {
        setText(entryLimitTxtMinValue, String.valueOf(minimum));
        return this;
    }
    @Step("et the entry limit maximum value")
    public SurveyBuilder setEntryLimitMax(int maximum) {
        setText(entryLimitTxtMaxValue, String.valueOf(maximum));
        return this;
    }
    @Step("Set the limit type")
    public SurveyBuilder setLimitType(String limitType) {
        // Available values: Character, Word
        click(limitTypeDropdown);
        click(getLimitTypeOption(limitType));
        return this;
    }
    @Step("Enter data into the text input field")
    public SurveyBuilder enterDataIntoTextInput(String data) {
        setText(txtInput, data);
        return this;
    }
    @Step("Clear the text input field by using CTRL A + CTRL X")
    public SurveyBuilder clearInputTxt() {
        sendKeys(txtInput, Keys.CONTROL, "A");
        sendKeys(txtInput, Keys.CONTROL, "X");
        return this;
    }

    @Step("Enter data into the email input field")
    public SurveyBuilder enterDataIntoNumberInput(String data) {
        setText(numberInput, data);
        return this;
    }
    @Step("Get the invalid error locator")
    public By getInvalidErrorMsg() {
        // Available values: Not A Valid Email, Not A Valid URL, Numeric only, Alphabetic Only
        return By.xpath("//em[contains(@class,'errorIcon')]/parent::div");
    }
    @Step("Change the alignment of the question")
    public SurveyBuilder changeAlignment(String alignment) {
        // Available values: Top, Inline
        click(getAlignmentOption(alignment));
        return this;
    }

    /////////////////////// Input Element :: General Settings \\\\\\\\\\\\\\\\\\\\\\
    @Step("Set the tooltip text")
    public SurveyBuilder setTooltip(String tooltipText) {
        setText(tooltip, tooltipText);
        return this;
    }

    @Step("Set the question as required")
    public SurveyBuilder setRequired(boolean required) {
        if (required) {
            click(requiredSwitch);
        }
        return this;
    }
    @Step("Set the question as to be attachable")
    public SurveyBuilder setAttachment(boolean attachment) {
        if (attachment) {
            click(attachmentSwitch);
        }
        return this;
    }
    @Step("Set the attachment type")
    public SurveyBuilder setAttachmentType(String attachmentType) {
        // Available values: Images, Files, Both
        switch (attachmentType) {
            case "Images" -> click(attachmentImages);
            case "Files" -> click(attachmentFiles);
            case "Both" -> click(attachmentBoth);
        }
        return this;
    }

    @Step("Set the attachment limit")
    public SurveyBuilder setAttachmentsLimit(boolean attachmentsLimit, int limit) {
        if (attachmentsLimit) {
            click(attachmentsLimitSwitch);
            for (int i = 1; i <= limit; i++) {
                click(increaseAttachmentsLimitIcon);
            }
        }
        return this;
    }

    @Step("Set the note as required")
    public SurveyBuilder setNote(boolean note) {
        if (note) {
            click(noteSwitch);
        }
        return this;
    }

    ///////////////////////// Text Area Element \\\\\\\\\\\\\\\\\\\\\\
    @Step("Set the editor type")
    public SurveyBuilder setEditorType(String type) {
        click(getEditorType(type));
        return this;
    }

    @Step("Set the text editor to be opened in a full screen")
    public SurveyBuilder setFullScreen(boolean fullScreen) {
        if (fullScreen) {
            click(fullScreenSwitch);
        }
        return this;
    }

    @Step("Set the text editor to be auto expandable")
    public SurveyBuilder setAutoExpand(boolean autoExpand) {
        if (autoExpand) {
            click(autoExpandSwitch);
        }
        return this;
    }
    @Step("Enter data into the text area field")
    public SurveyBuilder enterDataIntoTextAreaInput(String data) {
        setText(txtPlainEditorInput, data);
        return this;
    }

    ///////////////////////// Number Element \\\\\\\\\\\\\\\\\\\\\\
    @Step("Set the decimal places")
    public SurveyBuilder setDecimalPlaces(int num) {
        setText(decimalPlaces, String.valueOf(num));
        return this;
    }

    @Step("Set the number default answer")
    public SurveyBuilder setNumberDefaultAnswer(String answer) {
        setText(numberDefaultAnswer, answer);
        return this;
    }

    @Step("Set the number stepper value")
    public SurveyBuilder setStepper(int num) {
        setText(stepper, String.valueOf(num));
        return this;
    }

    @Step("Set the number value limit")
    public SurveyBuilder setValueLimit() {
        click(valueLimitSwitch);
        return this;
    }

    @Step("Set the number entry limit minimum value")
    public SurveyBuilder setLimitMinValue(int num) {
        setText(entryLimitTxtMinValue, String.valueOf(num));
        return this;
    }

    @Step("Set the number entry limit maximum value")
    public SurveyBuilder setLimitMaxValue(int num) {
        setText(entryLimitTxtMaxValue, String.valueOf(num));
        return this;
    }
    @Step("Set the number value limit minimum value")
    public SurveyBuilder setValueLimitMin(int num) {
        setText(valueLimitTxtMin, String.valueOf(num));
        return this;
    }

    @Step("Set the number limit maximum value")
    public SurveyBuilder setValueLimitMax(int num) {
        setText(valueLimitTxtMax, String.valueOf(num));
        return this;
    }

    @Step("Increase the number value")
    public SurveyBuilder increaseNumber() {
        click(increaseIconPreview);
        return this;
    }

    @Step("Decrease the number value")
    public SurveyBuilder decreaseNumber() {
        click(decreaseIconPreview);
        return this;
    }

    ///////////////////////// Date & Time Element \\\\\\\\\\\\\\\\\\\\\\
    @Step("Set the date and time type")
    public SurveyBuilder setDateAndTimeType(String type) {
        click(typeDropdown);
        click(getDateAndTimeType(type));
        return this;
    }

    @Step("Set the selection mode")
    public SurveyBuilder setSelectionMode(String mode) {
        click(getSelectionMode(mode));
        return this;
    }

    @Step("Set the date format")
    public SurveyBuilder setDateFormat(String format) {
        click(getDateFormatting(format));
        return this;
    }

    @Step("Set the first day of the week")
    public SurveyBuilder setFirstDayOfWeek(String day) {
        click(firstDayOfWeekDropdown);
        click(getDayOfWeek(day));
        return this;
    }

    @Step("Enable the 'Default Date' switch")
    public SurveyBuilder setDefaultDateSwitch(boolean dateSwitch) {
        if (dateSwitch) {
            click(defaultDateSwitch);
        }
        return this;
    }

    @Step("Enable the 'Disable Days' switch")
    public SurveyBuilder setDisableDaysSwitch(boolean disableDays) {
        if (disableDays) {
            click(disableDaysSwitch);
        }
        return this;
    }

    @Step("Enable the 'Date Validation' switch")
    public SurveyBuilder setDateValidationSwitch(boolean dateSwitch) {
        if (dateSwitch) {
            click(dateValidationSwitch);
        }
        return this;
    }

    @Step("Enable the 'Disable Dates' switch")
    public SurveyBuilder setDisableDatesSwitch(boolean disableDates) {
        if (disableDates) {
            click(disableDatesSwitch);
        }
        return this;
    }

    ///////////////////////// Map Element \\\\\\\\\\\\\\\\\\\\\\
    @Step("Set the map zip location")
    public SurveyBuilder setZipCode(boolean zipCode) {
        if (zipCode) {
            click(zipCodeSwitch);
        }
        return this;
    }

    ///////////////////////// Single Choice Element \\\\\\\\\\\\\\\\\\\\\\

    @Step("Click on the 'Add Option' button")
    public SurveyBuilder clickAddOption() {
        dbClick(btnAddOption);
        return this;
    }

    @Step("Set the question options")
    public SurveyBuilder setOptions(String[] options) {
        clickAddOption();
        for (int i = 0; i < options.length; i++) {
            setText(getTxtOption(Integer.parseInt(String.valueOf(i))), options[i]);
            clickAddOption();
        }
        return this;
    }


    @Step("Enable the 'Display Other option' switch")
    public SurveyBuilder setDisplayOtherOption(boolean displayOtherOption) {
        if (displayOtherOption) {
            click(displayOtherOptionSwitch);
        }
        return this;
    }

    @Step("Enable the 'Display None of the Above option' switch")
    public SurveyBuilder setDisplayNAOptionSwitch(boolean required) {
        if (required) {
            click(displayNAOptionSwitch);
        }
        return this;
    }

    @Step("Enable the 'Shuffle Options' switch")
    public SurveyBuilder setShuffleOptionsSwitch(boolean required) {
        if (required) {
            click(shuffleOptionsSwitch);
        }
        return this;
    }

    ///////////////////////// Dropdown Menu Element \\\\\\\\\\\\\\\\\\\\\\
    @Step("Click on the 'Dropdown Menu' on the preview mode")
    public SurveyBuilder clickDropdownMenuPreview() {
        click(selectDropdownMenuPreview);
        return this;
    }

    ///////////////////////// Rating Element \\\\\\\\\\\\\\\\\\\\\\

    @Step("Set the rating default answer")
    public SurveyBuilder setRatingDefaultAnswer(String val) {
        setText(ratingDefaultAnswerDropdown, val);
        return this;
    }

    @Step("Click on the rating type dropdown")
    public SurveyBuilder clickRatingTypeDropdown() {
        click(ratingDefaultTypeDropdown);
        return this;
    }

    @Step("Set the rating scale")
    public SurveyBuilder setScale(String scale) {
        setText(scaleValue, scale);
        return this;
    }

    @Step("Set the rating type")
    public SurveyBuilder setRatingType(String type) {
        clickRatingTypeDropdown();
        click(getRatingValue(type));
        return this;
    }

    ///////////////////////// Face Rating Element \\\\\\\\\\\\\\\\\\\\\\
    @Step("Click on the face rating default answer field")
    public SurveyBuilder clickFaceRatingDefaultAnswerDropdown() {
        click(faceRatingDefaultAnswerDropdown);
        return this;
    }
    @Step("Set the face rating default answer")
    public SurveyBuilder setFaceRatingDefaultAnswer(String val) {
        clickFaceRatingDefaultAnswerDropdown();
        click(getFaceRatingValue(val));
        return this;
    }


    ///////////////////////// Slider Element \\\\\\\\\\\\\\\\\\\\\\
    @Step("Set the rating selection type")
    public SurveyBuilder setRatingSelectionType(String type) {
        click(getSliderSelectionType(type));
        return this;
    }

    @Step("Set the slider step value")
    public SurveyBuilder setStep(String val) {
        setText(Step, val);
        return this;
    }

    @Step("Set the slider min default answer")
    public SurveyBuilder setSliderMinDefaultAnswer(String val) {
        setText(sliderMinDefaultAnswer, val);
        return this;
    }
    @Step("Set the slider max default answer")
    public SurveyBuilder setSliderMaxDefaultAnswer(String val) {
        setText(sliderMaxDefaultAnswer, val);
        return this;
    }

    ///////////////////////// Submission Mode \\\\\\\\\\\\\\\\\\\\\\
    @Step("Assert the presence of the view results button")
    public SurveyBuilder assertViewResultsButton() {
        try {
            boolean isDisplayed = driver.findElement(btnViewResults).isDisplayed();
            Assert.assertTrue(isDisplayed, "View Results button is displayed");
        } catch (NoSuchElementException e) {
            Assert.fail("View Results button does not exist in the DOM");
        }
        return this;
    }

    @Step("Assert the title of the anonymous identity title")
    public SurveyBuilder assertAnonymousIdentityTitle(String title) {
        softAssertionContain(txtAnonymousIdentityTitle, title);
        return this;
    }
    @Step("Assert the description of the anonymous identity title")
    public SurveyBuilder assertAnonymousIdentityDescription(String title) {
        softAssertionContain(txtAnonymousIdentityDescription, title);
        return this;
    }

    @Step("Assert the text of the multiple submissions header")
    public SurveyBuilder assertMultipleSubmissionsHeader(String header) {
        softAssertionContain(txtMultipleSubmissionsHeader, header);
        return this;
    }
    @Step("Assert the text of the multiple submissions label")
    public SurveyBuilder assertMultipleSubmissionsLabel(String label) {
        softAssertionContain(txtMultipleSubmissionsLabel, label);
        return this;
    }
    @Step("Assert the presence of the submit again button")
    public SurveyBuilder assertSubmitAgainButton() {
        try {
            boolean isDisplayed = driver.findElement(btnSubmitAgain).isDisplayed();
            Assert.assertTrue(isDisplayed, "Submit Again button is displayed");
        } catch (NoSuchElementException e) {
            Assert.fail("Submit Again button does not exist in the DOM");
        }
        return this;
    }
    @Step("Assert the presence of the view response button")
    public SurveyBuilder assertViewResponseButton() {
        try {
            boolean isDisplayed = driver.findElement(btnViewResponse).isDisplayed();
            Assert.assertTrue(isDisplayed, "View Response button is displayed");
        } catch (NoSuchElementException e) {
            Assert.fail("View Response button does not exist in the DOM");
        }
        return this;
    }
    @Step("Assert the presence of the edit response button")
    public SurveyBuilder assertEditResponseButton() {
        try {
            boolean isDisplayed = driver.findElement(btnEditResponse).isDisplayed();
            Assert.assertTrue(isDisplayed, "Edit Response button is displayed");
        } catch (NoSuchElementException e) {
            Assert.fail("Edit Response button does not exist in the DOM");
        }
        return this;
    }
    @Step("Assert the presence of the password input field")
    public SurveyBuilder assertPasswordInputField() {
        softAssert.assertTrue(isDisplayed(btnPasswordOnPreview));
        return this;
    }
    @Step("Enter data into the password field")
    public SurveyBuilder enterPassword(String password) {
        setText(btnPasswordOnPreview, password);
        return this;
    }
    @Step("Click on the continue button")
    public SurveyBuilder clickContinueButton() {
        click(btnContinueOnPreview);
        return this;
    }

    @Step("Assert the invalid password error message")
    public SurveyBuilder assertInvalidPasswordErrorMsg(String msg) {
        softAssertionContain(txtInvalidPassword, msg);
        return this;
    }

    @Step("Asser the presence of the captcha form")
    public SurveyBuilder assertPresenceOfCaptchaForm() {
        softAssert.assertTrue(isDisplayed(captchaModal));
        return this;
    }

    @Step("Assert the presence of the captcha modal")
    public SurveyBuilder assertCaptchaFormTitle(String title) {
        softAssertionContain(txtCaptchaFormTitle, title);
        return this;
    }

    @Step("Assert the private survey header message")
    public SurveyBuilder assertPrivateSurveyHeaderMsg(String header) {
        softAssertionContain(txtPrivateSurveyHeader, header);
        return this;
    }
    @Step("Assert the private survey label message")
    public SurveyBuilder assertPrivateSurveyLabelMsg(String label) {
        softAssertionContain(txtPrivateSurveyLabel, label);
        return this;
    }
    @Step("Assert the presence of the private survey sign in button")
    public SurveyBuilder assertPrivateSurveySignInBtn() {
        softAssert.assertTrue(isDisplayed(btnPrivateSurveySignIn));
        return this;
    }

}
