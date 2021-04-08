package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LinkTextAndPartialLinkText {

    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //navigate to website
        driver.get("http://practice.cybertekschool.com/dynamic_loading");
        String linkDummy="Example 1: Element on page that is hidden and become visible after trigger";

        WebElement link3=driver.findElement(By.linkText(linkDummy));
          link3.click();
        //lazy way of clicking home
        //partial link text
        driver.get("http://practice.cybertekschool.com/dynamic_loading");

        WebElement link6=driver.findElement(By.partialLinkText("6"));


        link6.click();
    }
}
