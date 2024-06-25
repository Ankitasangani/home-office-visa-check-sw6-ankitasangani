package gov.uk.check.visa.pages;


import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * 1.StartPage - startNowButton locators and create method 'void clickStartNow()'
 */
public class StartPage extends Utility {

    private static final Logger log = LogManager.getLogger(StartPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//a[@class='gem-c-button govuk-button govuk-button--start']")
    WebElement startNowButton;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Accept additional cookies']")
    WebElement acceptCookies;


    public void clickStartNow() {
        clickOnElement(startNowButton);
        log.info("Click On: " + startNowButton.toString());
    }

    public void clickOnAcceptCookies(){
        log.info("Clicking on AcceptCookies : " + acceptCookies.toString());
        clickOnElement(acceptCookies);
    }
}
