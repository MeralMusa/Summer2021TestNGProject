package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyConfirmationMassage {

    public static void main(String[] args) {
    /*    Verify confirmation message
        open browser
        go to http://practice.cybertekschool.com/forgot_passwordLinks zu einer externen Website
        enter any email
        verify that email is displayed in the input box
        click on Retrieve password
        verify that confirmation message says 'Your e-mail's been sent!'*/

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement emailImput =driver.findElement(By.name("email"));

        String expectedEmail="meralmoussa@icloud.com";
        emailImput.sendKeys("meralmoussa@icloud.com");
        //verify that email is displayed in the input box
        //

       String actualEmail= emailImput.getAttribute("value");
       if (actualEmail.equals(expectedEmail)){
           System.out.println("Pass");

       }else {
           System.out.println("fail");
           System.out.println("expectedEmail= "+expectedEmail);
           System.out.println("actualEmail= "+ actualEmail);
       }

       WebElement retrievePasswordButton=driver.findElement(By.id("form_submit"));
       retrievePasswordButton.click();

       String expectedMessage="Your e-mail's been sent!";

       WebElement confirmationMassage =driver.findElement(By.name("confirmation_massage"));

      String actualConfirmationMassage= confirmationMassage.getText();

               if(expectedMessage.equals(actualConfirmationMassage)){

                   System.out.println("Pass");
               }else{
                   System.out.println("fail");
                   System.out.println("actualConfirmationMassage= "+ actualConfirmationMassage);
                   System.out.println("expectedMassage= "+expectedMessage);
               }

               driver.quit();
    }

}
