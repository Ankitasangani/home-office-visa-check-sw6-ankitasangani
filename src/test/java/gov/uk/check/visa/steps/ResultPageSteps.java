package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.ResultPage;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class ResultPageSteps {

    @Then("I should get the result that You will not need a visa to come to the UK")
    public void iShouldGetTheResultThatYouWillNotNeedAVisaToComeToTheUK() {
        Assert.assertEquals(new ResultPage().getResultMessage(), "You will not need a visa to come to the UK");
    }

    @Then("I should get the result You need a visa to work in health and care")
    public void iShouldGetTheResultYouNeedAVisaToWorkInHealthAndCare() {
        Assert.assertEquals(new ResultPage().getDisplayedText(), "You need a visa to work in health and care");
    }

    @Then("I should get the result You’ll need a visa to join your family or partner in the UK")
    public void iShouldGetTheResultYouLlNeedAVisaToJoinYourFamilyOrPartnerInTheUK() {
        Assert.assertEquals(new ResultPage().getYouNeedVisaText(), "You may need a visa");
    }
}
