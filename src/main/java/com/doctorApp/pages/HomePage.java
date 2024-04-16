package com.doctorApp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".banner-content > h2")
    WebElement title;

    public HomePage isHomePageTitleDisplayed() {
        assert isElementDisplayed(title);
        return this;
    }
@FindBy(css = ".p-3:nth-child(1) > strong")
WebElement SingInLink;
    public LoginPage clickOnSingInLink() {
        click(SingInLink);
        return new LoginPage(driver);
    }
@FindBy(xpath="//div[@id='responsive-navbar-nav']/div/div[2]/strong")
WebElement SingUpLink;
    public HomePage clickOnSingUpLink() {
        click(SingUpLink);
        return new HomePage(driver);
    }
}
