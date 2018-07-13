package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Resizable {

    @FindBy(className = "ui-resizable-handle")
    private WebElement arrow;


    public void resizingArrow(WebDriver driver) {
        Actions resizer = new Actions(driver);
        resizer.moveToElement(arrow).clickAndHold().moveByOffset(300, 0).perform();
    }
}
