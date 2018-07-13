package com.demosite_maven.Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddUser {

    @FindBy(name = "username")
    private WebElement inputusername;

    @FindBy(name = "password")
    private WebElement inputpassword;

    @FindBy(name = "FormsButton2")
    private WebElement adduserbtn;

    public void addUserMethod(String user, String pass) {
        inputusername.sendKeys(user);
        inputpassword.sendKeys(pass);
        adduserbtn.click();
    }

}
