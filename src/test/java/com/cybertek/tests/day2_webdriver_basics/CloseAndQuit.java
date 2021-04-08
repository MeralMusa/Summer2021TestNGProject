package com.cybertek.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CloseAndQuit {

    public static void main(String[] args) throws InterruptedException {
            WebDriverManager.firefoxdriver().setup();
            WebDriver driver = new FirefoxDriver();
            driver.get("https://practice.cybertekschool.com");
            Thread.sleep(3000);
            //close()-->closes the current tab
            driver.close();
            driver= new FirefoxDriver();
            driver.get("http://practice.cybertekschool.com/open_new_tab");
            Thread.sleep(5000);
            //quit()-> close all open windows and tabs and pop ups etc.
            driver.quit();
    }
}
