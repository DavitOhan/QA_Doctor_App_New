Feature: Create New Appointment
  @createNewAppointment
  Scenario: Check User create new appointment with valid data
    Given User launches Chrome Browser
    When User opens Main Page
    And User clicks on SingIn link
    And User enters valid Data
    And User clicks on SingIn button
    And User verifies Upcoming Page title is displayed
    And User clicks on All Appointments button
    And User verifies My Appointments Page title is displayed
    And  User clicks on Add New button
    And  User clicks on Date link
    And  User enters valid VisitDate
    And  User clicks on Doctor link
    And  User select New Doctor
    And  User clicks on Time Button
    And User clicks on Save button

    Then  User verifies save Appointment  is displayed



  @updateAppointmentsTimes
  Scenario: Check User update appointments time
    Given User launches Chrome Browser
    When User opens Main Page
    And User clicks on SingIn link
    And User enters valid Data
    And User clicks on SingIn button
    And User verifies Upcoming Page title is displayed
    And User clicks on All Appointments button
    And User clicks on Add New button
    And User clicks on Date link
    And User enters valid VisitDate
    And User clicks on Doctor link
    And User select New Doctor
    And User clicks on Time Button
    And User clicks on Save button
    And User verifies save Appointment  is displayed
    And User clicks on View button
    And User clicks Available timeslots link
    And User clicks on Save button
    Then User verifies save Appointment  is displayed


    @canselAppointments
    Scenario: Check User cansel appointments
      Given User launches Chrome Browser
      When User opens Main Page
      And User clicks on SingIn link
      And User enters valid Data
      And User clicks on SingIn button
      And User verifies Upcoming Page title is displayed
      And User clicks on All Appointments button
      And User verifies My Appointments Page title is displayed
      And  User clicks on Add New button
      And  User clicks on Date link
      And  User enters valid VisitDate
      And  User clicks on Doctor link
      And  User select New Doctor
      And  User clicks on Time Button
      And User clicks on Save button
      And User clicks on View button
      And User clicks Available timeslots link
      And User clicks on Save button
      And User clicks on Cansel button
      Then  User verifies save Appointment  is displayed