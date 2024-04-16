Feature: Create Appointment Page
  @createAppointment
  Scenario: Check User can create new appointment with valid data
    Given User launches Chrome Browser
    When User opens Main Page
    And User clicks on SingIn link
    And User enters valid Data
    And User clicks on SingIn button
    And User verifies Upcoming Page title is displayed
    And User clicks on All Appointments button
    And User verifies My Appointments Page title is displayed
    And  User clicks on Add New button
    Then  User verifies Edit Appointment title is displayed


