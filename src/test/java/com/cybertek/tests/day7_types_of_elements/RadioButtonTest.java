package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonTest {
    @Test
    public void radioButton(){


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement blueRadioButton = driver.findElement(By.id("blue"));
        WebElement redRadioButton= driver.findElement(By.id("red"));

        // how to check selected or not

        System.out.println("is blue selected "+ blueRadioButton.isSelected());
        System.out.println("is red selected "+ redRadioButton.isSelected());

        Assert.assertTrue(blueRadioButton.isSelected(),"verify that blue radio button is selected");
        Assert.assertFalse(redRadioButton.isSelected(),"verify that red radio button is not selected");


        redRadioButton.click();

        System.out.println("is blue selected "+ blueRadioButton.isSelected());
        System.out.println("is red selected "+ redRadioButton.isSelected());

        Assert.assertFalse(blueRadioButton.isSelected(),"verify that blue radio button is not selected");
        Assert.assertTrue(redRadioButton.isSelected(),"verify that red radio button is  selected");




        driver.quit();






    }


}
