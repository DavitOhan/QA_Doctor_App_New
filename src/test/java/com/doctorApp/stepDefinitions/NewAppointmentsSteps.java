package com.doctorApp.stepDefinitions;


import com.doctorApp.pages.NewAppoinmentPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static com.doctorApp.pages.BasePage.driver;

public class NewAppointmentsSteps {
    @And ("User clicks on Date link")
    public void ClicksOnDateLink() {
        new NewAppoinmentPage(driver).clickOnVisitDataLink();

    }

    @And  ("User enters valid VisitDate")
    public void EntersValidVisitDate() {
        new NewAppoinmentPage(driver).enterVisitData("16","08", "2024");

    }


    @And  ("User clicks on Doctor link")
    public void ClicksOnDoctorLink() {
        new NewAppoinmentPage(driver).clickOnDocotorLink();
    }

    @And  ("User select New Doctor")
    public void SelectNewDoctor() {
       new NewAppoinmentPage(driver).selectDoctor("Dr. Michael Smith");
    }

    @And("User clicks on Time Button")
    public void ClicksOnTimeButton() {
        new NewAppoinmentPage(driver).clickOnTimeButton();
    }

    @And("User clicks on Save button")
    public void ClicksOnSaveButton() {
        new NewAppoinmentPage(driver).clickOnAppointmentSaveButton();
    }

    @Then("User verifies save Appointment  is displayed")
    public void verifiesSaveAppointmentIsDisplayed() {
        new NewAppoinmentPage(driver).isAppointmentDisplayed();
    }
    @And("User clicks on View button")
    public void ClicksOnViewButton() {
        new NewAppoinmentPage(driver).clickOnViewButton();
    }
    @And("User clicks Available timeslots link")
    public void ClicksAvailableTimeslotsLink() {
        new NewAppoinmentPage(driver).clickOnNewTimeLost();
    }
    @And("User clicks on Cansel button")
    public void ClicksOnCanselButton() {
        new NewAppoinmentPage(driver).clickOnCanselButton();

    }

}
