package com.ait.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstSeleniumTest {

    WebDriver driver;

    // before test
    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");                 // без истории
       // driver.navigate().to("https://www.google.com/");     // с историей
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
    }

    // test
    @Test
    public void openBrowser() {
        System.out.println("Google opened!!!");
    }

    // after test
    @AfterMethod (enabled = false)
    public  void  tearDown() {
        driver.quit();        // закрывает все вкладки и браузер
       // driver.close();     // закрывает только одну вкладку
    }

}
