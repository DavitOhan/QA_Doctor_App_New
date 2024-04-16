package com.doctorApp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {
    public RegistrationPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "formRegistrationFirstName")
    WebElement firstNameInput;
    @FindBy(id = "formRegistrationLastName")
    WebElement lastNameInput;
    @FindBy(id = "formRegistrationBasicEmail")
    WebElement newEmailInput;
    @FindBy(id = "formRegistrationPassword")
    WebElement newPasswordInput;
    public RegistrationPage enterNewData(String firstName, String lastName, String newEmail, String newPassword) {
        type(firstNameInput,firstName);
        type(lastNameInput,lastName);
        type(newEmailInput,newEmail);
        type(newPasswordInput,newPassword);
        return this;

    }
    @FindBy(css="button.w-100.my-2.btn.btn-danger")
    WebElement Submit;
    public RegistrationPage clickOnSingUpButton() {
        click(Submit);
            return this;
    }

    @FindBy( css="button.w-100.my-2.btn.btn-danger")
    WebElement UpcomingNewTitle;
    public RegistrationPage isUpcomingNewPageDisplayed() {
        assert isElementDisplayed(UpcomingNewTitle);
        return this;
    }
}
