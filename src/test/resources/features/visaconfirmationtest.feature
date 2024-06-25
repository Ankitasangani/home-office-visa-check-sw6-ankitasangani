Feature: Visa Confirmation Test
  In Order to perform visa confirmation test
  As a User
  I have to enter correct details

  @sanity @smoke @regression
  Scenario: An Australian Coming To UK For Tourism
    Given I am on the home page
    When I accept all cookies
    And I click on the start button
    And I select a nationality "Australia"
    And I click on the Continue button
    And I select reason "Tourism"
    And I click on the Continue button after select reason
    Then I should get the result that You will not need a visa to come to the UK

  @smoke @regression
  Scenario: A Chilean Coming To The UK For Work And Plans On Staying For Longer Than Six Months
    Given I am on the home page
    When I accept all cookies
    And I click on the start button
    And I select a nationality "Chile" from dropdown
    And I click on the Continue button
    And I select reason "Work, academic visit or business" for come to the UK
    And I click on the Continue button
    And I select intended to stay for "longer than 6 months"
    And I click on the Continue button
    And I select planning to work for "Health and care professional"
    And I click on the Continue button
    Then I should get the result You need a visa to work in health and care

  @regression
  Scenario: A Colombian National Coming To The UK To Join A Partner For A Long Stay They Do Have An Article 10 Or 20 Card
    Given I am on the home page
    When I accept all cookies
    And I click on the start button
    And I select a nationality "Colombia" from nationality
    And I click on the Continue button
    And I select reason "Join partner or family for a long stay" for coming to the UK
    And I click on the Continue button
    And I select state My partner or family member have UK immigration status "yes"
    And I click on the Continue button
    Then I should get the result You’ll need a visa to join your family or partner in the UK

