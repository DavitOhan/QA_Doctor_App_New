package com.doctorApp.pages;

import io.cucumber.datatable.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Map;

public class NewAppoinmentPage extends BasePage {
    public NewAppoinmentPage(WebDriver driver) {
        super(driver);
    }


@FindBy(xpath = "//input[@name='appointmentDate']")
    WebElement appointmentDate;
    public NewAppoinmentPage clickOnVisitDataLink() {
    click(appointmentDate);
    return this;
    }

    public NewAppoinmentPage enterVisitData(DataTable data) {
        List<Map<String,String>> table = data.asMaps();
        String day = table.get(0).get("day");
        String month = table.get(0).get("month");
        String year = table.get(0).get("year");

        enterVisitData(day, month, year);
        return this;
    }

    public void enterVisitData(String day, String month, String year) {

    }
@FindBy(xpath = "//select[@name='doctorId']")
WebElement doctorId;
    public NewAppoinmentPage clickOnDocotorLink() {
        click(doctorId);
        return this;
    }
@FindBy(xpath = "//select[@name='doctorId']")
WebElement selectedDoctorId;
    public NewAppoinmentPage selectDoctor(String doctorName) {

            new Select(driver.findElement(By.name("doctorId"))).selectByVisibleText(doctorName);
            return this;
        }
@FindBy(css = ".form-check:nth-child(6) > .form-check-label")
WebElement checkbox;
    public NewAppoinmentPage clickOnTimeButton() {
        click(checkbox);
        return this;

    }

@FindBy(xpath = "//button[contains(.,'Save')]")
WebElement AppSaveButton;
    public NewAppoinmentPage clickOnAppointmentSaveButton() {
        click(AppSaveButton);
        return this;

    }
@FindBy(xpath = "//h1[contains(.,'My Appointments')]")
WebElement appointmentAll;
    public NewAppoinmentPage isAppointmentDisplayed() {
            assert isElementDisplayed(appointmentAll);
            return this;
    }
@FindBy(xpath = "//button[contains(.,'View')]")
WebElement viewButton;
    public NewAppoinmentPage clickOnViewButton() {
        click(viewButton);
        return this;

    }
    @FindBy(xpath = "//label[contains(.,'14:00:00 - 14:30:00')]")
    WebElement appointmentTime;
    public NewAppoinmentPage clickOnNewTimeLost() {
        click(appointmentTime);
        return this;
    }
    @FindBy(xpath = "//div[@id='root']/div/div/div/div[2]/div/div/div/div[2]/div[2]/div/table/tbody/tr/td[4]/button")
    WebElement canselButton;
    public NewAppoinmentPage clickOnCanselButton() {
        click(canselButton);
        return this;

    }
}

