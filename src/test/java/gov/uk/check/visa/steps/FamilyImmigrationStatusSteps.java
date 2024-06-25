package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.FamilyImmigrationStatusPage;
import io.cucumber.java.en.And;

public class FamilyImmigrationStatusSteps {
    @And("I select state My partner or family member have UK immigration status {string}")
    public void iSelectStateMyPartnerOrFamilyMemberHaveUKImmigrationStatus(String status) {
        new FamilyImmigrationStatusPage().selectImmigrationStatus(status);
    }
}
