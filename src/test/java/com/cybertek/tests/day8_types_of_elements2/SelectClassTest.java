package com.cybertek.tests.day8_types_of_elements2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SelectClassTest {

    @Test
    public void test1() throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");


        //1. locate the drobdown element with unique locators
        WebElement drobDownElement=driver.findElement(By.id("state"));

        Select statList = new Select(drobDownElement);
        //create select option by passing the element as a constructor

        List<WebElement>options =statList.getOptions();


        for (WebElement option : options) {

            System.out.println(option.getText());

        }

        WebElement firstOption=statList.getFirstSelectedOption();

        String actualOption =statList.getFirstSelectedOption().getText();


        System.out.println(firstOption.getText());

        System.out.println(actualOption);
        //

        String expectetOption="Select a State";

        Assert.assertEquals(actualOption,expectetOption,"Verify first selecttion is select a state");

       // How to select Option from dropdown
        //1. Using visible Text
        Thread.sleep(2000);
        statList.selectByVisibleText("Texas");

        String actualOption1 =statList.getFirstSelectedOption().getText();

        System.out.println(actualOption1);
        Assert.assertEquals(actualOption1,"Texas","Verify actual option is Texas");


        //2. Using by Index
        //total option-->52
      statList.selectByIndex(51);

     String  actualOption3 =statList.getFirstSelectedOption().getText();
        Assert.assertEquals(actualOption3,"Wyoming","Verify actual option is Wyoming");



        Thread.sleep(2000);
        //2. Using by Value

        statList.selectByValue("VA");
        System.out.println( statList.getFirstSelectedOption().getText());

        String actualOption4=statList.getFirstSelectedOption().getText();

        Assert.assertEquals(actualOption4,"Virginia","Verify actual option is Virginia");


        driver.quit();


    }
}