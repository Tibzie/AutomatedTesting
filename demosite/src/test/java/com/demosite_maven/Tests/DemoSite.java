package com.demosite_maven.Tests;


import com.demosite_maven.Constants.Constant;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import com.demosite_maven.Pages.Home;
import com.demosite_maven.Pages.AddUser;
import com.demosite_maven.Pages.LoginUser;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class DemoSite {
    ExtentReports extent;
    ChromeDriver driver;

    @Before
    public void setUp() {
        // specifying we want to use CHROME drive and adding absolute path of this driver
        System.setProperty("webdriver.chrome.driver", Constant.DRIVER_PATH);
        // instantiating the driver
        driver = new ChromeDriver();
        extent = new ExtentReports(Constant.REPORT_PATH, true);
    }


    @Test
    public void DDT() throws IOException, InterruptedException {
        FileInputStream file = new FileInputStream(Constant.SPREADSHEET_PATH);
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheetAt(0);



        for(int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
            Cell username = sheet.getRow(i).getCell(0);
            Cell password = sheet.getRow(i).getCell(1);

            String user = username.getStringCellValue();
            String pass = password.getStringCellValue();

            driver.navigate().to(Constant.WEBSITE_URL);


            Home home = PageFactory.initElements(driver, Home.class);

            home.clickAdd();
            AddUser add = PageFactory.initElements(driver, AddUser.class);
            add.addUserMethod(user, pass);

            home.clickLogin();
            LoginUser login = PageFactory.initElements(driver, LoginUser.class);
            login.loginUserMethod(user, pass);
        }


        for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
            Cell username = sheet.getRow(i).getCell(0);
            Cell password = sheet.getRow(i).getCell(1);

            String user = username.getStringCellValue();
            String pass = password.getStringCellValue();

            ExtentTest test = extent.startTest("Testing of registration and login features.");
            test.log(LogStatus.INFO, "Opened the website.");
            try {

                assertEquals("**Successful Login**", driver.findElementByXPath(Constant.SUCCESS).getText());
                test.log(LogStatus.PASS, "It logged in successfully with the newly created account.");
                assertEquals(user, username.getStringCellValue());
                test.log(LogStatus.INFO, "Username: " + user);
                assertEquals(pass, password.getStringCellValue());
                test.log(LogStatus.INFO, "Password: " + pass);
            } catch (AssertionError e) {
                test.log(LogStatus.FAIL, "It failed.");
                fail();
            } finally {
                extent.endTest(test);
                extent.flush();
            }
        }


    }


    @After
    public void tearDown() {
        driver.quit();
    }
}
