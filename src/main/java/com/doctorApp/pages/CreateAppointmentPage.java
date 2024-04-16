package com.doctorApp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAppointmentPage extends BasePage{
    public CreateAppointmentPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//button[@type='button']")
    WebElement allAppointmentButton;
    public CreateAppointmentPage clickOnAllAppointmentsButton() {
        click(allAppointmentButton);
        return this;
    }

    @FindBy(css = ".appointments-table")
    WebElement appointmentTable;
    public CreateAppointmentPage isMyAppointmentsPageDisplayed() {
        assert isElementDisplayed(appointmentTable);
        return this;
    }
@FindBy(xpath= "//*[@class='btn btn-danger']")
WebElement addNewButton;
    public CreateAppointmentPage clickOnAddNewButton() {
        click(addNewButton);
        return this;
    }
@FindBy(xpath = "//h3[contains(.,'Available timeslots:')]")
WebElement appointmentTitle;
    public CreateAppointmentPage isAppointmentPageDisplayed() {
        assert isElementDisplayed(appointmentTitle);
        return this;

    }
}
