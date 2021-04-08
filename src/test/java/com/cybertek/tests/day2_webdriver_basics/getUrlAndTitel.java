package com.cybertek.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SourceType;

public class getUrlAndTitel {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.cybertekschool.com");
        //getTitle()--> get you the title of the page
        String title = driver.getTitle();
        //soutv
        System.out.println("title = " + title);
        //getCurrentUrl()--> gets the current url of the page
        String currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);
        //getPageSource() ->gets th source code of the pace
        String pageSource = driver.getPageSource();
        System.out.println("pageSource = " + pageSource);



    }
}
