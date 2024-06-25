package gov.uk.check.visa.pages;


import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * 6.FamilyImmigrationStatusPage - nextStepButton, yes, no locators and create methods 'void selectImmigrationStatus(String status)'
 * (Note: Use switch statement for select immigration status) and 'void clickNextStepButton()'
 */
public class FamilyImmigrationStatusPage extends Utility {

    private static final Logger log = LogManager.getLogger(FamilyImmigrationStatusPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement nextStepButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='govuk-radios']//input[@id='response-0']")
    WebElement yesRadio;

    @CacheLookup
    @FindBy(xpath = "//div[@class='govuk-radios']//input[@id='response-1']")
    WebElement noRadio;

    public void clickNextStepButton() {
        log.info("Click on " + nextStepButton.toString());
        clickOnElement(nextStepButton);
    }

    public void selectImmigrationStatus(String status) {
        switch (status) {
            case "yes":
                //  CustomListeners.test.log(Status.PASS, "Selecting on Yes : " + status + " to " + yesRadio);
                clickOnElement(yesRadio);
                break;
            case "no":
                //CustomListeners.test.log(Status.PASS, "Selecting on No : " + status + " to " + noRadio);
                clickOnElement(noRadio);
                break;
        }
    }
}
