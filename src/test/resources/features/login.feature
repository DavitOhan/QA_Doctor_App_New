Feature: Login
  @validData
  Scenario: Check User can login with valid data
    Given User launches Chrome Browser
    When User opens Main Page
    And User clicks on SingIn link
    And User enters valid Data
    And User clicks on SingIn button
    Then User verifies Upcoming Page title is displayed

@invalidPassword
  Scenario Outline: Check User can't  login with invalid password
    Given User launches Chrome Browser
    When User opens Main Page
    And User clicks on SingIn link
    And User enters valid email end invalid password
  |  email     |  password        |
  |  <email>   |  <password>      |
    And User clicks on SingIn button
    Then User verifies Error message displayed
    And User quites browser
  Examples:
    | email           | password     |
    | Cucu@gmail.com  | 1234567890A  |
    | Cucu@gmail.com  | 1234567890a  |
    | Cucu@gmail.com  | !"§$%&/()=?  |
    | Cucu@gmail.com  | QWERTZUIOPÜ  |
    | Cucu@gmail.com  | 12345678901  |
    | Cucu@gmail.com  | AAAAAAAAAA!  |