package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


public class Droppable {

    @FindBy(id = "draggableview")
    private WebElement draggableRect;

    @FindBy(id = "droppableview")
    private WebElement droppableRect;

    public void dragAndDrop(WebDriver driver) {
        Actions dropping = new Actions(driver);
        dropping.dragAndDrop(draggableRect, droppableRect).perform();
    }
}
