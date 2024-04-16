package com.doctorApp.pages;

import io.cucumber.datatable.DataTable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Map;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }
@FindBy(id = "formLoginEmail")
 WebElement emailInput;
@FindBy(id = "formLoginPassword")
 WebElement passwordInput;
    public LoginPage enterData(String email, String password) {
        type(emailInput,email);
        type(passwordInput,password);
        return this;
    }
@FindBy(css = ".w-100")
WebElement submit;
    public LoginPage clickOnSingInButton() {
        click(submit);
        return this;
    }
@FindBy(xpath = "//h2[contains(.,'Upcoming Appointments')]")
WebElement UpcomingTitle;
    public LoginPage isUpcomingPageDisplayed() {
        assert isElementDisplayed(UpcomingTitle);
        return this;
    }

    public LoginPage enterInvalidPassword(DataTable dataTable) {
        List<Map<String,String>> table=dataTable.asMaps();
        String email = table.get(0).get("email");
        String password = table.get(0).get("password");
        enterData(email,password);
        return this;
    }
@FindBy(css = ".error-text > .my-3")
WebElement errorMessage;
    public LoginPage IsErrorDisplayed() {
        assert isElementDisplayed(errorMessage);
        return this;

    }
@FindBy(xpath = "//a[contains(text(),'Profile')]")
WebElement profileButton;
    public LoginPage clicksOnProfileLink() {
        click(profileButton);
        return this;
    }
}
