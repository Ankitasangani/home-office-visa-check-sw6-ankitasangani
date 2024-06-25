package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.DurationOfStayPage;
import io.cucumber.java.en.And;

public class DurationOfStayPageSteps {
    @And("I select intended to stay for {string}")
    public void iSelectIntendedToStayFor(String time) {
        new DurationOfStayPage().selectLengthOfStay(time);
    }


}
