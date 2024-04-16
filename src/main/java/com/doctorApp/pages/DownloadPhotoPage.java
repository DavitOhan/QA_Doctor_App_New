package com.doctorApp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DownloadPhotoPage extends BasePage {
    public DownloadPhotoPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id ="photoFile")
    WebElement Pictures;
    public DownloadPhotoPage uploadPictures(String path) {

        Pictures.sendKeys(path);
        return this;
    }
    }

