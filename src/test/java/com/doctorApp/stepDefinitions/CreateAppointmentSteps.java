package com.doctorApp.stepDefinitions;

import com.doctorApp.pages.CreateAppointmentPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static com.doctorApp.pages.BasePage.driver;

public class CreateAppointmentSteps  {


    @And("User clicks on All Appointments button")
    public void clicks_on_AllAppointments_button(){
        new CreateAppointmentPage(driver).clickOnAllAppointmentsButton();
    }
    @And("User verifies My Appointments Page title is displayed")
    public void verifies_appointments_page_is_displayed() {
        new CreateAppointmentPage(driver).isMyAppointmentsPageDisplayed();
    }
    @And("User clicks on Add New button")
    public void user_clicks_on_add_new_button(){
        new CreateAppointmentPage(driver).clickOnAddNewButton();
    }
    @Then("User verifies Edit Appointment title is displayed")
    public void user_verifies_edit_appointment_title_is_displayed() {
        new CreateAppointmentPage(driver).isAppointmentPageDisplayed();
    }
}
