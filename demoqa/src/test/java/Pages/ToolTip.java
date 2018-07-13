package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ToolTip {

    @FindBy(id = "age")
    private WebElement box;

    public void clickBox(WebDriver driver) {
        Actions tool = new Actions(driver);
        tool.moveToElement(box).perform();
    }
}
