Feature: Update Profile Information
  @updateNumberAdress
  Scenario: Check User can login with valid data
    Given User launches Chrome Browser
    When User opens Main Page
    And User clicks on SingIn link
    And User enters valid Data
    And User clicks on SingIn button
    And User verifies Upcoming Page title is displayed
    And User clicks on Profile link
    And User clicks on Phone link
    And User enters valid Phone Number
    And User clicks on Adress link
    And User enters valid Adress
    And User clicks on Save information button
    Then User verifies Profile update Page is displayed
