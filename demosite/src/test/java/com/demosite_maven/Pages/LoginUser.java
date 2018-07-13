package com.demosite_maven.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginUser {

    @FindBy(name = "username")
    private WebElement inputusername;

    @FindBy(name = "password")
    private WebElement inputpassword;

    @FindBy(name= "FormsButton2")
    private WebElement loginuserbtn;

    public void loginUserMethod(String user, String pass) {
        inputusername.sendKeys(user);
        inputpassword.sendKeys(pass);
        loginuserbtn.click();
    }
}
