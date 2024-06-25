Feature: Check The country dropdown list
  As a User
  I want to check that following country are available is drop down list

  @smoke @sanity @regression
  Scenario Outline: Verify the following country available in country dropdown list
    Given I am on the home page
    When I click on the start button
    Then I can see following "<country>" into dropdown
    Examples:
      | country                  |
      | albania                  |
      | bhutan                   |
      | british-protected-person |
      | haiti                    |
      | kazakhstan               |
      | mozambique               |
      | norway                   |
      | portugal                 |
      | russia                   |
      | zambia                   |
