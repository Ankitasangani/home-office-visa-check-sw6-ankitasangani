package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.SelectNationalityPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class SelectNationalityTestSteps {
    @And("I select a nationality {string}")
    public void iSelectANationality(String nationality) {
        new SelectNationalityPage().selectNationality(nationality);
    }

    @And("I click on the Continue button")
    public void iClickOnTheContinueButton() {
        new SelectNationalityPage().clickNextStepButton();
    }

    @And("I select a nationality {string} from dropdown")
    public void iSelectANationalityFromDropdown(String nationality) {
        new SelectNationalityPage().selectNationality(nationality);
    }

    @And("I select a nationality {string} from nationality")
    public void iSelectANationalityFromNationality(String nationality) {
        new SelectNationalityPage().selectNationality(nationality);
    }

    @Then("I can see following {string} into dropdown")
    public void iCanSeeFollowingIntoDropdown(String country) {
        new SelectNationalityPage().selectNationality(country);
    }
}
