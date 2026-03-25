package com.ait.tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class FindDemoWebShopElement {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void findElementByCssSelector() {
        //register link
        driver.findElement(By.cssSelector("[href='/register']"));
        // search input
        driver.findElement(By.cssSelector("#small-searchterms"));
        driver.findElement(By.cssSelector(".top-menu [href='/books']"));


        driver.findElement(By.cssSelector("a[href='/141-inch-laptop']>img"));
        driver.findElement(By.cssSelector(".topic-html-content-header"));
        driver.findElement(By.cssSelector("[class$='window']"));
        driver.findElement(By.cssSelector("[class^='ajax']"));
        driver.findElement(By.cssSelector("[class*='popular']"));
        driver.findElement(By.cssSelector("#topcartlink"));
        driver.findElement(By.cssSelector(".block.block-category-navigation"));
        driver.findElement(By.cssSelector(".block.block-category-navigation:nth-child(1)"));
        driver.findElement(By.cssSelector(".inactive:nth-child(2)"));
        driver.findElement(By.cssSelector(".search-box-text.ui-autocomplete-input"));
        driver.findElement(By.cssSelector("#flyout-cart"));
        driver.findElement(By.cssSelector(".picture [href='/build-your-own-computer']>img"));
        driver.findElement(By.cssSelector(".picture > [href='/25-virtual-gift-card'] > img"));


    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
