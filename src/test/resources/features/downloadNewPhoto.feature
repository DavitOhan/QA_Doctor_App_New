Feature: Download Photo Profile
  @downloadPhoto
  Scenario: Check User can download new photo
    Given User launches Chrome Browser
    When User opens Main Page
    And User clicks on SingIn link
    And User enters valid Data
    And User clicks on SingIn button
    And User verifies Upcoming Page title is displayed
    And User clicks on Profile link
    And User download new Photo
    And User clicks on Save information button
    Then User verifies Profile update Page is displayed