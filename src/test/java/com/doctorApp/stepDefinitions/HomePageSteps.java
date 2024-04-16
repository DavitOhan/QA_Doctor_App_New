package com.doctorApp.stepDefinitions;

import com.doctorApp.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.doctorApp.pages.BasePage.driver;

public class HomePageSteps {

    @Given("User launches Chrome Browser")
    public void launches_Chrome_Browser() {
        new HomePage(driver).launchBrowser();
    }

    @When("User opens Main Page")
    public void open_doctorApp_MainPage() {
        new HomePage(driver).openUrl();
    }

    @Then("User verifies Main Page title is displayed")
    public void verify_MainPage_title() {
        new HomePage(driver).isHomePageTitleDisplayed();
    }

    @And("User quites browser")
    public void quit_browser() {
        new HomePage(driver).quit();
    }
}