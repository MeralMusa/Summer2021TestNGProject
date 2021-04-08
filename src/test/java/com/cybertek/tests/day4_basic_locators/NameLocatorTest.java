package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NameLocatorTest {

    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement fullnameInput=driver.findElement(By.name("full_name"));

        fullnameInput.sendKeys("Musa Meral");
        WebElement emailInput=driver.findElement(By.name("email"));

        emailInput.sendKeys("musameral33@gmail.com");

        WebElement signUpButton=driver.findElement(By.name("wooden_spoon"));

        signUpButton.click();
        WebElement messageElement = driver.findElement(By.name("signup_message"));
        String actualMessage = messageElement.getText();

        String expectedMassage="Thank you for signing up. Click the button below to return to the home page.";

        if (expectedMassage.equals(actualMessage)){
            System.out.println("PASS");
        }else{

            System.out.println("FAIL");
            System.out.println("expectedMassage="+expectedMassage);
            System.out.println("actualMassage"+ actualMessage);
        }
    }
}
