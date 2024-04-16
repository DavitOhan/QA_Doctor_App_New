package com.doctorApp.stepDefinitions;

import com.doctorApp.pages.HomePage;
import com.doctorApp.pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static com.doctorApp.pages.BasePage.driver;

public class LoginSteps {
    @And("User clicks on SingIn link")
    public void clicks_on_SingIn_link(){
        new HomePage(driver).clickOnSingInLink();
    }

    @And("User enters valid Data")
    public void enter_valid_Data(){
        new LoginPage(driver).enterData("Near23@gmail.com","12345678!!Aa");
    }

    @And("User clicks on SingIn button")
    public void clicks_on_SingIn_button(){
        new LoginPage(driver).clickOnSingInButton();
    }
    @Then("User verifies Upcoming Page title is displayed")
    public void verifies_Upcoming_Page_title_is_displayed(){
        new LoginPage(driver).isUpcomingPageDisplayed();
    }
    @And("User enters valid email end invalid password")
    public void enter_invalid_password(DataTable dataTable){
        new LoginPage(driver).enterInvalidPassword(dataTable);

    }
    @Then("User verifies Error message displayed")
    public void verify_Error_message(){
        new LoginPage(driver).IsErrorDisplayed();
    }
}
