package gov.uk.check.visa.pages;


import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * 3.SelectNationalityPage -nationalityDropDownList, nextStepButton locators and create methods  'void selectNationality(String nationality)'
 * and 'void clickNextStepButton()'
 */
public class SelectNationalityPage extends Utility {

    private static final Logger log = LogManager.getLogger(SelectNationalityPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//select[@id='response']")
    WebElement nationalityDropDownList;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement nextStepButton;


    public void selectNationality(String nationality) {
        selectByVisibleTextFromDropDown(nationalityDropDownList, nationality);
        log.info("Select " + nationalityDropDownList.toString());
    }

    public void clickNextStepButton() {
        clickOnElement(nextStepButton);
        log.info("Click on " + nextStepButton.toString());
    }
}
