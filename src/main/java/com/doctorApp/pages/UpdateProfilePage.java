package com.doctorApp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpdateProfilePage extends BasePage {
    public UpdateProfilePage(WebDriver driver) {
        super(driver);
    }


@FindBy(xpath = "//input[@id='formPhone']")
WebElement phoneNumber;
    public UpdateProfilePage clicksOnPhoneLink() {
       click(phoneNumber);
        return this;

    }

    public UpdateProfilePage entersValidNumber() {
        phoneNumber.sendKeys("1234567890");
        return this;
    }


@FindBy(xpath = "//textarea[@id='formAddress']")
WebElement address;
public UpdateProfilePage clicksOnAdressLink() {
   click(address);
   return this;
    }



    public UpdateProfilePage entersValidAdress() {
    address.sendKeys(
            "Berlin" +
            "12435" +
            " Main Strasse 43" );

    return this;
    }


@FindBy(css =".btn-primary:nth-child(1)")
WebElement saveUserButton;
public UpdateProfilePage clicksOnSaveInfo() {
    waitForMilliseconds(2000);
    scroll(saveUserButton);
    click(saveUserButton);
    return this;
    }



@FindBy(xpath = "//div[2]/div/div/div/div")
WebElement profile;
    public UpdateProfilePage isUpdatePageDisplayed() {
        assert isElementDisplayed(profile);
        return this;


    }
}

