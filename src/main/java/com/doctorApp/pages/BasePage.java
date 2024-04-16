package com.doctorApp.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;


public abstract class BasePage {

   public static WebDriver driver;

    public BasePage(WebDriver driver) {
        BasePage.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void launchBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public void openUrl(){
        driver.get("http://92.51.46.142/");
    }

    public void click(WebElement element) {
        element.click();
    }

    public void type(WebElement element, String text) {
        if (text != null) {
            click(element);
            element.clear();
            element.sendKeys(text);
        }
    }

    public boolean isElementDisplayed(WebElement element) {
        return element.isDisplayed();
    }

    public void quit() {
        driver.quit();
    }


    public void scroll( WebElement element) {
        new Actions(driver)
                .scrollToElement(element)
                .perform();
    }


    public void waitForMilliseconds(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}


