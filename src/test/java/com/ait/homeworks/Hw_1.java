package com.ait.homeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Hw_1 {
    WebDriver driver;

    @BeforeMethod
    public void setUp () {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void findElementByTagName() {
        WebElement element = driver.findElement(By.tagName("h2"));
        System.out.println(element.getText());

        List<WebElement> elements = driver.findElements(By.tagName("a"));
        System.out.println(elements.size());

    }

    @Test
    public void findElementByClassName() {
        WebElement element1 = driver.findElement(By.className("master-wrapper-page"));
        System.out.println(element1.getDomAttribute("class"));

        List<WebElement> search = driver.findElements(By.className("product-title"));
        System.out.println(search.size());

        WebElement news = driver.findElement(By.className("topic-html-content-header"));
        System.out.println(news.getText());
    }

    @Test
    public void findElementById(){
        WebElement webElement = driver.findElement(By.id("dialog-notifications-success"));
        System.out.println(webElement.getDomAttribute("id"));

        List<WebElement> elementList = driver.findElements(By.id("bar-notification"));
        System.out.println(elementList.size());

    }

    @AfterMethod (enabled = false)
    public void tearDown() {
        driver.quit();
    }


    @Test
    public void findElementByLinkText() {
        WebElement linkText = driver.findElement(By.linkText("Computers"));
        System.out.println(linkText.getText());

        WebElement linkText2 = driver.findElement(By.linkText("Apparel & Shoes"));
        System.out.println(linkText2.getText());
    }

    @Test
    public void findElementByPartialLinkText() {
        WebElement partialLinkText = driver.findElement(By.partialLinkText("products"));
        System.out.println(partialLinkText.getText());

        List<WebElement> partialLinkText1 = driver.findElements(By.partialLinkText("products"));
        System.out.println(partialLinkText1.size());

        WebElement partialLinkText2 = driver.findElement(By.partialLinkText("Compare"));
        System.out.println(partialLinkText2.getText());



    }



}
