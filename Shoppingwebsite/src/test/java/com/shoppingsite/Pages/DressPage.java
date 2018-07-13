package com.shoppingsite.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DressPage {
    @FindBy(xpath = "//*[@id='center_column']/ul/li[1]/div/div[1]/div/a[1]/img")
    private WebElement chosenDress;

    public void findDress() {
        chosenDress.click();
    }
}
