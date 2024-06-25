package gov.uk.check.visa.pages;


import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * 2.WorkTypePage - nextStepButton, selectJobTypeList locators and create methods  'void selectJobType(String job)'
 *   and 'void clickNextStepButton()'
 */
public class WorkTypePage extends Utility {

    private static final Logger log = LogManager.getLogger(WorkTypePage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-1']")
    List<WebElement> selectJobTypeList;


    public void selectJobType(String job){
        int size = selectJobTypeList.size();
        for (int i = 0; i < size; i++) {
            String val = selectJobTypeList.get(i).getAttribute("value");
            if (val.equalsIgnoreCase(job))
                selectJobTypeList.get(i).click();
            break;
        }
        log.info("Select " + selectJobTypeList.toString());
    }

}
