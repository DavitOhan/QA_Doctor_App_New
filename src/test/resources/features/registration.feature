Feature: Registration
  @validNewData
  Scenario: Check User can Registration with valid data
    Given User launches Chrome Browser
    When User opens Main Page
    And User clicks on SingUp link
    And User enters valid NewData
    And User clicks on SingUp button
    Then User verifies Upcoming Page title is displayed
    And User quites browser