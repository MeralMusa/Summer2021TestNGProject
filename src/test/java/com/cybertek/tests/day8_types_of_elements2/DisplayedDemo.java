package com.cybertek.tests.day8_types_of_elements2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisplayedDemo {


    @Test

            public void test1() throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/dynamic_loading/1");

        WebElement usernameInput = driver.findElement(By.id("username"));
        System.out.println(usernameInput.isDisplayed());
//      if you want to get true boolean value, than you have to locate and click the start button

        WebElement startButton = driver.findElement(By.xpath("(//button)[1]"));

        startButton.click();

        Thread.sleep(5000);



        //isDisplaed ()--> if the element is in the html code, but not displayed it
        //will return false. If displayed it will return true.


        System.out.println(usernameInput.isDisplayed());
        Assert.assertTrue(usernameInput.isDisplayed(),"Verify that username inputbox is displayed");

        driver.quit();

    }



}

