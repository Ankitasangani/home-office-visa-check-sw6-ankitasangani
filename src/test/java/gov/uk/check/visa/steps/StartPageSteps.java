package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.StartPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StartPageSteps {
    @Given("I am on the home page")
    public void iAmOnTheHomePage() {
    }

    @When("I click on the start button")
    public void iClickOnTheStartButton() {
        new StartPage().clickStartNow();
    }

    @When("I accept all cookies")
    public void iAcceptAllCookies() {
        new StartPage().clickOnAcceptCookies();
    }
}
