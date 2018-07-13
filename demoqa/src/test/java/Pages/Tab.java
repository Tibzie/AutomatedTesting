package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Tab {

    @FindBy(id = "ui-id-2")
    private WebElement tab;

    public void TabTab(WebDriver driver) {
        Actions tabulator = new Actions(driver);
        tabulator.moveToElement(tab).click().perform();
    }
}
