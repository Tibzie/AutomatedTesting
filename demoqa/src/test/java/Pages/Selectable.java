package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Selectable {
    @FindBy(css = "#selectable > li:nth-child(2)")
    private WebElement select;

    public void clickLi(WebDriver driver) {
        Actions li = new Actions(driver);
        li.moveToElement(select).click().perform();
    }

}
