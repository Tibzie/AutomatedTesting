package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Sortable {

    @FindBy(css = "#sortable > li:nth-child(4)")
    private WebElement sortrect;

    @FindBy(css = "#sortable > li:nth-child(2)")
    private WebElement beforerect;

    public void sortingStuff(WebDriver driver) {
        Actions sorting = new Actions(driver);
        sorting.dragAndDrop(sortrect, beforerect).perform();
    }
}
