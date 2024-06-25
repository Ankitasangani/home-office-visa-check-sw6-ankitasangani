package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.ReasonForTravelPage;
import io.cucumber.java.en.And;

public class ReasonForTravelPageSteps {
    @And("I select reason {string}")
    public void iSelectReason(String reason) {
        new ReasonForTravelPage().selectReasonForVisit(reason);
    }

    @And("I click on the Continue button after select reason")
    public void iClickOnTheContinueButtonAfterSelectReason() {
        new ReasonForTravelPage().clickNextStepButton();
    }

    @And("I select reason {string} for come to the UK")
    public void iSelectReasonForComeToTheUK(String reason) {
        new ReasonForTravelPage().selectReasonForVisit(reason);
    }

    @And("I select reason {string} for coming to the UK")
    public void iSelectReasonForComingToTheUK(String reason) {
        new ReasonForTravelPage().selectReasonForVisit(reason);
    }
}
