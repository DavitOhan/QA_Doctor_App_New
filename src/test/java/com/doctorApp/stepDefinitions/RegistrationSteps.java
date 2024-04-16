package com.doctorApp.stepDefinitions;

import com.doctorApp.pages.HomePage;
import com.doctorApp.pages.RegistrationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static com.doctorApp.pages.BasePage.driver;

public class RegistrationSteps {

    @And("User clicks on SingUp link")
    public void clicks_on_SingUp_link(){
        new HomePage(driver).clickOnSingUpLink();
    }

    @And("User enters valid NewData")
    public void enter_valid_NewData(){
        new RegistrationPage(driver).enterNewData("Karl","Near","Near23@gmail.com","12345678!!Aa");
    }

    @And("User clicks on SingUp button")
    public void clicks_on_SingUp_button(){
        new RegistrationPage(driver).clickOnSingUpButton();
    }
    @Then("User verifies Upcoming Page title ")
    public void Upcoming_Page_title(){
        new RegistrationPage(driver).isUpcomingNewPageDisplayed();
    }

}
