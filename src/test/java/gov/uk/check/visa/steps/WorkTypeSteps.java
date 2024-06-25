package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.WorkTypePage;
import io.cucumber.java.en.And;

public class WorkTypeSteps {
    @And("I select planning to work for {string}")
    public void iSelectPlanningToWorkFor(String work) {
      new WorkTypePage().selectJobType(work);
    }
}
