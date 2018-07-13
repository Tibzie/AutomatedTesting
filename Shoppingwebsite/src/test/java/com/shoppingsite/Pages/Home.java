package com.shoppingsite.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home {
    private String dress = "dress";
    @FindBy(id = "search_query_top")
    private WebElement searchBar;


    public void searchDress() {
        searchBar.sendKeys(dress);
        searchBar.submit();
    }



}
