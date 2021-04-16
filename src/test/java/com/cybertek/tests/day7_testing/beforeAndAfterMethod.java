package com.cybertek.tests.day7_testing;

import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class beforeAndAfterMethod {

    @Ignore
    @Test
    public void test1(){

        System.out.println("This is my test one");
    }

    @Test
    public void test2(){
        System.out.println("this is my second test");
    }
    @Test
    public void test3(){
        System.out.println("this is my third test");
    }
    @BeforeMethod
    public void setUpMethod(){
        System.out.println("Before Method");
        System.out.println("Opening the Browser");
    }
    @AfterMethod
    public void tearDown(){
        System.out.println("Close your browser");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("Before class code");
    }

    @AfterClass
    public void afterClass(){

        System.out.println("after class code");
        System.out.println("Reporting");
    }
}
