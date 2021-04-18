package com.cybertek.tests.day8_types_of_elements2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AttributeTest {


    @Test
    public void test1(){

        WebDriver driver = WebDriverFactory.getDriver("chrome");


        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement radioButton = driver.findElement(By.id("blue"));

        System.out.println(radioButton.getAttribute("name"));
        System.out.println(radioButton.getAttribute("id"));
        System.out.println(radioButton.getAttribute("href"));
        System.out.println(radioButton.getAttribute("type"));


        // attribute without value (checked) --> its returning boolean if it is checked
        System.out.println(radioButton.getAttribute("checked"));


        // "outerHTML" returns full html of that element
        System.out.println(radioButton.getAttribute("outerHTML"));

        // "innerHTML" 3rd way getting text
        //System.out.println(radioButton.getAttribute("innerHTML"));


        driver.quit();
    }
}
