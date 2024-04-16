package com.doctorApp.stepDefinitions;
import com.doctorApp.pages.DownloadPhotoPage;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;

import static com.doctorApp.pages.BasePage.driver;
public class DownloadPhotoSteps {

   @And("User download new Photo")
   public void upload_pictures() {
      new DownloadPhotoPage(driver).uploadPictures("/Users/davithovanesyan/Downloads/Clients.jpeg");
   }


}
