package com.shoppingsite.Tests;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.shoppingsite.Pages.DressPage;
import com.shoppingsite.Pages.Home;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.*;

public class ShoppingWebsite {
    ExtentReports extent;
    ChromeDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Laptop\\IdeaProjects\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void lookForStuff() {
        String url = "http://automationpractice.com/index.php";
        String summerdress = "//*[@id='center_column']/div/div/div[3]/h1";


        driver.manage().window().maximize();
        driver.navigate().to(url);

        Home home = PageFactory.initElements(driver, Home.class);
        home.searchDress();

        DressPage dress = PageFactory.initElements(driver, DressPage.class);
        dress.findDress();

//
//        ExtentTest test = extent.startTest("Testing search feature");
//        try {
//            test.log(LogStatus.INFO, "Opened the website.");
//            assertEquals("Printed Summer Dress", driver.findElementByXPath(summerdress).getText());
//            test.log(LogStatus.INFO, "Curent URL: " + driver.getCurrentUrl());
//        } catch (AssertionError e) {
//            test.log(LogStatus.FAIL, "It failed.");
//            fail();
//        } finally {
//            extent.endTest(test);
//            extent.flush();
//        }

    }


    @After
    public void tearDown() {
        driver.close();
    }

}
