package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyURLChanged {


    public static void main(String[] args) {

 /*       Verify URL changed
        open browser
        go to http://practice.cybertekschool.com/forgot_passwordLinks zu einer externen Website
        enter any email
        click on Retrieve password
        verify that url changed to http://practice.cybertekschool.com/email_sent */

        WebDriver driver=WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement emailImput=driver.findElement(By.name("email"));
        //Sendkeys()---> send keyboard actions to webelement/enters given text
        emailImput.sendKeys("email@gmail.com");

        WebElement retrievPasswordButton = driver.findElement(By.id("form_submit"));

        retrievPasswordButton.click();

        String expectedURL= "http://practice.cybertekschool.com/email_sent";
        String actualURL = driver.getCurrentUrl();

        if (expectedURL.equals((actualURL))){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
            System.out.println("expectedURL ="+expectedURL);
            System.out.println("actualURL ="+actualURL);
        }

        driver.quit();
    }
}
