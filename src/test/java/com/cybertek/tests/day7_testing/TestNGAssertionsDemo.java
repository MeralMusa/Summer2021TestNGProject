package com.cybertek.tests.day7_testing;

import org.testng.annotations.Test;
import org.testng.Assert;


public class TestNGAssertionsDemo {


   @Test
public void test1(){


       System.out.println("This is first Assertion");
       Assert.assertEquals(1,2);

       System.out.println("second assertion ");

       Assert.assertEquals("Title","Title");

       System.out.println("after second test");

   }

   @Test
    public void test2(){

       System.out.println("test two");
       //verify that title starts with C
       String actualTitle="Cybertek";
       String expectedTitleBeginning="B";


       System.out.println("first assertion");
       Assert.assertTrue(actualTitle.startsWith(expectedTitleBeginning),"Verify title  starts with C");
       //massage part comes by failed test, when pass you did not see the massage part

       String  actualEmail= "moussameral@icloud.com";
       String expectedEmail="%";
       Assert.assertTrue(actualEmail.contains(expectedEmail),"Verify Email contains @");
   }

   @Test
    public void test3(){
       System.out.println("test three");
       Assert.assertNotEquals("one","one");
       //for negative test cases

   }
    @Test
    public void test4(){
        System.out.println("test four");
       Assert.assertFalse(1<0);
       //searching for false condition. Test will be pass when the condition is false and false when the condition is true
    }
}
