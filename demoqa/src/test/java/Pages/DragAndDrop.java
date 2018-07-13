package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class DragAndDrop {

    @FindBy(id = "draggable")
    private WebElement rect;


    public void DragRect(WebDriver driver) {
        Actions dragging = new Actions(driver);
        dragging.moveToElement(rect).clickAndHold().moveByOffset(300, 200).perform();
    }
}
