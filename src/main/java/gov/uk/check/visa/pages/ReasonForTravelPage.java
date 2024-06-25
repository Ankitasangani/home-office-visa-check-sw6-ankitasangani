package gov.uk.check.visa.pages;


import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * 5.ReasonForTravelPage - nextStepButton, reasonForVisitList locators and create methods  'void selectReasonForVisit(String reason)'
 * and  'void clickNextStepButton()'
 */
public class ReasonForTravelPage extends Utility {

    private static final Logger log = LogManager.getLogger(ReasonForTravelPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//div[@class='govuk-radios']//div/input")
    List<WebElement> reasonForVisitList;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement nextStepButton;

    public void selectReasonForVisit(String reason) {
        int size = reasonForVisitList.size();
        for (int i = 0; i < size; i++) {
            String val = reasonForVisitList.get(i).getAttribute("value");
            if (val.equalsIgnoreCase(reason)) {
                reasonForVisitList.get(i).click();
                break;
            }
            log.info("Select " + reasonForVisitList.toString());
        }
    }

    public void clickNextStepButton() {
        clickOnElement(nextStepButton);
        log.info("Click on  " + nextStepButton.toString());
    }
}
