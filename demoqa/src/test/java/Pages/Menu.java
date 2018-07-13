package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Menu {

    @FindBy(css = ".top-level > li:nth-child(5)")
    private WebElement li;


    public void liClicking(WebDriver driver) {
        Actions liclick = new Actions(driver);
        liclick.moveToElement(li).click().perform();
    }
}
