package com.doctorApp.stepDefinitions;

import com.doctorApp.pages.LoginPage;
import com.doctorApp.pages.UpdateProfilePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static com.doctorApp.pages.BasePage.driver;

public class UpdateProfileSteps {

    @And("User clicks on Profile link")
    public void userClicksOnProfileLink() {
        new LoginPage(driver).clicksOnProfileLink();
    }

    @And("User clicks on Phone link")
    public void userClicksOnPhoneLink() {
        new UpdateProfilePage(driver).clicksOnPhoneLink();
    }
    @And("User enters valid Phone Number")
    public void userEntersValidPhoneNumber() {
        new UpdateProfilePage(driver).entersValidNumber();
    }
    @And("User clicks on Adress link")
    public void userClicksOnAdressLink() {
        new UpdateProfilePage(driver).clicksOnAdressLink();
    }
    @And("User enters valid Adress")
    public void userEntersValidAdress() {
        new UpdateProfilePage(driver).entersValidAdress();
    }
    @And("User clicks on Save information button")
    public void userClicksOnSaveInformationButton() {
        new UpdateProfilePage(driver).clicksOnSaveInfo();
    }
    @Then("User verifies Profile update Page is displayed")
    public void userVerifiesProfileUpdatePageIsDisplayed() {
        new UpdateProfilePage(driver).isUpdatePageDisplayed();
    }
}
